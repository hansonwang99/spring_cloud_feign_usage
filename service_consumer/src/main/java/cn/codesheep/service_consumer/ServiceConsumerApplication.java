package cn.codesheep.service_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerApplication.class, args);
	}
}
