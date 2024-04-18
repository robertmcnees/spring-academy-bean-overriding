package academy.spring.framework.beanoverriding.service;

public class SimplifiedServiceImpl implements MyService {

	@Override
	public String doSomething() {
		return "Doing something in TEST";
	}
}
