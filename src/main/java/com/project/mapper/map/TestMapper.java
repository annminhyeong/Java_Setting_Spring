package com.project.mapper.map;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	
	//�׽�Ʈ
	List<String> testSelect();
}
