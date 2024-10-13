package pe.edu.cibertec.patitas_frontend_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PatitasFrontendAApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatitasFrontendAApplication.class, args);
	}

}
