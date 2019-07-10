package org.apache.servicecomb.samples.practise.houserush.realestate;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class RealestateApplication {
    public static void main(String[] args) {
        SpringApplication.run(RealestateApplication.class, args);
    }
}
