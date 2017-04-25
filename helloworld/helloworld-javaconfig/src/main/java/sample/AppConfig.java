package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "student")
	public Student getStudentInstance() {
		return new Student();
	}
}
