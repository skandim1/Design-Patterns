CS542 Design Patterns
Spring 2015
ASSIGNMENT <1> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Monday 9, 2015>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Monday, March 9, 2015>
Grace Period Used This Project: N/A
Grace Period Remaining: N/A
Author(s): < Shiva Reddy Kandimalla > 
e-mail(s): < skandim1@binghamton.edu > 


PURPOSE:

This is the implementation of chat room program where there is only one server and multiple clients. 

PERCENT COMPLETE:

“I believe I have completed 100% of this project” 

PARTS THAT ARE NOT COMPLETE:

I have covered all requirements.

BUGS:

No Bugs code is Running successfully

FILES:

Necessary files so that code will run successfully are

 Included with this project are 14 files:
  
  PrimeDriver.java: calls the server or client functions
  ClientDriver.java: Reads the input option provided by the user and calls corresponding  functions.
  ClientMenu.java: It displays the menu of the client.
  ServerDriver.java: Reads the input option provided by the user and calls corresponding functions.
  AllPrimeQueries.java: It has methods which adds clients details to the data structure, gets client details from data structure, prints all clients details from the data structure
  ServerMenu.java: It displays the menu of the server.
  PrimeServerSocket.java: It contains a method named run which Runs after a thread is created. Loads data structure, creates a socket, accepts clients and allocates a    separate thread to each client.
  PrimeServerWorker.java: It contains a method named run which Runs after a thread is created. Reads input from console,checks whether it prime and adds it to HashMap.
  PrimeClientSocket.java: creates a socket and transfer control to PrimeClientWorker
  PrimeClientWorker.java: It writes input to the console and takes back the response provide by server and returns the response
  CheckPrime.java: contains a method which checks whether a given number is prime or not.
  Debug.java: debug value should be in the range of 1 to 3
               debug value 1 - to know the response from server.
                           2 - to know which constructor is invoked
                           3 - to know which methods are invoked
  README: This is the text file you are presently reading.
  build.xml: It take cares of compilation, build construction, cleaning , argument passing (script running).



steps to extract:

1 Download ShivaReddy_Kandimalla.tar.gz file
2 Extract it using command "tar -zxvf ShivaReddy_Kandimalla.tar.gz"
3 Then the structure looks like below


SAMPLE OUTPUT:

Client Side:

[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
1
Enter client name :
shiva
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
2
Enter prime number :
11
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
3
11  YES
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
1
Enter client name :
sandeep
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
2
Enter prime number :
13
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit
3
13  YES
[1] Set client name
[2] Enter number to query for prime
[3] What is the server response?
[4] Quit


Server Side:


[1] Client Name
[2] All Client Queries
[3] Quit
2
sandeep 13
shiva 11
[1] Client Name
[2] All Client Queries
[3] Quit



TO COMPILE:

ant -buildfile src/build.xml all

TO RUN:

bingsuns2% ant -buildfile src/build.xml run

EXTRA CREDIT:

Data Structure used is HashMap < String, String >


It takes O(1) for searching an client to update its value but for ArrayList it has to iterate till client is found.
Here, Key and Value both are Strings. I have appended latest number to string and its easy to print a string.
If we have a List in Value, we have to use iteration which is costly.


BIBLIOGRAPHY:

http://syntx.io/a-client-server-application-using-socket-programming-in-java/

ACKNOWLEDGEMENT:

N/A