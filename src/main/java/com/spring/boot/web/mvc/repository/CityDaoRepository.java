package com.spring.boot.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.web.mvc.dao.entity.CityEntity;

/**
 * 
 * @author Nagendra
 *
 */

@Repository("CityDaoRepository")
public interface CityDaoRepository extends  JpaRepository<CityEntity, Integer> {

}
