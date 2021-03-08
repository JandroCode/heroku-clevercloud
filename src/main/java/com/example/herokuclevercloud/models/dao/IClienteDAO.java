package com.example.herokuclevercloud.models.dao;

import com.example.herokuclevercloud.models.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends JpaRepository<Cliente,Long> {
    
}
