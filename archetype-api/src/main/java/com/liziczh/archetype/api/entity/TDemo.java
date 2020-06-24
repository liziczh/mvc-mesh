package com.liziczh.archetype.api.entity;

import java.util.Date;

import com.liziczh.base.common.entity.BaseEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TDemo extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "ID")
	private Integer id;
	@ApiModelProperty(value = "姓名")
	private String name;
	@ApiModelProperty(value = "创建时间")
	private Date createTime;
	@ApiModelProperty(value = "创建人")
	private String createUser;
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;
	@ApiModelProperty(value = "更新人")
	private String updateUser;
	@ApiModelProperty(value = "权限角色")
	private String permitRole;
	@ApiModelProperty(value = "是否有效")
	private String valid;
}
