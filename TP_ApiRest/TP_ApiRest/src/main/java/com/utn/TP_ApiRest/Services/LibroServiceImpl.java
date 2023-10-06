package com.utn.TP_ApiRest.Services;

import com.utn.TP_ApiRest.Entities.Libro;
import com.utn.TP_ApiRest.Repositories.BaseRepository;
import com.utn.TP_ApiRest.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired(required = true)
    private LibroRepository libroRepositoryRepository;
    public  LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository ) {
        super((baseRepository));
        this.libroRepositoryRepository = libroRepository;
    }

}

