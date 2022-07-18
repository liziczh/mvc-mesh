package com.liziczh.mvc.mesh.api.req;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * DemoDTO
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:11 上午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DemoUpdateReq {

    @ApiModelProperty(value = "实体ID")
    @JsonProperty("demoId")
    private Long demoId;

    @ApiModelProperty(value = "用户ID")
    @JsonProperty("userId")
    private Long userId;

    @ApiModelProperty(value = "状态")
    @JsonProperty("status")
    private Integer status;

    @ApiModelProperty(value = "名称")
    @JsonProperty("name")
    private String name;

    @ApiModelProperty(value = "描述")
    @JsonProperty("desc")
    private String desc;

}
