USE assignment;
CREATE TABLE student
(
rno INT(2) NOT NULL PRIMARY KEY DEFAULT 0,
sname VARCHAR(14),
city VARCHAR(20),
state VARCHAR(20)
);
INSERT INTO student VALUES(1,"Arjun","Savarkundla","Gujarat");
INSERT INTO student VALUES(2,"Sanjay","Amreli","Gujarat");
INSERT INTO student VALUES(3,"Dharmik","Ahmedabad","Gujarat");