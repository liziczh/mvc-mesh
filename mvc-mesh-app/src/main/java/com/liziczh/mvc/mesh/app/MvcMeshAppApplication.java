package com.liziczh.mvc.mesh.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MvcMeshAppApplication {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        SpringApplication.run(MvcMeshAppApplication.class, args);

        long cost = System.currentTimeMillis() - startTime;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        log.info("########### Application is Started! now={}, cost={} ##########", format.format(new Date()), cost);

    }

}
