package dsw3.t3.joanrojasrodriguez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class JoanrojasrodriguezApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoanrojasrodriguezApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configGlobalCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("api/v1/**")
						.allowedMethods("GET", "POST", "PUT")
						.allowedOrigins("*");
			}
		};
	}

}
