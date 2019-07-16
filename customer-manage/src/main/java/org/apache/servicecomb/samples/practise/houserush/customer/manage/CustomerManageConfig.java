
package org.apache.servicecomb.samples.practise.houserush.customer.manage;


import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

@Configuration
@EnableJpaRepositories(basePackages = "org.apache.servicecomb.samples.practise.houserush")
public class CustomerManageConfig {
    @Bean
    public ObjectMapper objectMapper() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'D'HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(dateFormat);
        return mapper;
    }
}
