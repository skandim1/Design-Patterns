CS542 Design Patterns
Spring 2015
PROJECT <1> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Tuesday, Febrary 17, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Tuesday, Febrary 17, 2015>
Author: <SHIVA REDDY KANDIMALLA>
e-mail: <skandim1@binghamton.edu>


PURPOSE:

The purpose of this project is to maintain the coding standards, 
design principle one program to an interface not an implementation 
because implementation has concrete types.

PERCENT COMPLETE: 

[
  "I believe I have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:

[
  None
]

BUGS:

[
  N/A
]

FILES:

[
 Included with this project are 12 files:
  
  AllDirectionsBug.java: Its an interface which declares methods of movement of bug. 
  Bug.java: It defines methods of AllDirectionsBug interface where each method calls StoreMovements method and provides it movement value.
  Debug.java: Debug value from command line is set here which used by all class in there methods to give debug message.
  Driver.java: Checks for command line argunments length, calls methods of movements, writeToScreen and writeToFile.
  Display.java: Interface which declares method for write to console.
  FileLog.java: Interface which declares method for write to file.
  Code.java: It is used to change input values in future.Here, we can add new varibles and make use of co-ordinates. 
  Results.java: Captures movements in data structure using method. Write to console, file & method.
  StoreMovements.java: Interface which declares method for movements capture.
  Logfile.txt: This file that contains the data to be printed for movements.
  README: This is the text file you are presently reading.
  build.xml: It take cares of compilation, build construction, taring, cleaning (deleting of Logfile.txt), argument passing.
]

SAMPLE OUTPUT:

[
bingsuns2% ant -buildfile src/build.xml run
Buildfile: src/build.xml

jar:
    [mkdir] Created dir: /u0/users/1/skandim1/DP/ShivaReddy-Kandimalla/bug-model/BUILD/jar
      [jar] Building jar: /u0/users/1/skandim1/DP/ShivaReddy-Kandimalla/bug-model/BUILD/jar/bugModel.jar

run:
     [java] Move left is called
     [java] Save Movements is called
     [java] Move Up is called
     [java] Save Movements is called
     [java] Move Down is called
     [java] Save Movements is called
     [java] Move Right is called
     [java] Save Movements is called
     [java] Undo prev is called
     [java] Undo Movements is called
     [java] writeToFile method is called
     [java] getinputMovement method  is called
     [java] getinputMovement method  is called
     [java] getinputMovement method  is called

BUILD SUCCESSFUL
Total time: 2 seconds
]

TO COMPILE:

[
ant -buildfile src/build.xml all
]

TO RUN:

[
  Please run as: ant -buildfile src/build.xml run
  arguments are given in the build.xml
]

EXTRA CREDIT:

[
   "N/A"
]


BIBLIOGRAPHY:

[
  For writing into file
  * http://examples.javacodegeeks.com/core-java/io/java-write-to-file-example/

]

ACKNOWLEDGEMENT:

[
  N/A 
]
