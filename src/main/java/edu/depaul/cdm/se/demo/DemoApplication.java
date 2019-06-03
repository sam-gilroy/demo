package edu.depaul.cdm.se.demo;

import edu.depaul.cdm.se.demo.Repositories.Hotel_NoSQL_Repo;
import edu.depaul.cdm.se.demo.Repositories.RoomType_NoSQL_Repo;
import edu.depaul.cdm.se.demo.model.Hotel;
import edu.depaul.cdm.se.demo.model.Hotel_NoSQL;
import edu.depaul.cdm.se.demo.model.RoomType_NoSQL;
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
	public CommandLineRunner noSqlRoomType(RoomType_NoSQL_Repo repository) {
		return (args) -> {
			// save a review
			repository.deleteAll();

			RoomType_NoSQL room1 = new RoomType_NoSQL();
			room1.setRoomSize("Single");
			room1.setSmoking(false);
			room1.setRoomRate(90);
			repository.save(room1);

			RoomType_NoSQL room2 = new RoomType_NoSQL();
			room2.setRoomSize("Double");
			room2.setSmoking(false);
			room2.setRoomRate(100);
			repository.save(room2);

			RoomType_NoSQL room3 = new RoomType_NoSQL();
			room3.setRoomSize("Triple");
			room3.setSmoking(false);
			room3.setRoomRate(110);
			repository.save(room3);

			RoomType_NoSQL room4 = new RoomType_NoSQL();
			room4.setRoomSize("Quad");
			room4.setSmoking(false);
			room4.setRoomRate(120);
			repository.save(room4);
		};
	}

	@Bean
	public CommandLineRunner noSqlHotel(Hotel_NoSQL_Repo repository) {
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
