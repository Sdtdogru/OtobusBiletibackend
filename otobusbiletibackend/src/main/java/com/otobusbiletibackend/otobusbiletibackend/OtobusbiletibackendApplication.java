package com.otobusbiletibackend.otobusbiletibackend;

import com.otobusbiletibackend.otobusbiletibackend.entity.Journey;
import com.otobusbiletibackend.otobusbiletibackend.repository.JourneyRepository;
import com.otobusbiletibackend.otobusbiletibackend.services.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class OtobusbiletibackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtobusbiletibackendApplication.class, args);
	}
	@Autowired
	private JourneyService journeyService;


	@Bean
	CommandLineRunner runner(JourneyRepository journeyRepository){
		return args -> {
			journeyRepository.save(new Journey(1L,"kocaeli","istanbul","02/05/2020","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(2L,"kocaeli","istanbul","02/05/2020","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(3L,"kocaeli","istanbul","02/05/2020","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(4L,"kocaeli","istanbul","02/05/2020","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(5L,"kocaeli","istanbul","02/06/2020","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(6L,"kocaeli","istanbul","02-06-2021","8:30",45,100D,"",""));
			journeyRepository.save(new Journey(7L,"kocaeli","sedat","02-06-2020","8:30",45,100D,"",""));
		};
		}









		}
