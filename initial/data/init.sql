create table FDATA.PUBLIC.users(
  id VARCHAR(20) PRIMARY KEY,
  name VARCHAR(20),
  age INT,
  sex VARCHAR(6),
  native VARCHAR(20)
);

insert into FDATA.PUBLIC.users VALUES ('001','Jack',20,'male','China');
insert into FDATA.PUBLIC.users VALUES ('002','Tom',20,'male','China');
insert into FDATA.PUBLIC.users VALUES ('003','Jerry',20,'male','China');

select * from users;