--Write an SQL query to retrieve all rows from a table named "customers".

create  database lohith;
use lohith;
create table customer(
id int,
name varchar(20)
);
insert into customer values(101,"gouthu"),
(102,"dharani"),
(103,"divya"),
(104,"pravya");
select * from customer;


-- Write an SQL query to retrieve the names of all customers who have placed an order in the past month.

create database ex1;
use ex1;
create table cust(
id int,
name varchar(20),
orders varchar(20)
);
insert into cust values(101,"ramu","june"),
(102,"sita","april"),
(103,"lucky","july"),
(104,"ram","april");
select * from cust where orders="april";

--Write an SQL query to find the names of all employees whose age is greater than 30.
create database ex2;
use ex2;
create table employees(
id int,
name varchar(20),
age int
);
insert into employees values(101,"ramu",23),
(102,"sita",33),
(103,"geetha",27),
(105,"gita",35),
(106,"rahul",40);
select * from employees where age>30;


--Write an SQL query to retrieve the names of all employees who belong to the "Sales" department.
create database ex4;
use ex4;
create table emp(
id int,
names varchar(20),
dept varchar(20)
);
insert into emp values(101,"ramu","sales"),
(102,"rahul","E.O"),
(103,"sita","Head"),
(104,"radha","sales");
select * from emp where dept="sales";


--Write an SQL query to retrieve the names of all customers who have placed orders with a total amount exceeding $1000.

create database ex5;
use ex5;
create table customers1(
id int,
name varchar(20),
orderplaced int,
amount int
);
insert into customers1 values(101,"gouthu",3,2000),
(102,"lohi",2,900),
(103,"prasad",5,1500),
(104,"vasavi",2,300);
select * from customers1 where amount>1000;



