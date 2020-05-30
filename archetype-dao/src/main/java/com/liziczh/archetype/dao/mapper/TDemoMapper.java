package com.liziczh.archetype.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.base.common.repository.BaseRepository;

@Repository
@Mapper
public interface TDemoMapper extends BaseRepository<TDemo, Integer> {
	/**
	 * 查询全部数据
	 * @return
	 */
	List<TDemo> getAll();
}
