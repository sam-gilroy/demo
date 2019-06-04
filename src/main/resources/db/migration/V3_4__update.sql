/*
UPDATE employeeInfo SET position = (select id from position where positionName = 'Manager') WHERE id = 1;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 3;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Front Desk') WHERE id = 4;
UPDATE employeeInfo SET position = (select id from position where positionName = 'Cook') WHERE id = 2;
*/
