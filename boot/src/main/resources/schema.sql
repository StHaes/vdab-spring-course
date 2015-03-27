create table animals (
  id identity,
  type varchar(30) not null,
  name varchar(50) not null
);

insert into animals(name, type) values('Shere Khan', 'tiger');
insert into animals(name, type) values('Dumbo', 'elephant');
insert into animals(name, type) values('Bertha', 'hippo');
insert into animals(name, type) values('Hao Hao', 'panda');
insert into animals(name, type) values('Xing Hui', 'panda');
insert into animals(name, type) values('Ceasar', 'chimp');