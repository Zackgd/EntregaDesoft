package com.utn.TpJPAGarciaZacarias.repositorios;

import com.utn.TpJPAGarciaZacarias.entidades.Pedido;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
