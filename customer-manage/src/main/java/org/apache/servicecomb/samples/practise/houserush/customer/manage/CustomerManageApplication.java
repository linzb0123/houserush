package org.apache.servicecomb.samples.practise.houserush.customer.manage;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableServiceComb
@EnableJpaAuditing
public class CustomerManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerManageApplication.class, args);
    }
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }


}
