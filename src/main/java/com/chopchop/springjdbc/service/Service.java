package com.chopchop.springjdbc.service;

import com.chopchop.springjdbc.entity.Entities;
import com.chopchop.springjdbc.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private Repository repo;
    public void addTasks(Entities entity) {
        System.out.println("This is the add task method in Service");
        repo.save(entity);
    }

    public Repository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(Repository repo) {
        this.repo = repo;
    }

    public List<Entities> getEntity() {
        return repo.findALl();
    }
}
