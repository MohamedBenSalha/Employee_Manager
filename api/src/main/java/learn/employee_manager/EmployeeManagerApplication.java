package learn.employee_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EmployeeManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagerApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // allow CORS requests for all resources and HTTP methods from the frontend origin
                registry.addMapping("/**")
                        .allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE")
                .allowedOrigins("http://localhost:4200");
            }
        };
    }

}
