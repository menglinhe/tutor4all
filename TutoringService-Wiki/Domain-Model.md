# A brief overview of the approach of design the domain model

We begin with drawing analyzing the whole project and drawing the use case because the use case gives us some intention about the classes, relationship, attributes for our domain model. After having a draft of use case, 
we come up with 12 classes and between two meetings, one student in our team (@Muhammad Huzaifa Elahi) has the first version of the Domain Model. 
The first version of the domain model was discussed during our second meeting, modifications were adapted during every single meeting until the deliverable time. 

Some key decisions regarding the domain model: 
* Create Id for each class, which will be used as the primary key for further data mapping
* Generalization from Person to Manager, Student, and Tutor to remove redundancy (even if this relation complicate our persistence layer)
* * After debugging the test case, the ID for student, manager, and tutor has been removed, instead, a PersonID is added 
* Created two data structures (date and time) to represent data
* Create enumeration class for subject type to different high school, cegep, and university course
* Connect Tutor with Tutor Application (which contains both new application or existing tutor application for a new subject), available session (to retrieve the availability of a tutor) and offering (to capture the total tutoring courses offered) 
* Connect Review (student review) with Manager (to moderate and approve) and offering ( each offering will have a review from the student who takes that course, can navigate to a student from offering)
* Connect Classroom with Manager and Offering, add Boolean isBigRoom to realize the manually assign a big room with review session
* Connect Subject Request with Student and Manager in order to submit a subject request (from student) and approve the request (for manager) 
* Connect Commission with Manager and Offering because each offering can have a different commission (since the hourly rate might be different) 
* Composition relation from Subject to Offering to capture the part-whole relationship
* Master class (root class) as Tutoring System and have every class a part of it


* * * 
![ca mcgill ecse321 tutoringservice model umlcd](https://user-images.githubusercontent.com/46466986/66788512-d1ed6c80-eeb5-11e9-99ef-4c0909090bbe.png)
