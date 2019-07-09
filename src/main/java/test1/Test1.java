package test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Test1 {
	@RequestMapping("/")
	public String sayhello() {
		return "hello world!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Test1.class, args);
	}

}
