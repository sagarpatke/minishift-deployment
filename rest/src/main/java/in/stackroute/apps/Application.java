package in.stackroute.apps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	@Value("${spring.datasource.url}")
	private String url;

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Application.class, args);
		String url = appContext.getEnvironment().getProperty("spring.datasource.url");
		System.out.println("URL: " + url);
	}
}
