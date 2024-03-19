package Dev.SaiSupraja.MovieStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieStreamApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieStreamApplication.class, args);
	}
@GetMapping("/")
	public String apiRoot(){
		return "hello sai!";
}
}
