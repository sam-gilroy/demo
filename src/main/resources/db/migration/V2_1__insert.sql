insert into facility(facility_name, facility_avail) values ('Pool', True);

insert into roomType (roomSize, smoking, roomRate) VALUES ('Single', FALSE, 90);
insert into roomType (roomSize, smoking, roomRate) VALUES ('Double', FALSE, 100);
insert into roomType (roomSize, smoking, roomRate) VALUES ('Triple', FALSE, 110);
insert into roomType (roomSize, smoking, roomRate) VALUES ('Quad', FALSE, 120);

insert into hotels (name, address) values ('Chicago', '2020 N Seminary Ave., Chicago, IL 60614');

insert into guests (name,email) values ('John Adams','jjadams@gmail.com');
insert into guests (name,email) values ('Jamie Hughes','jhughes123@gmail.com');
insert into guests (name,email) values ('DD Hutch','DianaDean@gmail.com');
insert into guests (name,email) values ('Kelly Oz','oz_kelly@gmail.com');
insert into guests (name,email) values ('Cane Lee','CaneLee@gmail.com');

insert into employeeInfo (name, email) values ('Peter June', 'pjune@hotels.com');
insert into employeeInfo (name, email) values ('Cici Leader', 'cleader@hotels.com');
insert into employeeInfo (name, email) values ('Carrie Austin', 'caustin@hotels.com');
insert into employeeInfo (name, email) values ('Austin James', 'ajames@hotels.com');

insert into position (positionName) values ('Manager');
insert into position (positionName) values ('Cook');
insert into position (positionName) values ('Front Desk');
insert into position (positionName) values ('House Keeping');

INSERT INTO room (num, available) values (101, true);
INSERT INTO room (num, available) values (102, true);
INSERT INTO room (num, available) values (103, true);
INSERT INTO room (num, available) values (104, true);

INSERT INTO available (roomNum, status) values (104, true);
