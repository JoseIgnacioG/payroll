// https://spring.io/guides/tutorials/rest/
// http://localhost:8080/swagger-ui/index.html
// https://swagger.io/specification/

package com.example.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

    public static void main(String... args) {

        SpringApplication.run(PayrollApplication.class, args);
    }
}