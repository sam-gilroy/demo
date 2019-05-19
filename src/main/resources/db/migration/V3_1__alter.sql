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
