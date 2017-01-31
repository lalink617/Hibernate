create database discografica;
use discografica;

create table album(
  id int(4) primary  key,
  titulo_al varchar(20),
  anio year
);

create table cancion(
  titulo varchar(20) primary key,
  duracion int(4),
  letra varchar(200),
  id_album int(4) references album(id)
);

insert into album values(1, 'ella y yo', '2014');
insert into album values(2, 'ae payá', '2010');
insert into album values(3, 'ea pop', '2016');
insert into album values(4, 'Nani coré', '2010');


insert into cancion values('Tititiru', 2, 'akljalskdjlaskdjls', 1);
insert into cancion values('rarara', 3, 'asdasd', 2);
insert into cancion values('eerer', 3, 'asdasd', 2);
insert into cancion values('la tarara si', 2, 'la tarara no, la tarara madre que la bailo yo', 4);
insert into cancion values('poip', 1, 'dads', 3);