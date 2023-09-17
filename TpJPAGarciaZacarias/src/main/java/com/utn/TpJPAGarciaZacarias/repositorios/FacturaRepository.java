package com.utn.TpJPAGarciaZacarias.repositorios;

import org.springframework.stereotype.Repository;


import com.utn.TpJPAGarciaZacarias.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
