package com.liziczh.mvc.mesh.ref.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.liziczh.base.common.util.JsonUtils;
import com.liziczh.mvc.mesh.ref.demo.DemoRefService;
import com.liziczh.mvc.mesh.ref.demo.dto.DemoRefDTO;
import com.liziczh.mvc.mesh.ref.demo.req.DemoRefReq;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DemoRefServiceImpl implements DemoRefService {

    @Value("${ref.service}")
    private String refService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public DemoRefDTO remoteCall(DemoRefReq req) {
        String url = "http://" + refService + "/demo/hello";
        ResponseEntity<String> httpEntity = restTemplate.getForEntity(url, String.class);
        log.info(JsonUtils.toJson(httpEntity));
        String result = httpEntity.getBody();
        return DemoRefDTO.builder().result(result).build();
    }
}
