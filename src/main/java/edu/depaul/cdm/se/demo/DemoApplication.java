package edu.depaul.cdm.se.demo;

import com.sun.jdi.InterfaceType;
import edu.depaul.cdm.se.demo.Repositories.*;
import edu.depaul.cdm.se.demo.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.expression.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	/*
	@Autowired
	FacilityRepository facRep;
	AvailableRepository avaRep;
	ConfirmationRepository conRep;
	EmployeeInfoRepository empRep;
	GuestRepository gueRep;
	HotelRepository hotRep;
	PositionRepository posRep;
	ReservationRepository resRep;
	RoomTypeRepository rtRep;
	RoomRepository roomRep;

	 */


	@Bean
	public CommandLineRunner demoroom(RoomRepository repository) {
		return (args) -> {
			log.info("room found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((room) -> {
				//log.info(room.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demort(RoomTypeRepository repository) {
		return (args) -> {
			log.info("roomType found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((roomType) -> {
			//	log.info(roomType.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demofac(FacilityRepository repository) {
		return (args) -> {
			log.info("Facilities found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((facility) -> {
			//	log.info(facility.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demoava(AvailableRepository repository) {
		return (args) -> {
			log.info("Available found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((available) -> {
			//	log.info(available.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner democon(ConfirmationRepository repository) {
		return (args) -> {
			log.info("confirmation found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((confirmation) -> {
			//	log.info(confirmation.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demoemp(EmployeeInfoRepository repository) {
		return (args) -> {
			log.info("employeeInfo found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((employeeInfo) -> {
			//	log.info(employeeInfo.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demogue(GuestRepository repository) {
		return (args) -> {
			log.info("guest found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((guest) -> {
			//	log.info(guest.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demohot(HotelRepository repository) {
		return (args) -> {
			log.info("hotel found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((hotel) -> {
			//	log.info(hotel.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demopos(PositionRepository repository) {
		return (args) -> {
			log.info("position found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((position) -> {
			//	log.info(position.toString());
			});
			log.info("");
		};
	}

	@Bean
	public CommandLineRunner demores(ReservationRepository repository) {
		return (args) -> {
			log.info("reservation found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((reservation) -> {
			//	log.info(reservation.toString());
			});
			log.info("");
		};
	}




/*

	public void demoSQL(String...args) throws Exception {
		log.info("facility", facRep.findAll());
		log.info("roomType", rtRep.findAll());
		log.info("hotels", hotRep.findAll());
		log.info("room",roomRep.findAll());
		log.info("positions", posRep.findAll());
		log.info("employeeInfo", empRep.findAll());
		log.info("guests", gueRep.findAll());
		log.info("reservation", resRep.findAll());
		log.info("available", avaRep.findAll());
		log.info("confirmation", conRep.findAll());
	}

*/


	@Autowired
	RoomType_NoSQL_Repo rooming;


	@Autowired
	Hotel_NoSQL_Repo repository;

	@Autowired
	Position_NoSQL_Repo position;

	@Autowired
	Facility_NOSQL_Repo facility;

	@Autowired
	EmployeeInfo_NoSQL_Repo employee;

	@Override
	public void run(String... args) throws Exception{
		repository.deleteAll();
		rooming.deleteAll();
		position.deleteAll();
		facility.deleteAll();
		employee.deleteAll();
		employee.saveAll(Arrays.asList(new EmployeeInfo_NoSQL("Peter June", "pjune@hotels.com"),
				(new EmployeeInfo_NoSQL("Cici Leader", "cleader@hotels.com")),
				(new EmployeeInfo_NoSQL("Carrie Austin", "caustin@hotels.com")),
				new EmployeeInfo_NoSQL("Austin James", "ajames@hotels.com")));

		List<EmployeeInfo_NoSQL> managers = Arrays.asList(employee.findAllByEmployeeName("Peter June"));
		List<EmployeeInfo_NoSQL> cooks = Arrays.asList(employee.findAllByEmployeeName("Cici Leader"));
		List<EmployeeInfo_NoSQL> frontDesk = Arrays.asList(employee.findAllByEmployeeName("Carrie Austin"), employee.findAllByEmployeeName("Austin James"));
		List<EmployeeInfo_NoSQL> houseKeeping = Arrays.asList(employee.findAllByEmployeeName(""));

		facility.saveAll(Arrays.asList(new Facility_NoSQL("Pool", true)));
		position.saveAll(Arrays.asList(new Position_NoSQL("Manager", 50000, managers),
				new Position_NoSQL("Cook", 50000, cooks),
				new Position_NoSQL("Front Desk", 25000, frontDesk),
				new Position_NoSQL("House Keeping", 35000, houseKeeping)));
		rooming.saveAll(Arrays.asList(new RoomType_NoSQL("Single", false, 90),
				new RoomType_NoSQL("Double",false,100),
				new RoomType_NoSQL("Triple",false,110),
				new RoomType_NoSQL("Quad", false,120)));
		repository.saveAll(Arrays.asList(
				new Hotel_NoSQL("Chicago", "1155 N Sheffield Ave., Chicago, IL 60614",
						rooming.findAll(), position.findAll(), facility.findAll())));

		List<Hotel_NoSQL> hotels = null;

		hotels = repository.findAll();
		hotels.forEach((System.out::println));
	}


}
