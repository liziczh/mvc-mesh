package com.liziczh.mvc.mesh.service.bo.info;

import lombok.*;

import java.util.Date;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DemoBO {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 逻辑删除：0-正常，1-删除
     */
    private Integer deleted;

    /**
     * 实例ID
     */
    private Long demoId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String desc;
}
