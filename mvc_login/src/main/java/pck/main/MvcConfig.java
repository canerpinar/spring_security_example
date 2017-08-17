package pck.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/denemeler").setViewName("deneme/dene");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/user").setViewName("users");
        registry.addViewController("/login").setViewName("login");
    }
	
	
	@Bean
	public InternalResourceViewResolver resolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;		
	}

}
