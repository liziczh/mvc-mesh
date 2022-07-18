package com.liziczh.mvc.mesh.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 状态码枚举
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:50 下午
 */
@Getter
@AllArgsConstructor
public enum IdEnum {
    DEMO("DEMO", "DEMO"),
    ;

    private String code;
    private String desc;
}
