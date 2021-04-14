package com.example.spring.userservice;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.entitty.Zip;

public class userserviceImpl implements userservice {
   List<Zip> list;
   
   public userserviceImpl() {
	   list=new ArrayList();
	   list.add(new Zip(99501,"AK","ANCHORAGE","US"));
	   list.add(new Zip(11155, "bundi", "rajasthan", "india"));
   }
	@Override
	public Zip getZip(long parseLong) {
		Zip z=null;
		for(Zip zip:list) {
		if(zip.getZip()==parseLong)
		{
			z=zip;
			break;
		}
		}
		
		return z;
	}

}
