package priv.wangcheng.spring.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import priv.wangcheng.spring.study.service.AService;

@ComponentScan
@EnableAspectJAutoProxy
public class App {


	public static void main(String[] args) {
		//创建一个spring 上下文
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		AService bean = applicationContext.getBean(AService.class);
		bean.test();
	}

}
