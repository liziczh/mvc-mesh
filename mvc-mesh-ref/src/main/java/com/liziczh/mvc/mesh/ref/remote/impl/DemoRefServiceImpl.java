package com.liziczh.mvc.mesh.ref.remote.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.liziczh.mvc.mesh.common.util.JsonUtils;
import com.liziczh.mvc.mesh.ref.remote.DemoRefService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DemoRefServiceImpl implements DemoRefService {

    @Value("${archetype.web}")
    private String archetypeWeb;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello() {
        String url = "http://" + archetypeWeb + "/demo/hello";
        ResponseEntity<String> httpEntity = restTemplate.getForEntity(url, String.class);
        log.info(JsonUtils.toJson(httpEntity));
        return httpEntity.getBody();
    }
}
