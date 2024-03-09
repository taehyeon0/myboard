package than.myboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class MyboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyboardApplication.class, args);
	}

}
