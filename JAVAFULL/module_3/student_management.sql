Create database student_management;
use student_management;
create table Class(
	classID int primary key not null auto_increment,
	className varchar(60) not null,
	startDate date not null,
	`status` bit
);
create table Student(
	studentID int not null primary key auto_increment,
	studentName varchar(30) not null,
	Address varchar(50),
	phone varchar(20),
	`status` bit,
	classID int not null,
    foreign key (classID) references class (classID)
);
create table Subject(
	subID int not null primary key auto_increment,
	subName varchar(30) not null,
	credit tinyint not null default 1 check ( credit >=1),
	`status` bit default 1 
);
create table Mark(
	MarkId    int not null primary key auto_increment,
    SubId     int not null,
    StudentId int not null,
    Mark      float   default 0 check ( Mark between 0 and 100),
    ExamTimes tinyint default 1,
    foreign key (subID) references `subject`(subID),
    foreign key (studentID) references Student(studentID)
);
insert into Class
	values (1, 'A1', '2008-12-20', 1),
		(2, 'A2', '2008-12-20', 1),
        (3, 'B3', current_date, 0);
insert into student (StudentName, Address, Phone, Status, ClassId)
	values ('Hung', 'Ha Noi', '0912113113', 1, 2),
		('Hoa', 'Hai phong', null , 1, 3),
        ('Manh', 'HCM', '0123123123', 0, 1);
insert into subject
	values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
insert into mark (SubId, StudentId, Mark, ExamTimes)
	values (1, 1, 8, 1),
	   (1, 2, 10, 2),
       (2, 1, 12, 1);

drop database student_management; 