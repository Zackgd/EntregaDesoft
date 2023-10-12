package com.utn.TP_ApiRest.Repositories;

import com.utn.TP_ApiRest.Entities.Persona;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Anotacion Metodo QUERY
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre,String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, org.springframework.data.domain.Pageable pageable);

    boolean existsByDni(int dni);

    // JPQL para indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, org.springframework.data.domain.Pageable pageable);

    @Query(
            value ="SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);


    @Query(
            value ="SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
