
create table hotels (
    id int primary key auto_increment,
    name varchar(10),
    address varchar(80)
);


create table facility(
    id int primary key auto_increment,
    facility_name varchar(10),
    facility_avail boolean,
    hotel LONG
);


create table roomType (
                          id int primary key auto_increment,
                          roomSize varchar(10),
                          smoking boolean,
                          roomRate integer,
                          hotel LONG
);

create table guests (
                        id int primary key auto_increment,
                        name varchar(50),
                        email varchar(50)
);

create table employeeInfo (
                              id int primary key auto_increment,
                              name varchar(50),
                              email varchar(50),
                              position long
);

CREATE table position (
                          id int primary key auto_increment,
                          positionName varchar(50)
);

CREATE TABLE room (
                      id int primary key auto_increment,
                      num int,
                      available boolean,
                      roomNumberType long
);

create table available (
                           id int primary key auto_increment,
                           roomNum int,
                           arrival_dt timestamp,
                           departure_dt timestamp,
                           status boolean
);

CREATE TABLE reservation (
                             id int primary key auto_increment,
                             guest_id long,
                             dateIn timestamp,
                             dateOut timestamp,
                             roomTypeReserve long,
                             amountTotal int,
                             employee_id long,
                             hotel_id long
);

CREATE TABLE confirmation (
                              id int primary key auto_increment,
                              reservation_id long,
                              guest_id long,
                              totalOwed int,
                              roomNumAvail int
);
