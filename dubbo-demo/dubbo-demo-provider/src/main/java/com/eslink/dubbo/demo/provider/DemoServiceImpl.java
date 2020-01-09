package com.eslink.dubbo.demo.provider;

import com.eslink.dubbo.demo.DemoService;

import java.time.LocalTime;

/**
 * @ClassName DemoServiceImpl
 * @Description TODO
 * @Author zeng.yakun (0178)
 * @Date 2018/12/21 16:04
 * @Version 1.0
 **/
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("收到请求：" + name);
        return "Hello " + name;
    }

    @Override
    public String getTime() {
        return LocalTime.now().toString();
    }
}
