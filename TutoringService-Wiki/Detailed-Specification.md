# Title: Remove/Fire a tutor from the Tutoring Service System (Mohammad Noor)

Identifier: T4ASR4 (Fire Tutor)

Actors:  Company Manager

Intention: The Tutor Service System shall allow the company manager to remove a tutor from the Tutoring Service System

Scenario: The company manager will try to remove a tutor from the Tutoring Service System if the manager is unsatisfied with the rating of the tutor or the reviews of the tutor by students.

Precondition: The company manager is able to successfully log into the system

Step:
1. The company manager will open the record of the tutor
2. The company manager will then view ratings and reviews of the tutor
3. The company manager is unsatisfied with the ratings and/or reviews of the tutor
4. The company manager will request the system to remove the tutor from the system itself. 
5. The system will remove the tutor from itself.

Alternate / Exception Path:

2a: No ratings or reviews present
* 2a.1: Company manager closes the record of the tutor

3a: Company manager satisfied with the ratings and/or reviews of the tutor
* 3a.1: Company manager closes the record of the tutor

Postcondition (success): The tutor is removed from the Tutoring Service System

Postcondition (failure):  The tutor is not removed from the Tutoring Service System

# Title: Schedule a requested group review session (Muhammad Huzaifa Elahi)

Identifier: T4ASR5 (Schedule Review Session)

Actors:  Company Manager

Intention: The tutor service system shall allow the company manager to manually schedule the big room with the tutor for the group review session

Scenario: The company manager will try to schedule a big room with a specific tutor for a group review session, as requested by a number of students.

Precondition: The company manager is able to successfully log into the system

Step:
1. The company manager chooses to create a group session for students who wish to take the same offering
2. The company manager will search for a list of tutors who teach that subject
3. The company manager selects a tutor with availability to host the session
4. The company manager selects an available big room 
5. The system schedules the request 
6. The students who requested the session receive a notification that the session is arranged

Alternate / Exception Path:

1a. No request received

* 1a1. No session is scheduled 

3a. No tutor available

* 3a1. No session is scheduled

4a. No big room available

* 4a1. No session is scheduled

Postcondition (success): The big room is booked for a group review session

Postcondition (failure):  No review session is scheduled

* * * 

# Title: Review and moderate comments (Menglin He)

Identifier: T4ASR6 (Monitor Review)

Actors:  Company Manager

Intention: The tutor service system shall give the company manager access to moderate evaluation comments given by students

Scenario: The company manager will review, moderate and approve the comment given by students and upload the comment to the company’s webpage

Precondition: The student provides comment/feedback regarding an offering which the student is enrolled in 

Step:
1.	The company manager logs in to the system successfully
2.	The company manager looks up the comments provided by student sorted by time
3.	The company manager selects the non-reviewed comment on the time base
4.	The company manager reviews and moderates the selected comment
5.	The company manager decides whether this comment is appropriated to be placed on the company’s webpage
6.	The student who provided this comment will receive a notification that his/her comment/feedback is approved or not 

Alternate / Exception Path:

1a. Log in is not successful
* 1a1. Manager can not see the comments

3a. No non-reviewed comments available
* 3a1. All the comments have been reviews, no action required

Postcondition (success): The comment given by the student is approved by the company manager and put on the company’s webpage under the course offering

Postcondition (failure):  The comment given by the student is declined by the company for some reason, the comment is archived in the database but will not be posted on the webpage


* * * 
# Title: Decline a tutor application for a specific subject (Charles Liu)

Identifier: TASR9 (Decline Tutor)

Actors: Company Manager

Intention: The tutoring service system shall allow the company manager to be able to decline an application for tutoring a specific subject

Scenario: The company manager will try to decline a tutor’s application for a specific subject if the tutor does not meet the requirements for tutoring this subject.

Precondition: The company manager is able to successfully log into the system

Steps:
1. The company manager will open a tutor’s application for a specific subject.
2. The company manager will review the application carefully.
3. The company manager is unsatisfied with the tutor’s experience or background and decides not to proceed with the application.
4. The company manager will request the system to decline this specific application.
5. The system deletes the application.
6. The tutor who owns this application will receive a notification that the application has been declined.

Alternate / Exception Path

1a. The application cannot be found.
* 1a1. No action is taken.

2a. The tutor deletes the application.
* 2a. 1. No action is taken.

3a. The company manager approves the application.
* 3a. 1. The company manager chooses “Accept Application”.

Postcondition (success): The application is removed from the Tutoring Service System.
Postcondition (failure): The application is not removed from the Tutoring Service System.


* * * 

# Title: Add Subject (Anas Deis)

Identifier: T4ASR11 (Add Subject)

Intention: The tutoring service system shall allow the company manager to add a new subject to the tutoring system upon the student's request.

Scenario: The Manager adds a new subject to the System upon a Student’s request.

Multiplicity: There can always be only one Manager interacting with the system at a given time.

Primary Actor: Manager

Secondary Actors: None

Precondition: The Manager is logged in.

Step: 
1. The system notifies the Manager of any new subject requests.
2. The manager selects a subject request.
3. The manager validates the subject request.
4. The manager adds subject to the System.
5 The Student who added the subject request is notified that the Subject is added.

Alternate / Exception Path:

1a. The system has no new subject requests.

2a. There are no subject requests available.
* 2a.1 No subject is added.

3a. The subject request cannot be validated due to the subject already existing in the System.
* 3a.1 No subject is added.

Postcondition (success): The subject is added to the System.

Postcondition (failure): The subject is not added to the System.

