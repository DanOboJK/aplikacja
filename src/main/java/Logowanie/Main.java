package Logowanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackageClasses = UczestnikRepository.class)
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {MainController.class, WebAppConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}