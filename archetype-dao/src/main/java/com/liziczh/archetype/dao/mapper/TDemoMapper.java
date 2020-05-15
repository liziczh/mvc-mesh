package com.liziczh.archetype.dao.mapper;

import org.springframework.stereotype.Repository;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.base.common.repository.BaseRepository;

@Repository
public interface TDemoMapper extends BaseRepository<TDemo, Integer> {
}
