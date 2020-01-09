package com.eslink.dubbo.demo.consumer;

import com.eslink.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author zeng.yakun (0178)
 * @Date 2018/12/21 16:11
 * @Version 1.0
 **/
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // get remote service proxy
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("开始调用...");
//                String hello = demoService.sayHello("world"); // call remote method
                String hello = demoService.getTime(); // call remote method
                System.out.println(hello); // get result
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
