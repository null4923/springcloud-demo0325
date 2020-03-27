package com.baweo.service.oredr.feign;

import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceImp implements UserFeignService{
    @Override
    public String getUserNameById(Integer id) {
        return "调用失败";
    }
}
