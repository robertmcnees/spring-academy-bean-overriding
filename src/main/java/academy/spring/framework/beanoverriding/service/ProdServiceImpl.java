package academy.spring.framework.beanoverriding.service;

public class ProdServiceImpl implements MyService {

	@Override
	public String doSomething() {
		return "Doing something in PRODUCTION";
	}
}
