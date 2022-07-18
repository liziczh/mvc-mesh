package com.liziczh.mvc.mesh.service.repository.impl;

import com.liziczh.base.common.exception.BizErrorException;
import com.liziczh.base.common.util.JsonUtils;
import com.liziczh.mvc.mesh.dao.mapper.TDemoMapper;
import com.liziczh.mvc.mesh.dao.po.DemoPO;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.convertor.DemoInfoConvertor;
import com.liziczh.mvc.mesh.service.repository.DemoTxRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Demo事务资源层实现
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
@Slf4j
@Repository
public class DemoTxRepositoryImpl implements DemoTxRepository {

    @Autowired
    private TDemoMapper demoMapper;

    @Autowired
    private DemoInfoConvertor demoInfoConvertor;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(DemoBO bo) {

        // toPO
        DemoPO po = demoInfoConvertor.toPO(bo);

        // insert
        int result = demoMapper.insert(po);
        if (result != 1) {
            log.error("DemoTxRepositoryImpl.insert, error, po={}, resul={}", JsonUtils.toJson(po), result);
            throw new BizErrorException("DemoQueryRepositoryImpl.insert, error");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(DemoBO bo) {

        // toPO
        DemoPO po = demoInfoConvertor.toPO(bo);

        int result = demoMapper.updateById(po);
        if (result != 1) {
            log.error("DemoTxRepositoryImpl.update, error, po={}, resul={}", JsonUtils.toJson(po), result);
            throw new BizErrorException("DemoQueryRepositoryImpl.update, error");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long demoId) {

        DemoPO po = DemoPO.builder().demoId(demoId).build();

        // delete
        int result = demoMapper.deleteById(po);
        if (result != 1) {
            log.error("DemoTxRepositoryImpl.deleteById, error, po={}, resul={}", JsonUtils.toJson(po), result);
            throw new BizErrorException("DemoQueryRepositoryImpl.deleteById, error");
        }

    }
}
