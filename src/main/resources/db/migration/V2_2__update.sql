update facility set hotel = (select id from hotels where name = 'Chicago');
update roomType set hotel = (select id from hotels where name = 'Chicago');

UPDATE employeeInfo SET position = (select id from position where positionName = 'Manager') WHERE id = 1;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 3;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 4;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Cook') WHERE id = 2;

UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Single') WHERE num = 101;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Double') WHERE num = 102;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Triple') WHERE num = 103;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Quad') WHERE num = 104;

UPDATE reservation SET roomTypeReserve = (select id from roomType where roomSize = 'Single') WHERE id = 1;
UPDATE reservation SET roomTypeReserve = (select id from roomType where roomSize = 'Double') WHERE id = 2;
UPDATE reservation SET roomTypeReserve = (select id from roomType where roomSize = 'Triple') WHERE id = 3;
UPDATE reservation SET roomTypeReserve = (select id from roomType where roomSize = 'Quad') WHERE id = 4;
UPDATE reservation SET roomTypeReserve = (select id from roomType where roomSize = 'Quad') WHERE id = 5;

UPDATE reservation SET amountTotal = (select roomRate from roomType where roomSize = 'Single') WHERE roomTypeReserve = 1;
UPDATE reservation SET amountTotal = (select roomRate from roomType where roomSize = 'Double') WHERE roomTypeReserve = 2;
UPDATE reservation SET amountTotal = (select roomRate from roomType where roomSize = 'Triple') WHERE roomTypeReserve = 3;
UPDATE reservation SET amountTotal = (select roomRate from roomType where roomSize = 'Quad') WHERE roomTypeReserve = 4;

UPDATE reservation SET hotel_id = (select id from hotels);

UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 1) where reservation_id = 1;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 2) where reservation_id = 2;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 3) where reservation_id = 3;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 4) where reservation_id = 4;
UPDATE confirmation SET guest_id = (select guest_id from reservation where id = 5) where reservation_id = 5;

UPDATE confirmation SET totalOwed = (select amountTotal from reservation where id = 1) where reservation_id = 1;
UPDATE confirmation SET totalOwed = (select amountTotal from reservation where id = 2) where reservation_id = 2;
UPDATE confirmation SET totalOwed = (select amountTotal from reservation where id = 3) where reservation_id = 3;
UPDATE confirmation SET totalOwed = (select amountTotal from reservation where id = 4) where reservation_id = 4;
UPDATE confirmation SET totalOwed = (select amountTotal from reservation where id = 5) where reservation_id = 5;

UPDATE confirmation SET roomNumAvail = (select num from Room where roomNumberType = (select roomTypeReserve from reservation where id = 1)) where reservation_id = 1;
UPDATE confirmation SET roomNumAvail = (select num from Room where roomNumberType = (select roomTypeReserve from reservation where id = 2)) where reservation_id = 2;
UPDATE confirmation SET roomNumAvail = (select num from Room where roomNumberType = (select roomTypeReserve from reservation where id = 3)) where reservation_id = 3;
UPDATE confirmation SET roomNumAvail = (select num from Room where roomNumberType = (select roomTypeReserve from reservation where id = 4)) where reservation_id = 4;
UPDATE confirmation SET roomNumAvail = (select num from Room where roomNumberType = (select roomTypeReserve from reservation where id = 5)) where reservation_id = 5;
