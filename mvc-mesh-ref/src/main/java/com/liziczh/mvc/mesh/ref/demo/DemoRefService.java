package com.liziczh.mvc.mesh.ref.demo;

import com.liziczh.mvc.mesh.ref.demo.dto.DemoRefDTO;
import com.liziczh.mvc.mesh.ref.demo.req.DemoRefReq;

public interface DemoRefService {
    /**
     * REF测试
     *
     * @return helloworld
     */
    DemoRefDTO remoteCall(DemoRefReq req);
}
