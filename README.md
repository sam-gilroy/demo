Hotel Reservation

Using MYSQL with Springboot, Maven, and IntelliJ

Download MySQL Community Edition (GPL) can use: https://dev.mysql.com/downloads/mysql/

get open locally and create hotelResApp db 

*on mac

$ cd /usr/local/mysql/bin/

$ ./mysql -u root -p

Once in MySQL

mysql> CREATE DATABASE hotelResApp 

mysql> USE hotelResApp 

mysql> CREATE USER 'hotel'@'localhost' IDENTIFIED BY 'ThePassword'; 

mysql> GRANT ALL PRIVILEGES ON * . * TO 'hotel'@'localhost';

##
in IntelliJ -> open git project on side panel click databases and add local database using user, password, and database name

##
MongoDB

Followed steps from: https://ademirgabardo.wordpress.com/2016/02/02/installing-and-running-mongodb-on-mac-osx-for-beginners/


How to make contributions?

This is a group project, sorry you cannot contribute unless you are a part of the group
