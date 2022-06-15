package com.liziczh.mvc.mesh.service.convertor;

import java.util.List;

import org.mapstruct.Mapper;

import com.liziczh.mvc.mesh.dao.po.DemoPO;
import com.liziczh.mvc.mesh.service.bo.DemoBO;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 7:13 下午
 */
@Mapper(componentModel = "spring")
public interface DemoPOConvertor {

    DemoBO toBO(DemoPO po);

    List<DemoBO> toBOList(List<DemoPO> poList);

    DemoPO toPO(DemoBO entity);

}
