package academy.spring.framework.beanoverriding;

import academy.spring.framework.beanoverriding.service.MyService;
import academy.spring.framework.beanoverriding.service.ProdServiceImpl;
import academy.spring.framework.beanoverriding.service.SimplifiedServiceImpl;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.bean.override.convention.TestBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BeanOverridingApplicationTests {

	@Autowired
	MyService customService;

	@Test
	void testBeanFromApplicationContext(ApplicationContext context) {
		assertNotNull(context.getBean("customService"));
		assertThat(context.getBean("customService"))
				.isInstanceOf(ProdServiceImpl.class);
	}

	@Test
	void testBeanFromAutowire() {
		assertNotNull(customService);
		assertThat(customService).isInstanceOf(ProdServiceImpl.class);
	}

	@Test
	void testDoSomething() {
		assertEquals("Doing something in PRODUCTION", customService.doSomething());
	}
}

