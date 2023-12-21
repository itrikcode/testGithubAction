package in.itsp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Vivek ");
		System.out.println("new test");
		SpringApplication.run(DemoApplication.class, args);
	}

}
