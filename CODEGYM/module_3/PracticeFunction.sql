use student_management;
select * from subject
where credit = (select max(credit) from `subject`);

select * from mark
where mark = (select max(mark) from mark);

select *, avg(mark) as avg_mark
from student join mark on student.studentID = mark.studentId
order by avg(mark) DESC;
