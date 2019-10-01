package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void Init(){
        System.out.println("Inside custom Init");

    }
    public void Destroy(){
        System.out.println("Inside customDestroy");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring container is destroyed");

    }
}
