package poc.docker;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SbDockerGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDockerGradleApplication.class, args);
	}

}

@RequestMapping("/hello")
@RestController
class HelloController {

	AtomicInteger count = new AtomicInteger();
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping
	String hello() {
		log.info("Request received: " + count.getAndIncrement());
		return "Hello there!";
	}
}