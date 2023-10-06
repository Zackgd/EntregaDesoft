package com.utn.TP_ApiRest.Services;

import com.utn.TP_ApiRest.Entities.Persona;
import com.utn.TP_ApiRest.Repositories.BaseRepository;
import com.utn.TP_ApiRest.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
