import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pawelnielepkowicz.repository.CustomerRepository;
import com.pawelnielepkowicz.repository.HibernateCustomerRepositoryImpl;
import com.pawelnielepkowicz.service.CustomerService;
import com.pawelnielepkowicz.service.CustomerServiceImpl;

@Configuration
//@ComponentScan({"com.pawelnielepkowicz"})
//@PropertySource("app.config")
public class AppConfig {
	
	// enables app.config
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
		
	}
	
	
	// @Scope("Singleton") // dafalut scope
	// @Scope("Prototype") // guarantees new, unique instance per request
	// other scopes: Request, Session, GlobalSession
	
	// name can be anything 
	@Bean(name = "customerService")
	public CustomerService getCostumerService(){
		
		//Autowired
				CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		//constructor injection
		//CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		
		
		// setter injection
		//CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		
		
		return customerService;
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		
		return new HibernateCustomerRepositoryImpl();
	}
	
}
