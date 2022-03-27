package com.zhss.demo.dubbo.nacos;

import com.zhss.demo.dubbo.nacos.api.ServiceA;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "1.0.0",
        interfaceClass = ServiceA.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class ServiceAImpl implements ServiceA {

    @Autowired
    private UserMapper userMapper;

    public String greet(String name) {
        userMapper.insert(new User(name));
        return "hello, " + name;
    }

}
