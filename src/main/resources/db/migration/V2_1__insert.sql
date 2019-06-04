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
INSERT INTO room (num, available) values (104, false);

INSERT INTO available (roomNum, status, arrival_dt, departure_dt) values (101, false, '2019-04-02 12:00:00.000', '2019-04-10 12:00:00.000');
INSERT INTO available (roomNum, status, arrival_dt, departure_dt) values (102, false, '2019-05-11 12:00:00.000', '2019-05-12 12:00:00.000');
INSERT INTO available (roomNum, status, arrival_dt, departure_dt) values (103, false, '2019-05-19 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO available (roomNum, status, arrival_dt, departure_dt) values (104, false, '2019-05-20 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO available (roomNum, status, arrival_dt, departure_dt) values (104, false, '2019-05-10 12:00:00.000', '2019-06-10 12:00:00.000');

INSERT INTO reservation (guest_id, dateIn, dateOut) VALUES (1, '2019-04-02 12:00:00.000', '2019-04-10 12:00:00.000');
INSERT INTO reservation (guest_id, dateIn, dateOut) VALUES (2, '2019-05-11 12:00:00.000', '2019-05-12 12:00:00.000');
INSERT INTO reservation (guest_id, dateIn, dateOut) VALUES (3, '2019-05-19 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO reservation (guest_id, dateIn, dateOut) VALUES (4, '2019-05-20 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO reservation (guest_id, dateIn, dateOut) VALUES (5, '2019-05-10 12:00:00.000', '2019-06-10 12:00:00.000');

INSERT INTO confirmation (reservation_id) VALUES (1);
INSERT INTO confirmation (reservation_id) VALUES (2);
INSERT INTO confirmation (reservation_id) VALUES (3);
INSERT INTO confirmation (reservation_id) VALUES (4);
INSERT INTO confirmation (reservation_id) VALUES (5);
