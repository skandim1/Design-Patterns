CS542 Design Patterns
Spring 2015
PROJECT <3> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Friday, April 3rd, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Friday, April 3rd, 2015>
Grace Period Used This Project: <NONE> Days
Grace Period Remaining: <NONE> Days
Author(s): <SHIVA REDDY KANDIMALLA>
e-mail(s): <skandim1@binghamton.edu>


PURPOSE:
The purpose of this project is to implement Observer Pattern.  

PERCENT COMPLETE: 100%

PARTS THAT ARE NOT COMPLETE: None

BUGS: None

FILES:

  This project are 19 files:
  
  DisplayFile.java: DisplayFile Interface
  Driver.java: checking for valid input arguments and call subject and observers 
  DashboardFilter.java: DashboardFilter interface

  DefaultTab.java:
  DefaultTabFilterImpl.java: To Check whether line belongs to Default or not

  Observer.java:

  PerformanceInfo.java: Information about Performance
  PerformanceTab.java: Checking for begin and end tags, calling the writeToFile to write in file. 
  PerformanceTabFilterImpl.java: To Check whether line belongs to performance or not

  ProcessesInfo.java: Information about Processes
  ProcessesTab.java: Checking for begin and end tags, calling the writeToFile to write to file. 
  ProcessesTabFilterImpl.java: To Check whether a line belongs to processes or not
  
  UsersInfo.java: Information about Users
  UsersTab.java: Checking for begin and end tags, calling the writeToFile to write to file. 
  UsersTabFilterImpl.java: To Check whether a line belongs to users or not

  DashBoardSubject.java: Reads each line using ReadFromFile in fileprocessor and notifying observers

  Subject.java: Subject Interface

  FileProcessor.java: Reads the file line by line. writes given data to the file.
  myLogger.java: prints message when a method/constructor is called.
	myLogger level:
			1 --> console Output
			2 --> Constructors
			3 --> Update Methods
			4 --> Checking filters


SAMPLE OUTPUT:

---TAB(s) BEGIN---
---PROCESSES---
  PID COMMAND         USER     %CPU %MEM
 1000 watch           root      0.0  0.0
 3454 Xorg            root      0.0  0.1
 4049 getty           root      0.0  0.0
 4050 getty           root      0.0  0.0
 4051 getty           root      0.0  0.0
 4052 getty           root      0.0  0.0
 4053 getty           root      0.0  0.0
 4054 getty           root      0.0  0.0
10376 tcsh            kcaglar1  0.0  0.1
11222 tcsh            jpratt3   0.0  0.1
14055 tcsh            nbade1    0.0  0.1
15537 gdb             jpratt3   0.0  0.7
15794 gdb             kcaglar1  0.0  0.7
15898 bomb            jpratt3   0.0  0.0
16177 bomb            kcaglar1  0.0  0.0
17292 tcsh            bsendir1  0.2  0.1
17430 python          bsendir1  5.0  0.4
17439 sh              bsendir1  0.0  0.0
17440 ps              bsendir1  0.0  0.0
21627 bash            root      0.0  0.0

---TAB(s) END---
---TAB(s) BEGIN---
---PROCESSES---

TO COMPILE:

ant -buildfile src/build.xml all

TO RUN:

bingsuns2% ant -buildfile src/build.xml run

EXTRA CREDIT:


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<SHIVA REDDY KANDIMALLA>


ACKNOWLEDGEMENT:

