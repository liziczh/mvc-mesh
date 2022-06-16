package com.liziczh.mvc.mesh.service.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liziczh.base.api.condition.PageCondition;
import com.liziczh.base.api.condition.SortCondition;
import com.liziczh.base.common.enums.DeletedEnum;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.dao.mapper.TDemoMapper;
import com.liziczh.mvc.mesh.dao.po.DemoPO;
import com.liziczh.mvc.mesh.service.bo.DemoBO;
import com.liziczh.mvc.mesh.service.convertor.DemoPOConvertor;
import com.liziczh.mvc.mesh.service.repository.DemoRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * Demo资源层实现
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
@Slf4j
@Repository
public class DemoRepositoryImpl implements DemoRepository {

    @Autowired
    private TDemoMapper demoMapper;

    @Autowired
    private DemoPOConvertor demoPOConvertor;

    @Override
    public List<DemoBO> selectByCondition(DemoQueryReq condition) {

        // select
        PageCondition pageCondition = condition.getPage();
        List<SortCondition> sortConditionList = condition.getSortList();
        QueryWrapper<DemoPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(DemoPO::getName, condition.getName())
                .ge(DemoPO::getCreateTime, condition.getStartTime())
                .lt(DemoPO::getCreateTime, condition.getEndTime())
                .eq(DemoPO::getDeleted, DeletedEnum.NORMAL.getCode());
        for (SortCondition sortCondition : sortConditionList) {
            queryWrapper.orderByDesc(sortCondition.getColumnName());
        }
        Page<DemoPO> demoPage = demoMapper.selectPage(new Page<>(pageCondition.getPageNo(), pageCondition.getSize()),
                queryWrapper);
        List<DemoPO> poList = demoPage.getRecords();

        // toBO
        List<DemoBO> boList = demoPOConvertor.toBOList(poList);

        return boList;
    }

    @Override
    public DemoBO get(Long id) {

        // select
        DemoPO po = demoMapper.selectById(id);

        // toBO
        DemoBO bo = demoPOConvertor.toBO(po);

        return bo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(DemoBO bo) {

        // toPO
        DemoPO po = demoPOConvertor.toPO(bo);

        // insert
        int insert = demoMapper.insert(po);
        if (insert != 1) {
            throw new RuntimeException("DemoRepositoryImpl.insert, error");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(DemoBO bo) {

        // toPO
        DemoPO po = demoPOConvertor.toPO(bo);

        int update = demoMapper.updateById(po);
        if (update != 1) {
            throw new RuntimeException("DemoRepositoryImpl.update, error");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long id) {

        // delete
        int delete = demoMapper.deleteById(id);

        if (delete != 1) {
            throw new RuntimeException("DemoRepositoryImpl.deleteById, error");
        }

    }
}
