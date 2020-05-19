package com.liziczh.archetype.service.aop;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.liziczh.base.service.aop.BaseServiceAop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class ServiceAop extends BaseServiceAop {
	@Override
	protected void sendErrorMessage(Exception exception, String className, String methodName, String methodParams, Date occurTime) {
	}
}
