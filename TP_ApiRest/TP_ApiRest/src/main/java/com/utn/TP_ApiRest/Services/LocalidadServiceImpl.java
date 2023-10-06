package com.utn.TP_ApiRest.Services;

import com.utn.TP_ApiRest.Entities.Localidad;
import com.utn.TP_ApiRest.Repositories.BaseRepository;
import com.utn.TP_ApiRest.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }
}
