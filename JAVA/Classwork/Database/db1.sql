CREATE DATABASE java;
USE java;
CREATE TABLE student
(
sid INT(10) PRIMARY KEY,
sname VARCHAR(25) NOT NULL,
city VARCHAR(25) NOT NULL);
INSERT INTO student VALUES(123,"Rahul","S.Nagar");
INSERT INTO student VALUES(1,"tops","H.nagar");
INSERT INTO student VALUES(2,"Tops","G.Nagar");
INSERT INTO student VALUES(3,"tops","Savarkundla");

UPDATE student SET city="Ahmedabad" WHERE sname="Arjun";
UPDATE student SET city="Rajkot" WHERE sid=123;

DELETE FROM student WHERE sid = 123;

SELECT * FROM student;
SELECT sname, city FROM student;
SELECT * FROM student WHERE sname="Tops";

TRUNCATE TABLE student;
DROP TABLE student;
DROP DATABASE java;