# Problem Statement: Course Management Application

Design and develop a Course Management Application that helps manage students, instructors, courses, and publications in an educational platform.

The system should model real-world relationships between these entities and store basic details for each.


## Core Entities & Responsibilities:

1. Student
Each student in the system should have basic information stored, such as: <br>

	   •	Student ID <br>
	   •	Name <br>
	   •	Email <br>

A student should be able to enrol in multiple courses at the same time.



2. Instructor <br>
   
Each instructor should have basic information stored, such as: <br>

	   •	Instructor ID <br>
	   •	Name <br>
	   •	Email <br>
	   •	Specialization <br>

An instructor can: <br>

	   •	Teach one or more courses <br>
	   •	Publish articles related to their expertise <br>


3. Course <br>
Each course should store basic details, such as: <br>

	   •	Course ID <br>
	   •	Course Title <br>
	   •	Description <br>
	   •	Duration <br>

Rules:

	   •	One course is handled by exactly one instructor
	   •	Multiple students can enrol in the same course

<br>

4. Publication (Article) <br>
Instructors can publish articles or content pieces. <br>

Each publication should store: <br>

	   •	Publication ID <br>
	   •	Title <br>
	   •	Content / Summary <br>
	   •	Published Date <br>

Rules: <br>

	   •	A publication is always authored by one instructor  <br>
	   •	An instructor can publish multiple articles <br>


## Relationship Summary:

	   •	One Instructor → Multiple Courses
	   •	One Course → One Instructor
	   •	One Student → Multiple Courses
	   •	One Course → Multiple Students
	   •	One Instructor → Multiple Publications
       •   One Publication → One Instructor 
    

one row from one table is related to one or many rows in another table, and one row from the other table is related to one or more rows in the table.

<br>
    multiple rows from one table can be related to multiple rows in another table, and also vise versa