package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}

	@Bean
	public AppSecurity createInstance() {
		// logic
		return new AppSecurity("SHA-256");
	}
}
