create table hotels (
    id int primary key auto_increment,
    name varchar(10),
    address varchar(80)
);


create table facility(
    id int primary key auto_increment,
    facility_name varchar(10),
    facility_avail boolean
);

