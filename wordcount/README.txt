CS542 Design Patterns
Spring 2015
PROJECT <4> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Wednesday, April 22nd, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Wednesday, April 22nd, 2015>
Grace Period Used This Project: <NONE> Days
Grace Period Remaining: <NONE> Days
Author(s): <SHIVA REDDY KANDIMALLA>
e-mail(s): <skandim1@binghamton.edu>


PURPOSE:
The purpose of this project is to implement Visitor Pattern and Usage of Tree data structure.  

PERCENT COMPLETE: 100%

PARTS THAT ARE NOT COMPLETE: None

BUGS: None

FILES:

  Included with this project are 8 files:
  
  Driver.java: checking for valid input arguments and calling visitors. 
  DataElement.java: Creating data structure.
  Data.java: To store data
  PopulateTreeVisitor.java: Reading the line from the file and inserts into data structure
  Visitor.java: Visitor Interface
  WordCountVisitor.java: Counting the number of total words, unique words and total character count
  FileProcessor.java: Reads the file line by line. writes given data to the file.
  MyLogger.java: prints message depending on the debug value given
			0 - displays time on console
			1 - Constructors
			2 - Other Methods

SAMPLE OUTPUT:


TO COMPILE:

ant -buildfile src/build.xml all

TO RUN:

./run.sh input100M.txt output10M.txt 5 0

EXTRA CREDIT:

Data Structure: TreeMap
It internally uses Red Black Tree. It is a self balancing binary search tree. It's complexity for search is O(logn).


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<KANDIMALLA SHIVA REDDY>


ACKNOWLEDGEMENT:

