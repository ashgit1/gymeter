
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
select count(*) from health_meter where gym_date like '%-01-%'; 	-- January

-- get number of each gym sets
select count(*) from health_meter where gym_set='Basics';

-- get all the number of gym_set in a single query
select gym_set, count(*) as 'number(set)' from health_meter 
group by gym_set;

-- get the weights of a particular month
select weight_kg, gym_date from health_meter where gym_date like '%-01-%';

-- Total run on treadmill
mysql> select sum(treadmill_km), sum(treadmill_time) as minutes, curdate() from health_meter;
+-------------------+---------+------------+
| sum(treadmill_km) | minutes | curdate()  |
+-------------------+---------+------------+
|           114.089 |     917 | 2017-07-02 |
+-------------------+---------+------------+

-- total cycling
mysql> select sum(cycling_km), sum(cycling_time) as minutes, curdate() from health_meter;
+-----------------+---------+------------+
| sum(cycling_km) | minutes | curdate()  |
+-----------------+---------+------------+
|         189.130 |     540 | 2017-07-02 |
+-----------------+---------+------------+

-- Replace a word in a column
update work_out_plan
set wo_desc = REPLACE(wo_desc, 'Traedmill' , 'Treadmill')
where user_name='Ashish';

-- 2017 recap Start:

select gym_set, count(*) as 'number(set)' from health_meter
    -> group by gym_set;
+----------+-------------+
| gym_set  | number(set) |
+----------+-------------+
| Abs      |           1 |
| Back     |          32 |
| Basics   |          24 |
| Biceps   |          40 |
| Chest    |          38 |
| Legs     |          14 |
| Shoulder |          38 |
| Triceps  |          38 |
+----------+-------------+
8 rows in set (0.03 sec)

mysql>  select sum(treadmill_km), sum(treadmill_time) as minutes, curdate() from health_meter;
+-------------------+---------+------------+
| sum(treadmill_km) | minutes | curdate()  |
+-------------------+---------+------------+
|           183.965 |    1344 | 2018-01-13 |
+-------------------+---------+------------+
1 row in set (0.04 sec)

mysql> select sum(cycling_km), sum(cycling_time) as minutes, curdate() from health_meter;
+-----------------+---------+------------+
| sum(cycling_km) | minutes | curdate()  |
+-----------------+---------+------------+
|         285.330 |     775 | 2018-01-13 |
+-----------------+---------+------------+
1 row in set (0.00 sec)

-- 2017 recap End:



