package com.springproject.springprojectapi.repository;

import com.springproject.springprojectapi.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRespository extends JpaRepository<Client, Long> {

}
