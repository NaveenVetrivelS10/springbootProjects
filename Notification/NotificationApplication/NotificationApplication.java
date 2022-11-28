package NotificationApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan({"com.notification"})
@EntityScan("com.notification.domain")
@EnableJpaRepositories("com.notification.service")
public class NotificationApplication 
{

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

}
