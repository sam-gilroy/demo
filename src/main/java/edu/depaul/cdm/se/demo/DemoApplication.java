package edu.depaul.cdm.se.demo;

import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
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

	@Bean
	public CommandLineRunner noSqlRoomType(RoomType_NoSQL_Repo repository) {
		return (args) -> {
			// save a review
			repository.deleteAll();

			RoomType_NoSQL room1 = new RoomType_NoSQL("Single", false, 90);
			repository.save(room1);

			RoomType_NoSQL room2 = new RoomType_NoSQL("Double",false,100);
			repository.save(room2);

			RoomType_NoSQL room3 = new RoomType_NoSQL("Triple",false,110);
			repository.save(room3);

			RoomType_NoSQL room4 = new RoomType_NoSQL("Quad", false,120);
			repository.save(room4);
		};
	}

	@Autowired
	RoomType_NoSQL_Repo rooming;
/*

	@Bean
	public CommandLineRunner noSqlHotel(Hotel_NoSQL_Repo repository) {
		return (args) -> {
			//save a review
			repository.deleteAll();
			Hotel_NoSQL hotel = new Hotel_NoSQL();
			hotel.setHotelName("Chicago");
			hotel.setHotelAddress("1155 N Sheffield Ave., Chicago, IL 60614");
			repository.save(hotel);
		};
	}

	 */

	@Autowired
	Hotel_NoSQL_Repo repository;


	@Override
	public void run(String... args) throws Exception{
		repository.deleteAll();
		rooming.deleteAll();
		rooming.saveAll(Arrays.asList(new RoomType_NoSQL("Single", false, 90),
				new RoomType_NoSQL("Double",false,100),
				new RoomType_NoSQL("Triple",false,110),
				new RoomType_NoSQL("Quad", false,120)));
		repository.saveAll(Arrays.asList(
				new Hotel_NoSQL("Chicago", "1155 N Sheffield Ave., Chicago, IL 60614",
						rooming.findAll())));

		List<Hotel_NoSQL> hotels = null;

		hotels = repository.findAll();
		hotels.forEach((System.out::println));
	}


}
