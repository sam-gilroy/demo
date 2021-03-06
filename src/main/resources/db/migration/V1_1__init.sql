
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


create table room_Type (
                          id int primary key auto_increment,
                          room_Size varchar(10),
                          smoking boolean,
                          room_Rate integer,
                          hotel LONG
);

create table guests (
                        id int primary key auto_increment,
                        name varchar(50),
                        email varchar(50)
);

create table employee_Info (
                              id int primary key auto_increment,
                              name varchar(50),
                              email varchar(50),
                              position_id long
);

CREATE table position (
                          id int primary key auto_increment,
                          position_Name varchar(50),
                          salary int
);

CREATE TABLE room (
                      id int primary key auto_increment,
                      num int,
                      room_Number_Type long
);

create table available (
                           id int primary key auto_increment,
                           room_Num int,
                           arrival_dt timestamp,
                           departure_dt timestamp,
                           status boolean
);

CREATE TABLE reservation (
                             id int primary key auto_increment,
                             guest_id long,
                             date_In timestamp,
                             date_Out timestamp,
                             room_Type_Reserve long,
                             amount_Total int,
                             employee_id long,
                             hotel_id long
);

CREATE TABLE confirmation (
                              id int primary key auto_increment,
                              reservation_id long,
                              guest_id long,
                              total_Owed int,
                              room_Num_Avail int
);
