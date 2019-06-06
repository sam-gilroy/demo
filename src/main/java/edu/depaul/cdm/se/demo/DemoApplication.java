package edu.depaul.cdm.se.demo;

import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;
import edu.depaul.cdm.se.demo.Repositories.Position_NoSQL_Repo;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import edu.depaul.cdm.se.demo.model.Position_NoSQL;
import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import edu.depaul.cdm.se.demo.Repositories.FacilityRepository;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

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


	@Autowired
	RoomType_NoSQL_Repo rooming;


	@Autowired
	Hotel_NoSQL_Repo repository;

	@Autowired
	Position_NoSQL_Repo position;


	@Override
	public void run(String... args) throws Exception{
		repository.deleteAll();
		rooming.deleteAll();
		position.deleteAll();
		position.saveAll(Arrays.asList(new Position_NoSQL("Manager", 50000),
				new Position_NoSQL("Cook", 50000),
				new Position_NoSQL("Front Desk", 25000),
				new Position_NoSQL("House Keeping", 35000)));
		rooming.saveAll(Arrays.asList(new RoomType_NoSQL("Single", false, 90),
				new RoomType_NoSQL("Double",false,100),
				new RoomType_NoSQL("Triple",false,110),
				new RoomType_NoSQL("Quad", false,120)));
		repository.saveAll(Arrays.asList(
				new Hotel_NoSQL("Chicago", "1155 N Sheffield Ave., Chicago, IL 60614",
						rooming.findAll(), position.findAll())));

		List<Hotel_NoSQL> hotels = null;

		hotels = repository.findAll();
		hotels.forEach((System.out::println));
	}


}
