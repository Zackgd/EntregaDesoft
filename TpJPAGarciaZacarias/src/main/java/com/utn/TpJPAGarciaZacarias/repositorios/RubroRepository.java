package com.utn.TpJPAGarciaZacarias.repositorios;

import com.utn.TpJPAGarciaZacarias.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RubroRepository extends JpaRepository<Rubro,Long> {
}
