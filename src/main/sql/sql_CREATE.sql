CREATE TABLE student(
	sno INT PRIMARY KEY,
	NAME VARCHAR(30),
	age INT)
INSERT INTO student VALUES('110','sawyer','18');
INSERT INTO student VALUES('111','sayer','17');
INSERT INTO student VALUES('113','syer','16');

SELECT * FROM student;
SELECT * FROM student WHERE sno = 110;