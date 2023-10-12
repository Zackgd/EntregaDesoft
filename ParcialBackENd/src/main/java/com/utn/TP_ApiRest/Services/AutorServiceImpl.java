package com.utn.TP_ApiRest.Services;

import com.utn.TP_ApiRest.Entities.Autor;
import com.utn.TP_ApiRest.Repositories.AutorRepository;
import com.utn.TP_ApiRest.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {super(baseRepository);
    }

}
