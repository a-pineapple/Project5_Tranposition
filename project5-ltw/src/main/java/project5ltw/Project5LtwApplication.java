package project5ltw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = "data")
public class Project5LtwApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project5LtwApplication.class, args);
	}

}
