package priv.wangcheng.spring.study.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author WangCheng
 * @version $Id: TestBeanFactoryAware.java, v0.1 2020/11/18 17:31 WangCheng Exp $$
 */
@Component
public class TestBeanFactoryAware implements BeanFactoryAware {

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
	}
}
