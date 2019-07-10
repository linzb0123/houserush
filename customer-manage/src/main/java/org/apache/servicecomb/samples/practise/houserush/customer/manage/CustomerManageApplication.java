package org.apache.servicecomb.samples.practise.houserush.customer.manage;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class CustomerManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerManageApplication.class, args);
    }
}
