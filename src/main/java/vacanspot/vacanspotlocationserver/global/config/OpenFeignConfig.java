package vacanspot.vacanspotlocationserver.global.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "vacanspot.vacanspotlocationserver.domain.location.feign")
@Configuration
public class OpenFeignConfig {
}
