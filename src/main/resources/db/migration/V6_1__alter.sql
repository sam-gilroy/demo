CREATE TABLE confirmation (
    id int primary key auto_increment,
    reservation_id long,
    guest_id long,
    totalOwed int,
    roomNumAvail int
);
