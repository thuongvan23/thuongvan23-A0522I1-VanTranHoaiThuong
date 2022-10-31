select * from student
where studentName like "H%";

select * from class
where month(startDate) = 12;

select * from `subject`
where credit between 3 and 5;

update student
set classID = 2
where studentName = "Hung";

select student.studentName, subject.subName, mark.Mark From student, mark, `subject`
order by mark.Mark desc, student.studentName;





