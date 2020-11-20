package priv.wangcheng.spring.study.service;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class AService  implements InstantiationAwareBeanPostProcessor {

	@Autowired
	private BService aService;

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInstantiation");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	public void test(){
		System.out.println("正在执行 test 方法");
	}
}
