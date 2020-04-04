package fr.pereirafrederic.fpezuul.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fpe-zuul", url = "localhost:8282")
@RibbonClient(name = "service1")
public interface IDefaultProxy {


        @GetMapping(value = "/")
        String getDedault();
}