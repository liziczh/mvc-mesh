package com.liziczh.mvc.mesh.ref.mail.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 邮件发送DTO
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/8/23 9:23 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MailSendRequest {
    /**
     * 主题
     */
    private String subject;

    /**
     * 内容
     */
    private String content;

    /**
     * 发件人
     */
    private String from;

    /**
     * 收件人
     */
    private String[] to;

    /**
     * 抄送
     */
    private String[] cc;

    /**
     * 密送
     */
    private String[] bcc;

    /**
     * 图片
     */
    private Map<String, String> image;

    /**
     * 附件
     */
    private Map<String, String> attachment;
}
