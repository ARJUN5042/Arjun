CREATE DATABASE emp;
CREATE TABLE emp
(
empno INT(4) NOT NULL DEFAULT 0;
ename VARCHAR(10),
job VARCHAR(9),
mgr INT(4),
hiredate DATE,
sal DECIMAL(7,2),
comm DECIMAL(7,2),
deptno INT(2),
PRIMARY KEY(empno,deptno)
);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7369,"SMITH","CLERK",7902,"1980-12-17",800.00,20);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7499,"ALLEN","SALESMAN",7698,"1981-02-20",1600.00,300.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7521,"WARD","SALESMAN",7698,"1981-02-22",1250.00,500.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7566,"JONES","MANAGER",7839,"1981-04-02",2975.00,20);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7654,"MARTIN","SALESMAN",7698,"1981-09-28",1250.00,1400.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7698,"BLAKE","MANAGER",7839,"1981-05-01",2850.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7782,"CLARK","MANAGER",7839,"1981-06-09",2450.00,10);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7788,"SCOTT","ANALYST",7566,"1987-06-11",3000.00,20);
INSERT INTO emp(empno,ename,job,hiredate,sal,deptno) values(7839,"KING","PRESIDENT","1981-11-17",5000.00,10);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7844,"TURNER","SALESMAN",7698,"1981-08-09",1500.00,0.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7876,"ADAMS","CLERK",7788,"1987-07-13",1100.00,20);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7900,"JAMES,"CLERK",7698,"1981-03-12",950.00,30);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7902,"FORD","ANALYST",7566,"1981-03-12",3000.00,20);
INSERT INTO emp(empno,ename,job,mgr,hiredate,sal,deptno) values(7934,"MILLER","CLERK",7782,"1982-01-23,1300.00,10);