package ca.com.food.payments.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationApp {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
