package com.utn.TP_ApiRest.Services;

import com.utn.TP_ApiRest.Entities.Domicilio;
import com.utn.TP_ApiRest.Repositories.BaseRepository;
import com.utn.TP_ApiRest.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepositoryRepository;
    public  DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository ) {
        super((baseRepository));;
        this.domicilioRepositoryRepository = domicilioRepository;
    }

}
