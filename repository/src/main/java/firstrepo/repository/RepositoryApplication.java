package firstrepo.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/request")
public class RepositoryApplication {

	@GetMapping("/welcome")
	public String message(){
		return "welcome Raja Reddy";
	}

	public static void main(String[] args) {
		SpringApplication.run(RepositoryApplication.class, args);
	}

}
