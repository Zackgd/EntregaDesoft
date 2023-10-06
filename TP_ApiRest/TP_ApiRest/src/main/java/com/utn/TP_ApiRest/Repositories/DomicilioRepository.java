package com.utn.TP_ApiRest.Repositories;

import com.utn.TP_ApiRest.Entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
