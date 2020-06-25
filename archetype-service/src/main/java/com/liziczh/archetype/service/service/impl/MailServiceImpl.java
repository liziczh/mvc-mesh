package com.liziczh.archetype.service.service.impl;

import org.springframework.stereotype.Component;

import com.liziczh.archetype.api.service.MailService;

/**
 * 邮件服务
 * @author zhehao.chen
 */
@Component
public class MailServiceImpl implements MailService {
	@Override
	public void sendHTMLMail(String to, String subject, String content) {
	}
}
