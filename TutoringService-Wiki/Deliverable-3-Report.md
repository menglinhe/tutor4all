Here is the report for Deliverable 3

You should be able to jump to a specific page for more detailed information

* [Sprint 3](https://github.com/McGill-ECSE321-Fall2019/project-group-12/wiki/Sprint-3) with backlogs, user story, and user story point
* An [Architecture Model](https://github.com/McGill-ECSE321-Fall2019/project-group-12/wiki/Architecture-Modeling) is provided in this report
* Meeting minutes can be found starting from here in the [Meeting Minute](https://github.com/McGill-ECSE321-Fall2019/project-group-12/wiki/Meeting-Minutes#meeting-7) page
* The distribution of the backlogs and the tasks done by each team member can be found here in [Daily](https://github.com/McGill-ECSE321-Fall2019/project-group-12/wiki/Daily#deliverable-3)

***
Some key decisions

* Instead of having both .js file and .vue file, we will write all the code in a single .vue file for each page.
* The following template is used in the .vue file: 
  * '<template></template>' where we write all the HTML code
  * '<script></script>' where we will write all the JavaScript code
  * '<style></style>' where we will write all the CSS code
  * The usage of this template makes us get rid of import statements for each single .js file into corresponding .vue file
* Make sure the dynamic components work before we implement the backend methods call, ie, a working mockUI is implemented first
* Modification should be adapted when actually start implementing the backend call, ie, add additional business methods and the input fields with necessary information