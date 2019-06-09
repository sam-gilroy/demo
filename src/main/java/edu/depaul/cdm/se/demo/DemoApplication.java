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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Bean
	public CommandLineRunner demoRoom(RoomRepository repository) {
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
	public CommandLineRunner demoRt(RoomTypeRepository repository) {
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
	public CommandLineRunner demoFac(FacilityRepository repository) {
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
	public CommandLineRunner demoAva(AvailableRepository repository) {
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
	public CommandLineRunner demoCon(ConfirmationRepository repository) {
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
	public CommandLineRunner demoEmp(EmployeeInfoRepository repository) {
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
	public CommandLineRunner demoGue(GuestRepository repository) {
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
	public CommandLineRunner demoHot(HotelRepository repository) {
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
	public CommandLineRunner demoPos(PositionRepository repository) {
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
	public CommandLineRunner demoRes(ReservationRepository repository) {
		return (args) -> {
			log.info("reservation found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach((reservation) -> {
			//	log.info(reservation.toString());
			});
			log.info("");
		};
	}



	@Autowired
	RoomType_NoSQL_Repo rooming;


	@Autowired
	Hotel_NoSQL_Repo hotelRepo;

	@Autowired
	Position_NoSQL_Repo position;

	@Autowired
	Facility_NOSQL_Repo facility;

	@Autowired
	EmployeeInfo_NoSQL_Repo employee;


	ArrayList<EmployeeInfo_NoSQL> managers = new ArrayList<>();
	ArrayList<EmployeeInfo_NoSQL> cooks = new ArrayList<>();
	ArrayList<EmployeeInfo_NoSQL> frontDesk = new ArrayList<>();
	ArrayList<EmployeeInfo_NoSQL> houseKeeping = new ArrayList<>();





	@Bean
	public CommandLineRunner noSqlDemoRt(RoomType_NoSQL_Repo repository) {
		repository.deleteAll();
		return (args) -> {
			// save a review
			repository.deleteAll();
			RoomType_NoSQL room1 = new RoomType_NoSQL("Single", false, 90);
			RoomType_NoSQL room2 = new RoomType_NoSQL("Double",false,100);
			RoomType_NoSQL room3 = new RoomType_NoSQL("Triple",false,110);
			RoomType_NoSQL room4 = new RoomType_NoSQL("Quad", false,120);
			repository.save(room1);
			repository.save(room2);
			repository.save(room3);
			repository.save(room4);
		};
	}

	@Bean
	public CommandLineRunner noSqlDemoFac(Facility_NOSQL_Repo repository) {
		repository.deleteAll();
		return (args) -> {
			// save a review
			repository.deleteAll();
			Facility_NoSQL facility1 = new Facility_NoSQL("Pool", true);
			repository.save(facility1);
		};
	}

	@Bean
	public CommandLineRunner noSqlDemoEmp(EmployeeInfo_NoSQL_Repo repository) {
		repository.deleteAll();
		return (args) -> {
			// save a review
			repository.deleteAll();
			EmployeeInfo_NoSQL employee1 = new EmployeeInfo_NoSQL("Peter June", "pjune@hotels.com");
			EmployeeInfo_NoSQL employee2 = new EmployeeInfo_NoSQL("Cici Leader", "cleader@hotels.com");
			EmployeeInfo_NoSQL employee3 = new EmployeeInfo_NoSQL("Carrie Austin", "caustin@hotels.com");
			EmployeeInfo_NoSQL employee4 = new EmployeeInfo_NoSQL("Austin James", "ajames@hotels.com");

			repository.save(employee1);
			repository.save(employee2);
			repository.save(employee3);
			repository.save(employee4);

			managers.add(employee1);
			cooks.add(employee2);
			frontDesk.add(employee3);
			frontDesk.add(employee4);
			houseKeeping.add(null);
		};
	}

	@Bean
	public CommandLineRunner noSqlDemoPos(Position_NoSQL_Repo repository) {
		repository.deleteAll();
		return (args) -> {
			// save a review
			repository.deleteAll();
			Position_NoSQL position1 = new Position_NoSQL("Manager", 50000, managers);
			Position_NoSQL position2 = new Position_NoSQL("Cook", 50000, cooks);
			Position_NoSQL position3 = new Position_NoSQL("Front Desk", 25000, frontDesk);
			Position_NoSQL position4 = new Position_NoSQL("House Keeping", 35000, houseKeeping);

			repository.save(position1);
			repository.save(position2);
			repository.save(position3);
			repository.save(position4);
		};
	}

	@Bean
	public CommandLineRunner noSqlDemoHot(Hotel_NoSQL_Repo repository) {
		repository.deleteAll();
		return (args) -> {
			// save a review
			repository.deleteAll();
			Hotel_NoSQL hotel1 = new Hotel_NoSQL("Chicago", "1155 N Sheffield Ave., Chicago, IL 60614",
					rooming.findAll(), position.findAll(), facility.findAll());

			repository.save(hotel1);
		};
	}



}
