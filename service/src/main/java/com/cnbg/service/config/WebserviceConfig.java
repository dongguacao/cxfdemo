package com.cnbg.service.config;

import com.cnbg.service.systemname.businessname.intf.IHelloService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;

import javax.management.MXBean;
import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebserviceConfig {
    @Bean
    public ServletRegistrationBean wsServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
        return bean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    //编写的WebService接口
    @Autowired
    private IHelloService helloService;

    @Bean
    public Endpoint endpoint() {
        //会找到O2oWebService的实现类，所以实现类只能有一个
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloService);

        endpoint.publish("/test");

        return endpoint;
    }


    @Bean
    public void getBean(){


    }


}
