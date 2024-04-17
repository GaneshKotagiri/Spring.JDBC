package com.chopchop.springjdbc.repository;

import com.chopchop.springjdbc.entity.Entities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository  {
    private JdbcTemplate jdbc;
    public void save(Entities entity) {
        String sql= "insert into students (Id, Name, Marks) values (?,?,?)";
        int rows = jdbc.update(sql,entity.getId(),entity.getName(),entity.getMarks());
        System.out.println(rows+ " and The data has changed!");
    }

    public List<Entities> findALl() {
        String sql="select * from students";
        RowMapper<Entities> map=new RowMapper<Entities>() {
            @Override
            public Entities mapRow(ResultSet rs, int rowNum) throws SQLException {
                Entities entity=new Entities();
                entity.setId(rs.getInt("Id"));
                entity.setName(rs.getString("Name"));
                entity.setMarks(rs.getInt("Marks"));
                return entity;
            }
        };
        return jdbc.query(sql,map);
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
