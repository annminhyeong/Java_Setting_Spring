package com.project.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mapper.map.TestMapper;
import com.project.service.ITestService;

@Service
public class TestService implements ITestService {
	
	@Autowired
	private TestMapper testmapper;

	@Override
	public List<String> testSelect() {
		
		return testmapper.testSelect();
	}

}
