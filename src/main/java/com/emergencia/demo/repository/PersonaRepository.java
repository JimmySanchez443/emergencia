package com.emergencia.demo.repository;

import com.emergencia.demo.modelo.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona,String> {
}
