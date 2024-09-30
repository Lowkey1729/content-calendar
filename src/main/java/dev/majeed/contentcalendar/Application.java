package dev.majeed.contentcalendar;

import dev.majeed.contentcalendar.model.Content;
import dev.majeed.contentcalendar.model.enums.Status;
import dev.majeed.contentcalendar.model.enums.Type;
import dev.majeed.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            Content content = new Content(
                    1,
                    "Hello Fadheelah",
                    "Hi Noor",
                    Status.IDEA,
                    Type.VIDEO,
                    LocalDateTime.now(),
                    null,
                    "http://test.com"
            );

            repository.save(content);
        };
    }
}
