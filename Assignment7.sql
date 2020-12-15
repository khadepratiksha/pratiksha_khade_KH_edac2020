
use db;

CREATE TABLE  Ord_master(Ord_no INT primary KEY, Cust_cd VARCHAR(20),Status CHAR);
insert into Ord_master values(1,'C1','P');
desc Ord_master;

/***************Create table Ord_dtl************************/
CREATE TABLE  Ord_dtl(Ord_no INT,Prod_cd VARCHAR(20),Qty INT3,CONSTRAINT FK foreign key(Ord_no) references Ord_master(Ord_no));
insert into Ord_dtl values(1,'P1',100),(1,'P2',200);
desc Ord_dtl;

/****************Create table Prod_master************/
CREATE TABLE  Prod_master( Prod_cd varchar(10) primary KEY,Prod_name VARCHAR(20), Qty_in_stock INT4,Booked_qty INT4);
insert into Prod_master values('P1','Floppies',10000,1000),('P2','Printers',5000,600),('P3','Modems',3000,200);
desc Prod_master;

CREATE TABLE EMP(empno int(5),ename varchar(10),job varchar(50),mgr int(5),hiredate date,sal int(15),deptno int(5));

/*
1. Write a Before Insert trigger on Ord_dtl. Anytime a row is inserted in Ord_dtl, the
Booked_qty in Prod_master should be increased accordingly.
*/
delimiter $$
CREATE TRIGGER QUE1 BEFORE INSERT ON Ord_dtl
FOR EACH ROW 
BEGIN
UPDATE Prod_master SET Booked_qty=Booked_qty + NEW.Qty WHERE  Prod_cd=NEW.Prod_cd;
END$$
insert into Ord_dtl values(1,'P3',100);
-- delete from Ord_dtl where Prod_cd='P3'

/*Write a Before Delete trigger on Ord_dtl. Anytime a row is deleted from Ord_dtl, the
Booked_qty in Prod_mastershould be decreased accordingly.
*/
delimiter $$
CREATE TRIGGER QUE2 AFTER DELETE ON Ord_dtl
FOR EACH ROW 
BEGIN
set SQL_SAFE_UPDATES=0;
UPDATE Prod_master SET Booked_qty=Booked_qty - OLD.Qty WHERE  Prod_cd=OLD.Prod_cd;
END$$
CREATE TABLE dept_sal (dept_no INT , tota_salary INT4); 
INSERT INTO dept_sal values(10,35000),(11,45000);
DESC dept_sal;
select * from Ass.EMP;

/*
Que3)write A trigger to update the total salary of a department in dept_sal  table 
 when an employee is added or removed from  emp table .
 */
 delimiter $$
CREATE TRIGGER QUE AFTER INSERT ON EMP
FOR EACH ROW
BEGIN
SET SQL_SAFE_UPDATES=0;
UPDATE DEPT_SAL SET tota_salary=tota_salary + NEW.SAL WHERE DEPT_NO=NEW.DEPTNO;
END$$


/*
Create table dept_sal (dept_no, tota_salary) – this table contains the total 
of salaries of employees working into that particular department
*/
delimiter $$
CREATE TRIGGER QUE4 AFTER DELETE ON EMP
FOR EACH ROW
BEGIN
UPDATE DEPT_SAL SET tota_salary=tota_salary - OLD.SAL WHERE DEPT_NO=OLD.DEPTNO;
END$$
-- DELETE FROM EMP WHERE EMPNO=1010