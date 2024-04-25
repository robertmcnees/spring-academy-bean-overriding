package academy.spring.framework.beanoverriding;

import academy.spring.framework.beanoverriding.service.MyService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockReset;
import org.springframework.test.context.bean.override.mockito.MockitoSpyBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeanOverridingMockitoTests {

	@MockitoSpyBean
	MyService customService;

	@BeforeAll
	void establishMock() {
		when(customService.doSomething()).thenReturn("Do something with a mock");
	}

	@Test
	void test() {
		assertEquals("Do something with a mock", customService.doSomething());
	}

	@Test
	void test2() {
		assertEquals("Do something with a mock", customService.doSomething());
	}

}
