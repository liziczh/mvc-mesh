package com.liziczh.mvc.mesh.api.req;

import lombok.*;

/**
 * 实体查询
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/17 21:52
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DemoInfoReq {
    /**
     * 实体ID
     */
    private Long demoId;
    /**
     * 用户ID
     */
    private Long userId;

}
