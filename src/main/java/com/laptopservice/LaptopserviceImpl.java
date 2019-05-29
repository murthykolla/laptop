package com.laptopservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.laptopdao.Laptopdao;
import com.laptopinfo.Laptop;

@Service
@Transactional(readOnly = true)
public class LaptopserviceImpl implements LaptopService {

	@Autowired
	Laptopdao laptopDao;

	public List<Laptop> getlaptop() {
		return laptopDao.getlaptop();
	
	}
}

