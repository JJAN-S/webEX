package spring.webEX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("spring.webEX.repository")
public class WebExApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebExApplication.class, args);
	}

}
