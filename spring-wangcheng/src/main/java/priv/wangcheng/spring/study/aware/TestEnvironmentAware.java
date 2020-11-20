package priv.wangcheng.spring.study.aware;


import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author WangCheng
 * @version $Id: TestBeanFactoryAware.java, v0.1 2020/11/18 17:31 WangCheng Exp $$
 */
@Component
public class TestEnvironmentAware implements EnvironmentAware {



	@Override
	public void setEnvironment(Environment environment) {
		System.out.println(environment);
	}
}
