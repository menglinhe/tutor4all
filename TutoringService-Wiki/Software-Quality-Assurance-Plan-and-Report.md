# SOFTWARE QUALITY ASSURANCE PLAN

For our software quality assurance plan, since it is not possible to do the exhausting test, we decide to test the valid entry and the edge case for failing. 

## **Unit testing with JUnit**

*For our project, we use both <u>Static V&V - Modern Review</u> and <u>Dynamic V&V model</u> since Modern Review adopts better with team members with different time schedule while we need a working application so Dynamic V&V is important. Also, the white-box testing for the Unit test is adapted.*

* By using <u>git and GitHub</u> give an advantage of collaborating with the project, the test cases are implemented by each member of the team on their local machine and then pushed to their own branch.   
* A <u>merge request</u> is then created for the code review and, typically, another team member will go through the code while waiting for the automatically build triggered by Travis CI and leave comments.   
* <u>And never work directly with master and every single merge to master should come with a successful Travis CI Build.</u>  
* Also, <u>coding convention is follwed</u> by all team members based on the tutorial demo project or a skeleton created by one of the team members. 

- The 'creation' methods like testMockLonginCreation() test that the created object is not null.    
- The 'get' methods like testMockLoginQueryFound() and testMockLoginQueryNotFound() test that the returned object is correct for a valid key and incorrect (null) for an invalid key.     
- The 'getExisting' methods like testGetExistingLogin() that return the existed created object with true. 

### Test Coverage

*The test coverage for Service Tests is <u>92.9%</u>. You can refer to the screenshot below.*
![mock]![mock](https://user-images.githubusercontent.com/46466986/67991948-5576bf80-fc11-11e9-9777-8864243d972a.png)

*The test coverage for TestTutoringServiceService is 91.7%. You can refer to the screenshot below.* 

![service](https://user-images.githubusercontent.com/46466986/67991945-54459280-fc11-11e9-8906-bae8370513cb.png)

Please note that, for our TestTutoringServiceService, the coverage is not 100% but can be very well explained: 

- For a normal creation test, the code not being covered is fail() in the try-catch block, here, since we are testing a valid entry, so we will stop at the normal creation method and will not be able to reach fail(). 
![fail()](https://user-images.githubusercontent.com/46466986/67992009-8a831200-fc11-11e9-8614-23080c5f8561.png)

- For a non-valid entry, ie, null values for all the parameters, what we want here is catch the error and print out the error message and then compare the error we get from the test with what we have defined in the service file, so the try block is failing for sure so we can reach the catch block and throw exceptions. 
![create](https://user-images.githubusercontent.com/46466986/67992005-88b94e80-fc11-11e9-9182-46f2c5adbb7d.png)

*NOTE: We need to run JUnit test individually for our two test classes inside <u>ca.mcgill.ecse321.tutoringservice.service</u> package, otherwise, another test class will have 0% test coverage.* 

## **RESTful service test with [issue#61](https://github.com/McGill-ECSE321-Fall2019/project-group-12/issues/61)**
* Considering a large amount of the screenshot related to RESTful service test, please refer to this [link](https://drive.google.com/drive/u/0/folders/1uFaPBdmJMQN6WntEOG7ZVJ0Nmoc_jNLG) to see all the screenshots.

## **Integration Testing**

**As discussed during the lecture, no actual unit test will be written regarding the Integration Testing of Backend Services, instead, a text explanation and expected integration test will be provided in this section.**

Our project has been divided into three viewpoints, which are: manager, student, and tutor. 

### Manager View Point

- RESTful mapping with controller method
- We send HTTP requests to the servers to test if we receive a correct response,
- Check with ARC with code 200 ok
- For each response, check the JSON content of the object to see if it is what we've created

### Tutor View Point

- We expected to have a request from the tutor for the tutor application for a specific subject or as a new tutor
- We might be requested to respond for the tutor application, a commission percentage with the offering of a tutor, assign a tutor for a review session in a big room

### Student View Point

- We expected to have a request from the student for a subject request, ie, a subject which is not covered in our system and the student wants to have a tutor with it.
- We might be requested to give a response to a subject request, assign the student to a big room with tutor for group review

## System Testing

There will be no system testing case provided for this Deliverable, further information will be provided. 