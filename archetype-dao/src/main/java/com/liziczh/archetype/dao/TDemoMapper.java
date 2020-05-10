package com.liziczh.archetype.dao;

import org.springframework.stereotype.Repository;

import com.liziczh.archetype.api.entity.TDemo;

@Repository
public interface TDemoMapper {
	TDemo getDemoById(Integer id);
}
