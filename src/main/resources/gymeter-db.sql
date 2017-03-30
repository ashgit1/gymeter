
-- health_meter table definition

create table health_meter(
record_id INT NOT NULL AUTO_INCREMENT,
gym_date DATE NOT NULL,
weight_kg DECIMAL( 5, 2 ) NOT NULL,
treadmill_km DECIMAL( 5, 3 ) NOT NULL,
treadmill_time INT NOT NULL,
cycling_km DECIMAL( 5, 3 ) NOT NULL,
cycling_time INT NOT NULL,
gym_set VARCHAR(50) NOT NULL,
PRIMARY KEY ( record_id )
)

-- some records in health_meter table

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-01', 85.6, 1.050, 10, 1.50, 5, "Basic");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-02', 85.5, 1.055, 10, 1.55, 5, "Chest");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-03', 85.3, 1.060, 10, 1.61, 5, "Shoulder");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-04', 85.4, 1.100, 10, 1.57, 5, "Back");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-05', 85.7, 1.150, 10, 1.71, 5, "Biceps");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-06', 85.2, 1.155, 10, 1.65, 5, "Triceps");

insert into health_meter (gym_date, weight_kg, treadmill_km, treadmill_time, cycling_km, cycling_time, gym_set)
values('2017-03-07', 85.1, 1.200, 10, 1.69, 5, "Legs");
