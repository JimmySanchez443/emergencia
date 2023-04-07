package com.emergencia.demo.repository;

import com.emergencia.demo.modelo.Emergencia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergenciaRepository extends MongoRepository<Emergencia,String> {


}
