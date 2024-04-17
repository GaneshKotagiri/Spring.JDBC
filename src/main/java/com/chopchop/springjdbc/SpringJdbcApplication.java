package com.chopchop.springjdbc;

import com.chopchop.springjdbc.entity.Entities;
import com.chopchop.springjdbc.repository.Repository;
import com.chopchop.springjdbc.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
        Entities entity=context.getBean(Entities.class);
        entity.setId(4);
        entity.setName("Sanju");
        entity.setMarks(96);
        Service service=context.getBean(Service.class);
        service.addTasks(entity);
        List<Entities> info=service.getEntity();
        Repository repo=context.getBean(Repository.class);
        System.out.println(repo.findALl());

    }
}
