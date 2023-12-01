package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
        String answer = aiManager.doChat(1659171950288818178L, "分析需求：\n" +
                "分析气温变化\n" +
                "原始数据：\n" +
                "日期,最低气温\n" +
                "1号,10\n" +
                "2号,6\n" +
                "3号,9\n"+
                "4号，4\n");
        System.out.println(answer);
    }
}