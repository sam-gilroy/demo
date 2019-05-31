package edu.depaul.cdm.se.demo;

import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import edu.depaul.cdm.se.demo.Repositories.FacilityRepository;


@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Bean
	public CommandLineRunner demo(FacilityRepository repository) {
		return (args) -> {
			log.info("Facilities found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((facility) -> {
				log.info(facility.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner noSqlDemo(Hotel_NoSQL_Repo repository) {
		return (args) -> {
			// save a review
			repository.deleteAll();
			Hotel_NoSQL hotel = new Hotel_NoSQL();
			hotel.setHotelName("Chicago");
			hotel.setHotelAddress("1155 N Sheffield Ave., Chicago, IL 60614");
			repository.save(hotel);

			Hotel_NoSQL hotel2 = new Hotel_NoSQL();
			hotel2.setHotelName("San Francisco");
			hotel2.setHotelAddress("651 Market St., San Francisco, CA 94105");
			repository.save(hotel2);
		};
	}
}
