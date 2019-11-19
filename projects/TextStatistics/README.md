# Text Statistics

## Project Overview
In this program, you are going to implement a program that analyzes text files to generate some useful statistics. I will provide plain text versions of several books and articles (e.g. Alice in Wonderland, The Gettysburg Address, etc.) for you to analyze using your program.

## Objectives

- [ ] Use arrays.
- [ ] Use command-line arguments.
- [ ] Read from text files using the Scanner class.
- [ ] Parse and analyze text input.
- [ ] Implement an interface.

## Specification

- [ ] For this project you are going to create two classes.

	* TextStatistics will be the class that reads a text file, parses it, and stores the information about the words and characters in the file.
	* ProcessText is the driver class that gets a list of one or more filenames from the command line and collects statistics on each of the files using an instance of TextStatistics object.

- [ ] For this project you will also implement an interfaces

	* TextStatisticsInterface.java

## ProcessStatistics (provided class)

The ProcessStatistics class will serve as the driver class with a main method which processes one or more files to determine some interesting statistics about them. The ProcessText driver class
should meet the following criteria,

- [ ] Command-line validation. The names of the files to process will be given as command line arguments. Your driver class must,

	* Validate the number of command line arguments. There should be at least one file
name given.  
	* If no files are given on the command line, your program must print a usage message and exit the program immediately. The message should read as follows. Usage: java ProcessText file1 [file2 ...] This lets the user know how they should run the program without having to go look up the documentation.

- [ ] Process command-line arguments. If valid filenames are given on the command line, your program will,

	* Will process each command line argument by creating a File object from it and checking to see that the file actually exists. Recall, the args parameter of the main method is an array of String objects that contains the command line arguments to the program. For your program, the array should contain the names of the files to be processed.
	* If a file does exist, your program will create a TextStatistics object for that file and will print out the statistics for the file to the console.
	* If a file does not exist, a meaningful error message needs to be printed to the user and your program will continue processing the next file. (An invalid file in the list should not result in the program crashing or exiting before all files have been
processed.)

## TextStatistics

TextStatistics is an instantiable class that reads a given text file, parses it, and stores the generated statistics. The TextStatistics class should do the following,

- [ ] Implement the given TextStatisticsInterface (don’t modify the interface, it just provides a list of methods that your class must include). To implement an interface, you must modify your class declaration as follows, 

```
public class TextStatistics implements TextStatisticsInterface

```

- [ ] Include instance variables. Include a reference to the processed File. Include variables for all of the statistics that are computed for the file. Look at the list of accessor methods in the TextStatisticsInterface to determine which statistics will be stored (accessor methods typically are named with the word “get” following by whatever information they are
accessing)

- [ ] Constructor. The constructor takes a File object as a parameter. The constructor should open the file and read the entire file line-by-line, processing each line as it reads it. Your constructor needs to handle the FileNotFoundException that can occur when the File is opened in a Scanner. Use a try-catch statement to do this. Don’t just throw the exception. As each line is read, collect the following statistics:

	* The number of characters and lines in the file. The number of characters should include all whitespace characters, punctuation, etc. The number of lines should include any blank lines in the file.
	* The number of words in the file. 

- [ ] The number of words of each length that appears in the file. Assume that the maximum word length is 23. You do not need to print lengths that have a count of zero.  Be careful here!  Consider the examples below, 

```
Here is my (word)!
```

The length of "word" is 4, NOT 7. 

```
Here, is another word!
```

The length of "Here" is again 4, not 5. 

You program must ignore punction and only count the length of the words. 

- [ ] The average word length for the file.
- [ ] The number of each letter that appears in the file - do not separate upper and lower case, just convert all characters to lower case before counting.

- [ ] Getter (accessor) methods. Implement the accessor methods for the number of characters, number of words, number of lines, average word length and for the arrays that contain the number of words of each length and the number of times each letter occurs in the file.
- [ ] toString() method. Write a toString() method that generates and returns a String that can be printed to summarize the statistics for the file as shown in the sample output shown
below.
	
## Your Tasks

- [ ] Begin a project in NetBeans called TextStatistics
- [ ] Locate the TextStatistics and ProcessText class in the "stubs" folder of this project folder [https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs](https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs)
- [ ] Save the TextStatistics and ProcessText class and place it in your NetBeans project folder
- [ ] Locate the etext folder in the "stubs" folder of this project folder [https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs](https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs)
- [ ] Download the etext folder and place it in your NetBeans project folder
- [ ] Begin by implementing ProcessText. You can ignore the command-line arguments to start. Just hard-code a file name so you can test your TextStatistics class as you write it. Create a File object and check to see that the file actually exists.
  * If the file does exist, your program will create a TextStatistics object for that file and print out the statistics for the file to the console.
  * If the file does not exist, a meaningful error message needs to be printed to the user.
- [ ] Next you can start implementing TextStatistics according to the specifications described above
- [ ] At this point, you should go back and add command-line argument processing to ProcessText as described in the specifications below. To make sure it correctly handles command line arguments, run it from the command line with no arguments, files that don't exist, and files that do exist.
- [ ] Make sure to test your program thoroughly. I am giving you the test program and scripts that I will use to grade your program. Take advantage of this and make sure they all pass!

```
$ java ProcessText
Usage: java ProcessText file1 [file2 ...]

$ java ProcessText not-a-file.txt
Invalid file path: not-a-file.txt

$ java ProcessText not-a-file.txt testfile.txt
Invalid file path: not-a-file.txt

===============================================
11 lines
79 words
465 characters
------------------
a = 27	n = 25
b = 1 	o = 26
c = 11	p = 5
d = 10	q = 0
e = 33	r = 21
f = 9	s = 30
g = 7	t = 35
h = 24	u = 7
i = 25	v = 1
j = 0	w = 10
k = 2	x = 1
l = 18	y = 2
m = 5	z = 0
------------------
length  frequency
------	---------
1	3
2	13
3	24
4	13
5	10
6	2
7	5
8	3
9	1
10	3
11	2

Average word length = 4.24

$ java TextStatisticsTest

Testing on data file:testfile.txt

Passed! getCharCount()
Passed! getWordCount()
Passed! getLineCount()
Passed! getAverageWordLength()
Passed! Arrays frequencies
Passed! Letter frequencies

Testing on data file:etext/Gettysburg-Address.txt

```






