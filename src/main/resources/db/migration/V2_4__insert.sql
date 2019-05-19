insert into hotels (name, address) values ('Chicago', '2020 N Seminary Ave., Chicago, IL 60614');

update facility set hotel = (select id from hotels where name = 'Chicago');
update roomType set hotel = (select id from hotels where name = 'Chicago');

