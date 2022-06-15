package com.liziczh.mvc.mesh.common.util;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

/**
 * 随机字符串
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:11 上午
 */
@Slf4j
public class RandomUtils {
    private static final String LOWERCASE_LETTER_POOL = "abcdefghijklmnopqrstuvwxyz";
    private static final String CAPITAL_LETTER_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBER_POOL = "0123456789";

    /**
     * 随机字符串
     *
     * @param size 数量
     * @return 随机串
     */
    private String random(int size, String charPool) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(charPool.charAt(random.nextInt() % charPool.length()));
        }
        return stringBuilder.toString();
    }
}
