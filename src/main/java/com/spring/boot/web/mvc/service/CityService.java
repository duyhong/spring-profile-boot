package com.spring.boot.web.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.web.mvc.dao.entity.CityEntity;
import com.spring.boot.web.mvc.repository.CityDaoRepository;

@Service("CityService")
public class CityService implements ICityService {

	/*@Autowired //byTpe , @Qualifier , byName
	@Qualifier("CityHibernateDao")
	private ICityDao cityDao;*/
	@Autowired
	private CityDaoRepository cityDaoRepository;
	
	@Override
	public List<String> findCities(){
		List<CityEntity> cityEntities=cityDaoRepository.findAll();
		List<String>  list=new ArrayList<>();
		for(CityEntity cityEntity:cityEntities){
			list.add(cityEntity.getCityname());
		}
		return list;
	}

}
