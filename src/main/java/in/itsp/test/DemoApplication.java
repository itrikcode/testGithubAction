package in.itsp.test;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("in the main Class");
		SpringApplication.run(DemoApplication.class, args);

	}

	public RestTemplate restTemplate(){
		return restTemplate();
	}


}
