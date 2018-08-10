package sri.spring.boot.configprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = ConfigProperties.class)
@SpringBootApplication
public class ConfigPropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPropsApplication.class, args);
	}
}
