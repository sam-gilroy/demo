/*
CREATE TABLE room (
    id int primary key auto_increment,
    num int,
    available boolean,
    roomNumberType long
);

INSERT INTO room (num, available) values (101, true);
INSERT INTO room (num, available) values (102, true);
INSERT INTO room (num, available) values (103, true);
INSERT INTO room (num, available) values (104, FALSE);

UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Single') WHERE num = 102;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Double') WHERE num = 101;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Triple') WHERE num = 103;
UPDATE room SET roomNumberType = (select id from roomType where roomSize = 'Triple') WHERE num = 104;
*/
