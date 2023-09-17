package com.utn.TpJPAGarciaZacarias.repositorios;

import com.utn.TpJPAGarciaZacarias.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
