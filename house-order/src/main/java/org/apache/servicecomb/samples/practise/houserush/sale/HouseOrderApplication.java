package org.apache.servicecomb.samples.practise.houserush.sale;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class HouseOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HouseOrderApplication.class, args);
    }
}
