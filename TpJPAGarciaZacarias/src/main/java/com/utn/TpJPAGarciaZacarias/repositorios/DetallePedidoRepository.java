package com.utn.TpJPAGarciaZacarias.repositorios;

import com.utn.TpJPAGarciaZacarias.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DetallePedidoRepository extends JpaRepository<DetallePedido,Long> {
}
