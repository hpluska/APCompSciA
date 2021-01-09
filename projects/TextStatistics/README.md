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

- [ ] For this project you are going to modify two classes.

	* TextStatistics will be the class that reads a text file, parses it, and stores the information about the words and characters in the file.
	* ProcessStatistics is the driver class that gets a list of one or more filenames from the command line and collects statistics on each of the files using an instance of TextStatistics object.

## Your Tasks - ProcessStatistics

The ProcessStatistics class will serve as the driver class with a main method which processes one or more files to determine some interesting statistics about them. The ProcessStatistics driver class should meet the following criteria,

- [ ] Command-line validation. The names of the files to process will be given as command line arguments. Your driver class must,

	* Validate the number of command line arguments. There should be at least one file
name given.
	* If no files are given on the command line, your program must print a usage message and exit the program immediately. The message should read as follows. *Usage: java ProcessText file1 [file2 ...]* This lets the user know how they should run the program without having to go look up the documentation.

- [ ] Process command-line arguments. If valid filenames are given on the command line, your program will,

	* Process each command line argument by creating a File object from it and checking to see that the file actually exists. Recall, the args parameter of the main method is an array of String objects that contains the command line arguments to the program. For your program, the array should contain the names of the files to be processed.
	* If a file does exist, your program will create a TextStatistics object for that file and will print out the statistics for the file to the console.
	* If a file does not exist, a meaningful error message needs to be printed to the user and your program will continue processing the next file. (An invalid file in the list should not result in the program crashing or exiting before all files have been
processed.)

## Your Tasks - TextStatistics

TextStatistics is a class that reads a given text file, parses it, and stores the generated statistics. The TextStatistics class should do the following,

- [ ] Include instance variables. Include a reference to the processed File. Include variables for all of the statistics that are computed for the file. Look at the list of accessor methods in the TextStatisticsInterface to determine which statistics will be stored (accessor methods typically are named with the word “get” following by whatever information they are
accessing)

- [ ] Constructor. The constructor takes a File object as a parameter. The constructor should open the file and read the entire file line-by-line, processing each line as it reads it. Your constructor needs to handle the FileNotFoundException that can occur when the File is opened in a Scanner. Use a try-catch statement to do this. Don’t just throw the exception. As the file is read, your program must collect the following statistics,

	* The number of lines in the file. The number of lines should include any blank lines in the file.
	* The number of words in the file
	* The number characters in the file.  The number of characters should include all whitespace characters, punctuation, etc. 
	* The average word length
	* The number of times each letter appears in the file. Do not separate upper and lower case, just convert all characters to lower or upper case before counting.
	* The number of words of each length that appears in the file. Assume that the maximum word length is 23. All words that are 23 characters or longer should be stored in index 23 of the wordLengthCount[] array.  Do not print lengths that have a count of zero.  Be careful here!  Consider the examples below, 

```
Here is my (word)!
```

The length of "word" is 4, NOT 7. 

```
Here, is another word!
```

The length of "Here" is again 4, not 5. 

You program must ignore punction and only count the length of the words. 

- [ ] Implement a toString() method. Write a toString() method that generates and returns a String that can be printed to summarize the statistics for the file as shown in the sample output shown here, [statsDisplay.jpg](statsDisplay.jpg)

## Document, Grade, and Submit your Project

- [ ] Document your code thoroughly as you go with comments.  The logic of your program must be thoroughly desribed!
- [ ] Complete the required README using specified guidelines.  You will need to replace README with your README.  
- [ ] Make sure to test your program thoroughly. I am giving you the test program and scripts that I will use to grade your program. Take advantage of this and make sure they all pass! These are located in the _testing_ folder.  To test your program do the following, 
	* Place ProcessStatistics.java, TextStatistics.java, and TextStatisticsInterface.java in the testing folder
	* Open this folder in the terminal.  
		- If you are using Linux OS or Mac OS, you can open the terminal directly in visual studio code by selecting the _Open in Integrated Terminal_ option.  
		- If you are using Windows OS, you will need to navigate to the testing folder via your file manager.  Once there, right-click and select _Git Bash Here_
	* Type the following, ```./autograde.sh``` at the command prompt.  A perfect run will display the following results,  [statsDisplay2.jpg](statsDisplay2.jpg)
		





