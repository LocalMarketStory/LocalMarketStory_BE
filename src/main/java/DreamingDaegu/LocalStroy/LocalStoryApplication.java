package DreamingDaegu.LocalStroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class LocalStoryApplication {


	public static void main(String[] args) {
		SpringApplication.run(LocalStoryApplication.class, args);
	}

}
