update facility set hotel = (select id from hotels where name = 'Chicago');
update room_Type set hotel = (select id from hotels where name = 'Chicago');

UPDATE employeeInfo SET position = (select id from position where positionName = 'Manager') WHERE id = 1;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 3;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 4;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Cook') WHERE id = 2;

UPDATE room SET room_Number_Type = (select id from room_Type where room_Size = 'Single') WHERE num = 101;
UPDATE room SET room_Number_Type = (select id from room_Type where room_Size = 'Double') WHERE num = 102;
UPDATE room SET room_Number_Type = (select id from room_Type where room_Size = 'Triple') WHERE num = 103;
UPDATE room SET room_Number_Type = (select id from room_Type where room_Size = 'Quad') WHERE num = 104;

UPDATE reservation SET room_Type_Reserve = (select id from room_Type where room_Size = 'Single') WHERE id = 1;
UPDATE reservation SET room_Type_Reserve = (select id from room_Type where room_Size = 'Double') WHERE id = 2;
UPDATE reservation SET room_Type_Reserve = (select id from room_Type where room_Size = 'Triple') WHERE id = 3;
UPDATE reservation SET room_Type_Reserve = (select id from room_Type where room_Size = 'Quad') WHERE id = 4;
UPDATE reservation SET room_Type_Reserve = (select id from room_Type where room_Size = 'Quad') WHERE id = 5;

UPDATE reservation SET amount_Total = (select roomRate from room_Type where room_Size = 'Single') WHERE room_Type_Reserve = 1;
UPDATE reservation SET amount_Total = (select roomRate from room_Type where room_Size = 'Double') WHERE room_Type_Reserve = 2;
UPDATE reservation SET amount_Total = (select roomRate from room_Type where room_Size = 'Triple') WHERE room_Type_Reserve = 3;
UPDATE reservation SET amount_Total = (select roomRate from room_Type where room_Size = 'Quad') WHERE room_Type_Reserve = 4;

UPDATE reservation SET hotel_id = (select id from hotels);

UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 1) where reservation_id = 1;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 2) where reservation_id = 2;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 3) where reservation_id = 3;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 4) where reservation_id = 4;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 5) where reservation_id = 5;

UPDATE confirmation SET total_Owed = (select amount_Total from reservation where id = 1) where reservation_id = 1;
UPDATE confirmation SET total_Owed = (select amount_Total from reservation where id = 2) where reservation_id = 2;
UPDATE confirmation SET total_Owed = (select amount_Total from reservation where id = 3) where reservation_id = 3;
UPDATE confirmation SET total_Owed = (select amount_Total from reservation where id = 4) where reservation_id = 4;
UPDATE confirmation SET total_Owed = (select amount_Total from reservation where id = 5) where reservation_id = 5;

UPDATE confirmation SET room_Num_Avail = (select num from Room where room_Number_Type = (select room_Type_Reserve from reservation where id = 1)) where reservation_id = 1;
UPDATE confirmation SET room_Num_Avail = (select num from Room where room_Number_Type = (select room_Type_Reserve from reservation where id = 2)) where reservation_id = 2;
UPDATE confirmation SET room_Num_Avail = (select num from Room where room_Number_Type = (select room_Type_Reserve from reservation where id = 3)) where reservation_id = 3;
UPDATE confirmation SET room_Num_Avail = (select num from Room where room_Number_Type = (select room_Type_Reserve from reservation where id = 4)) where reservation_id = 4;
UPDATE confirmation SET room_Num_Avail = (select num from Room where room_Number_Type = (select room_Type_Reserve from reservation where id = 5)) where reservation_id = 5;
