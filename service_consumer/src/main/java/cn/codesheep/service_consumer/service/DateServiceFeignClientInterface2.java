package cn.codesheep.service_consumer.service;

import cn.codesheep.service.DateService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient( value = "service-provider" )
public interface DateServiceFeignClientInterface2 extends DateService {
}
