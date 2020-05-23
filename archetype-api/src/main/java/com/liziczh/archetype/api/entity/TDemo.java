package com.liziczh.archetype.api.entity;

import java.util.Date;

import com.liziczh.base.common.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class TDemo extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	private Integer id;
	private String name;
	private Date createTime;
	private String createUser;
	private Date updateTime;
	private String updateUser;
	private String permitRole;
	private String valid;
}
