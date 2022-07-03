package guru.springframework.gurupetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuruPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuruPetClinicApplication.class, args);
		//data jar is in our dependencies, so we can easily reach CommandLineRunner there, without @ComponentsScan
	}

}
