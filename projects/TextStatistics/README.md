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

- [ ] For this project you will also implement an interface

	* TextStatisticsInterface.java

## ProcessStatistics (provided class)

The ProcessStatistics class will serve as the driver class with a main method which processes one or more files to determine some interesting statistics about them. The ProcessStatistics driver class
should meet the following criteria,

- [ ] Command-line validation. The names of the files to process will be given as command line arguments. Your driver class must,

	* Validate the number of command line arguments. There should be at least one file
name given.
	* If no files are given on the command line, your program must print a usage message and exit the program immediately. The message should read as follows. *Usage: java ProcessText file1 [file2 ...]* This lets the user know how they should run the program without having to go look up the documentation.

- [ ] Process command-line arguments. If valid filenames are given on the command line, your program will,

	* Process each command line argument by creating a File object from it and checking to see that the file actually exists. Recall, the args parameter of the main method is an array of String objects that contains the command line arguments to the program. For your program, the array should contain the names of the files to be processed.
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

- [ ] Constructor. The constructor takes a File object as a parameter. The constructor should open the file and read the entire file line-by-line, processing each line as it reads it. Your constructor needs to handle the FileNotFoundException that can occur when the File is opened in a Scanner. Use a try-catch statement to do this. Don’t just throw the exception. As the file is read, your program must collect the following statistics,

	* The number of lines in the file. The number of lines should include any blank lines in the file.
	* The number of words in the file
	* The number characters in the file.  The number of characters should include all whitespace characters, punctuation, etc. 
	* The average word length
	* The number of times each letter appears in the file. Do not separate upper and lower case, just convert all characters to lower or upper case before counting.
	* The number of words of each length that appears in the file. Assume that the maximum word length is 23. You do not need to print lengths that have a count of zero.  Be careful here!  Consider the examples below, 

```
Here is my (word)!
```

The length of "word" is 4, NOT 7. 

```
Here, is another word!
```

The length of "Here" is again 4, not 5. 

You program must ignore punction and only count the length of the words. 

- [ ] Implement a toString() method. Write a toString() method that generates and returns a String that can be printed to summarize the statistics for the file as shown in the sample output shown
below.
	
## Your Tasks

- [ ] Begin a project in your IDE called TextStatistics
- [ ] Locate the TextStatistics and ProcessText class in the "stubs" folder of this project folder [https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs](https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs)
- [ ] Save the TextStatistics and ProcessText class and place it in your project folder
- [ ] Locate the etext folder in the "stubs" folder of this project folder [https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs](https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/stubs)
- [ ] Download the etext folder and place it in your project folder
- [ ] Begin by implementing ProcessStatistics. You can ignore the command-line arguments to start. Just hard-code a file name so you can test your TextStatistics class as you write it. Create a File object and check to see that the file actually exists.
  * If the file does exist, your program will create a TextStatistics object for that file and print out the statistics for the file to the console.
  * If the file does not exist, a meaningful error message needs to be printed to the user.
- [ ] Next you can start implementing TextStatistics according to the specifications described above
- [ ] At this point, you should go back and add command-line argument processing to ProcessText as described in the specifications below. To make sure it correctly handles command line arguments, run it from the command line with no arguments, files that don't exist, and files that do exist.
- [ ] Document your code thoroughly as you go with comments.  The logic of your program must be thoroughly desribed!
- [ ] Complete the required README using specified guidelines

## Grade and Submit your Project

- [ ] Make sure to test your program thoroughly. I am giving you the test program and scripts that I will use to grade your program. Take advantage of this and make sure they all pass! [https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/testing](https://github.com/hpluska/APCompSciA/tree/master/projects/TextStatistics/testing)
- [ ] Submit your project using the following guidelines 
	* Place the following files in a one project directory
		- TextStatistics.java
		- ProcessStatistics.java
		- README
	* Initialize the directory as a git repository, 
		- From the command line type 
			```
			git init
			```
	* Push your project to github
		- Navigate to [https://classroom.github.com/a/PzNQJi_s](https://classroom.github.com/a/PzNQJi_s)
		- Follow the prompts to create the repository for the assignment
		- Copy the "clone" link, then return to the command line
		- From the command line type
			```
			git remote add origin <** paste clone link **>
			git add .
			git commit -m "your message goes here"
			git push origin master
			```
		





