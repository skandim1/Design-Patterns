CS542 Design Patterns
Spring 2015
PROJECT <5> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Monday, May 4th, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Monday, May 4th, 2015>
Grace Period Used This Project: <NONE> Days
Grace Period Remaining: <NONE> Days
Author(s): <SHIVA REDDY KANDIMALLA>
e-mail(s): <skandim1@binghamton.edu>


PURPOSE:
The purpose of this project is to implement Reflection.  

PERCENT COMPLETE: 100%

PARTS THAT ARE NOT COMPLETE: None

BUGS: None

FILES:

  Included with this project are 8 files:
  
  Driver.java: checking for valid input arguments and calling supporting functions. 
  First.java: Setting of data types and overriding hashCode and Equals functions
  Second.java: Setting of data types and overriding hashCode and Equals functions
  PopulateObjects.java: Reflection part and printing result to the console.
  FileProcessor.java: Opens and reads the file line by line.
  MyLogger.java: prints message depending on the debug value.
	MyLogger level:
			0 --> Nothing, printing results on console
			1 --> Constructors
			2 --> Methods
  README: This is the text file you are presently reading.
  build.xml: It take cares of compilation, build construction, taring, cleaning , argument passing (script running).

SAMPLE OUTPUT:


TO COMPILE:

ant -buildfile src/build.xml all

TO RUN:

./run.sh inputbig.txt 5 0

EXTRA CREDIT:

Data Structure: HashMap
This data structure suits the requirement, with key as object and value as count. 
Hash map uses hashCode and equals method, which is effective in checking duplicates.
It checks whether there exits an object in hashmap, if exists then it's count gets incremented,
Otherwise, Object is inserted and make the count 1.
It has an access time of O(1). 


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<SHIVA REDDY KANDIMALLA>


ACKNOWLEDGEMENT:




