package com.liziczh.mvc.mesh.service.convertor;

import java.util.List;

import org.mapstruct.Mapper;

import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.service.bo.DemoBO;
import com.liziczh.mvc.mesh.service.bo.DemoOptBO;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 7:13 下午
 */
@Mapper(componentModel = "spring")
public interface DemoApiConvertor {

    DemoDTO toDTO(DemoBO bo);

    DemoOptDTO toDTO(DemoOptBO bo);

    List<DemoDTO> toDTOList(List<DemoBO> boList);

}
