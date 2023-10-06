package com.utn.TP_ApiRest.Repositories;

import com.utn.TP_ApiRest.Entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
