package com.utn.TpJPAGarciaZacarias.repositorios;

import com.utn.TpJPAGarciaZacarias.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
