
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

-- taking backup of health_meter table
create table health_meter_bck as select * from health_meter;

-- avg weight based on gym set
select gym_set, avg(weight_kg) from health_meter group by gym_set;

-- delete all records from health_meter_bck and copy again from health_meter;
 delete from health_meter_bck;
 insert into health_meter_bck select * from  health_meter;
 
-- work_out_plan table definition
create table work_out_plan(
record_id INT NOT NULL AUTO_INCREMENT,
user_name VARCHAR(50) NOT NULL,
day_of_week VARCHAR(50) NOT NULL,
wo_desc VARCHAR(1000) NOT NULL,
PRIMARY KEY ( record_id )
)

-- some records in work_out_plan table
insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Monday", "Cardio: 10 mins Traedmill and 5 mins cycling. I kick start my week with chest exercise. I do regular 5-6 excersie as suggested by me gym trainer.");

insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Tuesday", "Cardio: 10 mins Traedmill and 5 mins cycling. Next is shoulder exercise. I do regular 5-6 excersie as suggested by me gym trainer.");
 
insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Wednesday", "Cardio: 10 mins Traedmill and 5 mins cycling. Next is Back exercise. I do regular 5-6 excersie as suggested by me gym trainer.");

insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Thursday", "Cardio: 10 mins Traedmill and 5 mins cycling. Next is Biceps exercise. I do regular 5-6 excersie as suggested by me gym trainer.");

insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Friday", "Cardio: 10 mins Traedmill and 5 mins cycling. Next is Triceps exercise. I do regular 5-6 excersie as suggested by me gym trainer.");

insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Saturday", "Cardio: 10 mins Traedmill and 5 mins cycling. Next is Legs exercise. I do regular 5-6 excersie as suggested by me gym trainer.");

insert into work_out_plan (user_name, day_of_week, wo_desc)
values("Ashish", "Sunday", "This is day off. I sit at home and eat whatever I fell and just enjoy the day. This helps me to relax my muscles!!!");

-- get numbers of days in gym per month
select count(*) from health_meter where gym_date like '2017-01-%'; -- January



