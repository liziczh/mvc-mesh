package com.liziczh.mvc.mesh.ref.demo.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class DemoRefReq {

    private String name;

}
