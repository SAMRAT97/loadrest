package com.loadrest.loadrest.services;

import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loadrest.loadrest.dao.LoadDao;
import com.loadrest.loadrest.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private LoadDao loadDao;


	
	public LoadServiceImpl() {
		
	
	}
	
	public List<Load> getloads() {
		
		return loadDao.findAll();
	}


	@Override
	public Load addLoad(Load load) {

		loadDao.save(load);
		return load ;
	}

	@Override
	public Load updateLoad(Load load) {
		loadDao.save(load);
		return load;
	}

	@Override
	public void deleteLoad(long loadLoadId) {
		 Load entity = loadDao.getById(loadLoadId);
		 loadDao.delete(entity);
	}

	
	@Override
	public Load getloadid(long loadLoadId) {

		
		return loadDao.getById(loadLoadId);

	}

	public List<Load> getLoadByShipperIDUsingJPQL(long shipperId) {
		{
			return loadDao.getLoadByShipperIDUsingJPQL(shipperId);
		}
	}

	

	
	



	
	
	
	 

}
