package org.wechat.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wechat.base.BaseInfoProperties;
import org.wechat.utils.RedisOperator;

@RestController
@RequestMapping("g")
public class HelloController extends BaseInfoProperties {

//    @Resource
//    private RedisOperator redisOperator;

    @GetMapping("hello")
    public Object hello() {
        return "Hello World from gateway";
    }

    @GetMapping("setRedis")
    public Object setRedis(String k, String v) {
        redis.set(k, v);
        return "setRedis Ok~";
    }

    @GetMapping("getRedis")
    public Object getRedis(String k) {
        return redis.get(k);
    }
}
