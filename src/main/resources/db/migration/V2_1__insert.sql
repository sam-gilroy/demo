insert into facility(facility_name, facility_avail) values ('Pool', True);

insert into room_Type (room_Size, smoking, room_Rate) VALUES ('Single', FALSE, 90);
insert into room_Type (room_Size, smoking, room_Rate) VALUES ('Double', FALSE, 100);
insert into room_Type (room_Size, smoking, room_Rate) VALUES ('Triple', FALSE, 110);
insert into room_Type (room_Size, smoking, room_Rate) VALUES ('Quad', FALSE, 120);

insert into hotels (name, address) values ('Chicago', '2020 N Seminary Ave., Chicago, IL 60614');

insert into guests (name,email) values ('John Adams','jjadams@gmail.com');
insert into guests (name,email) values ('Jamie Hughes','jhughes123@gmail.com');
insert into guests (name,email) values ('DD Hutch','DianaDean@gmail.com');
insert into guests (name,email) values ('Kelly Oz','oz_kelly@gmail.com');
insert into guests (name,email) values ('Cane Lee','CaneLee@gmail.com');

insert into employee_Info (name, email) values ('Peter June', 'pjune@hotels.com');
insert into employee_Info (name, email) values ('Cici Leader', 'cleader@hotels.com');
insert into employee_Info (name, email) values ('Carrie Austin', 'caustin@hotels.com');
insert into employee_Info (name, email) values ('Austin James', 'ajames@hotels.com');

insert into position (position_Name) values ('Manager');
insert into position (position_Name) values ('Cook');
insert into position (position_Name) values ('Front Desk');
insert into position (position_Name) values ('House Keeping');

INSERT INTO room (num, available) values (101, true);
INSERT INTO room (num, available) values (102, true);
INSERT INTO room (num, available) values (103, true);
INSERT INTO room (num, available) values (104, false);

INSERT INTO available (room_number, status, arrival_dt, departure_dt) values (1, false, '2019-04-02 12:00:00.000', '2019-04-10 12:00:00.000');
INSERT INTO available (room_number, status, arrival_dt, departure_dt) values (2, false, '2019-05-11 12:00:00.000', '2019-05-12 12:00:00.000');
INSERT INTO available (room_number, status, arrival_dt, departure_dt) values (3, false, '2019-05-19 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO available (room_number, status, arrival_dt, departure_dt) values (4, false, '2019-05-20 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO available (room_number, status, arrival_dt, departure_dt) values (4, false, '2019-05-10 12:00:00.000', '2019-06-10 12:00:00.000');

INSERT INTO reservation (guest_id, date_In, date_Out) VALUES (1, '2019-04-02 12:00:00.000', '2019-04-10 12:00:00.000');
INSERT INTO reservation (guest_id, date_In, date_Out) VALUES (2, '2019-05-11 12:00:00.000', '2019-05-12 12:00:00.000');
INSERT INTO reservation (guest_id, date_In, date_Out) VALUES (3, '2019-05-19 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO reservation (guest_id, date_In, date_Out) VALUES (4, '2019-05-20 12:00:00.000', '2019-05-25 12:00:00.000');
INSERT INTO reservation (guest_id, date_In, date_Out) VALUES (5, '2019-05-10 12:00:00.000', '2019-06-10 12:00:00.000');

INSERT INTO confirmation (reservation_id) VALUES (1);
INSERT INTO confirmation (reservation_id) VALUES (2);
INSERT INTO confirmation (reservation_id) VALUES (3);
INSERT INTO confirmation (reservation_id) VALUES (4);
INSERT INTO confirmation (reservation_id) VALUES (5);
