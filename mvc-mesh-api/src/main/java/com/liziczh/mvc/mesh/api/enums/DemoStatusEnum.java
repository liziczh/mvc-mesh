package com.liziczh.mvc.mesh.api.enums;

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
public enum DemoStatusEnum {
    INIT(100, "初始化"),
    VALID(200, "有效数据"),
    ;

    private Integer code;
    private String desc;
}
