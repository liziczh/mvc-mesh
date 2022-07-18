package com.liziczh.mvc.mesh.service.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liziczh.base.api.condition.SortCondition;
import com.liziczh.base.common.enums.DeletedEnum;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.dao.mapper.TDemoMapper;
import com.liziczh.mvc.mesh.dao.po.DemoPO;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.convertor.DemoInfoConvertor;
import com.liziczh.mvc.mesh.service.repository.DemoQueryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
public class DemoQueryRepositoryImpl implements DemoQueryRepository {

    @Autowired
    private TDemoMapper demoMapper;

    @Autowired
    private DemoInfoConvertor demoInfoConvertor;

    @Override
    public List<DemoBO> selectByCondition(DemoQueryReq condition) {

        // select
        QueryWrapper<DemoPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().like(DemoPO::getName, condition.getName())
                .ge(DemoPO::getCreateTime, condition.getStartTime())
                .lt(DemoPO::getCreateTime, condition.getEndTime())
                .eq(DemoPO::getDeleted, DeletedEnum.NORMAL.getCode());
        for (SortCondition sortCondition : condition.getSortList()) {
            queryWrapper.orderByDesc(sortCondition.getColumnName());
        }
        Page<DemoPO> demoPage = demoMapper.selectPage(new Page<>(condition.getPage().getPageNo(),
                condition.getPage().getSize()), queryWrapper);
        List<DemoPO> poList = demoPage.getRecords();

        // toBO
        return demoInfoConvertor.toBOList(poList);
    }

    @Override
    public DemoBO getById(Long id) {

        // select
        DemoPO po = demoMapper.selectById(id);

        // toBO
        return demoInfoConvertor.toBO(po);
    }

    @Override
    public DemoBO getByDemoId(Long demoId, Long userId) {
        // select
        QueryWrapper<DemoPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DemoPO::getDemoId, demoId).eq(DemoPO::getUserId, userId);
        DemoPO po = demoMapper.selectOne(queryWrapper);

        // toBO
        return demoInfoConvertor.toBO(po);
    }

}
