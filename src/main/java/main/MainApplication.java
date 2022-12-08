package main;

import com.view.LoginPage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@EnableJpaRepositories(basePackages = {"com"})
@EntityScan("com.entity")
@EnableAsync
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(MainApplication.class).headless(false).run(args);

        LoginPage dashboard = context.getBean(LoginPage.class);
        dashboard.setVisible(Boolean.TRUE);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
