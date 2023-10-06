package com.utn.TP_ApiRest.Repositories;

import com.utn.TP_ApiRest.Entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;


public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
