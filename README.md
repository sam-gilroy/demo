Hotel Reservation

Using MYSQL with Springboot, Maven, and IntelliJ

##
When using MySQL dependency
Download MySQL Community Edition (GPL) can use: https://dev.mysql.com/downloads/mysql/

get open locally and create hotelResApp db 

*on mac

$ cd /usr/local/mysql/bin/

$ ./mysql -u root -p

Once in MySQL

mysql> CREATE DATABASE hotelResApp 

mysql> USE hotelResApp 

mysql> SELECT user FROM mysql.user GROUP BY user;

mysql> CREATE USER 'hotel'@'localhost' IDENTIFIED BY 'ThePassword'; 

mysql> GRANT ALL PRIVILEGES ON * . * TO 'hotel'@'localhost';

mysql> USE hotelResApp

##
in IntelliJ -> open git project on side panel click databases and add local database using user, password, and database name

##
H2 SQL DB running in http://localhost:8080/h2-console/

##
MongoDB

Followed steps from lecture 4/15 for remote mongodb atlas


How to make contributions?

This is a group project, sorry you cannot contribute unless you are a part of the group
