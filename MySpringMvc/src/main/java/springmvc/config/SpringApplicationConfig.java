package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "springmvc.controller")
public class SpringApplicationConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vw = new InternalResourceViewResolver();
		vw.setPrefix("/WEB-INF/views");
		vw.setSuffix(".jsp");
		return vw;
	}
}
