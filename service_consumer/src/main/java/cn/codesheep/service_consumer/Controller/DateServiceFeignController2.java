package cn.codesheep.service_consumer.Controller;

import cn.codesheep.service_consumer.service.DateServiceFeignClientInterface;
import cn.codesheep.service_consumer.service.DateServiceFeignClientInterface2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer2")
public class DateServiceFeignController2 {

    @Resource
    DateServiceFeignClientInterface2 dateServiceFeignClientInterface2;

    @GetMapping("/date")
    public String getDate( @RequestParam String param ) {
        return dateServiceFeignClientInterface2.consumer( param );
    }
}
