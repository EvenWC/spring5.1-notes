package priv.wangcheng.spring.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import priv.wangcheng.spring.study.service.AService;
import priv.wangcheng.spring.study.service.BService;

/**
 * @author WangCheng
 * @version $Id: TestConfig.java, v0.1 2020/11/19 10:53 WangCheng Exp $$
 */
@Import(ImportTest.class)
@Configuration
public class TestConfig {


	@Bean
	public AService aService(){
		return new AService();
	}

	@Bean
	public BService bService(){
		return new BService();
	}

}
