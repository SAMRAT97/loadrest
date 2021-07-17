package com.loadrest.loadrest.services;

import java.util.List;

import com.loadrest.loadrest.entities.Load;



public interface LoadService {
	
	public List<Load>getloads();

	public Load addLoad(Load load);

	public void deleteLoad(long loadLoadId);

	public Load getloadid(long loadLoadId);
	
	public List <Load> getLoadByShipperIDUsingJPQL(long shipperId );

	public Load updateLoad(Load load);
	
	

}
 