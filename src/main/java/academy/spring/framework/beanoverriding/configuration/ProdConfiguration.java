package academy.spring.framework.beanoverriding.configuration;

import academy.spring.framework.beanoverriding.service.MyService;
import academy.spring.framework.beanoverriding.service.ProdServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdConfiguration {

	@Bean
	MyService customService() {
		return new ProdServiceImpl();
	}
}
