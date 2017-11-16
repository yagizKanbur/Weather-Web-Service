create table if not exists City(
    num INT PRIMARY KEY,
    cityName varchar(25),
    countryName varchar(25)
);
delete from City;
INSERT INTO City(1,'Istanbul','Turkey');
INSERT INTO City((2,'Sakarya','Turkey');