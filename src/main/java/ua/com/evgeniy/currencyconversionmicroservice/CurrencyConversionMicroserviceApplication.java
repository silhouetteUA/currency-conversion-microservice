package ua.com.evgeniy.currencyconversionmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionMicroserviceApplication.class, args);
    }

}