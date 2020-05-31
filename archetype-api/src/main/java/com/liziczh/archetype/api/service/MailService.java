package com.liziczh.archetype.api.service;

public interface MailService {
	/**
	 * 发送邮件
	 * @param to
	 * @param subject
	 * @param content
	 * @throws Exception
	 */
	void sendHTMLMail(String to, String subject, String content) throws Exception;
}
