# Command Line Basics

## Introduction

In this lab you will get acquainted with how to manage files using the Linux operating system. 

## Your Tasks

- [ ] Begin a project in NetBeans called DixieCupMaker
- [ ] Create a new java class in the DixieCupMaker project folder called DixieCup
- [ ] Write the DixieCup class. This class should have the following methods initially, 
	* public DixieCup(int i) - the constructor
	* public void addItem(String n)
	* public String getItem(int i)
	* public void removeItem(String n)
- [ ] In the DixieCupMaker class Create a Scanner using the standard input as follows, 

```
Scanner in = new Scanner(System.in);
``` 

- [ ] Your scanner should,
	* Prompt the user for the number of cups (Up to 3, but not less than 2)
	* Your program should continously prompt the user until there is more than 1 cup, but less than 4.
 	* Declare a cups array

```
DixieCup[] cupsArray = new DixieCup[numCups];
```

- [ ] Your scanner should then,
	* Prompt the user for how many items are allowed in each cup
	* There must be at least 1 item in each cup.  Your program should continuously prompt the user until each cup has at least 1 item.
	* Create a cup at each location in the cupsArray, 

```
cupsArray[0]= new DixieCup[numThings];
cupsArray[1] = new DixieCup[numThings];
etc...
```

- [ ] Once the cups are declared, create a menu which prompts the user with the following options, 

	* Add an item 
	* Get an item 
	* Remove an item
	* Change an item
	* Swap items
	* Display the contents of a Dixie cup
	* Summary of all Dixie cups
	* Quit

- [ ] Test the following methods, 
	* addItem
	* getItem
	* removeItem

- [ ] Fix the addItem method.  There are two problems with the addItem method.  
	* First, if you add items beyond the length of the declared items array you will go out of bounds. 
	* Second, if you remove an item, how might you add an item to the “empty” location? Rewrite this method to account for this problem.

- [ ] Write a toString method.  The toString method will be executed when the user selects the "Display the contents of a Dixie cup" option from the menu. 

- [ ] In the DixieCup class, write a method called setItem() that sets an item in a cup to a different item.  For example, what if I wanted to change the paper clip to a toothpick?  This method should accept an int variable as a parameter.  This variable corresponds to the index of the item to be set.   

- [ ] In the DixieCup class, write a method called swapItems() that swaps an item in one cup with another item from a different cup.  The method should accept three parameters.  The first parameter is the DixieCup object you want to swap with.  The next parameters are integers which represent the indices of the items to be swapped.  

- [ ] In the DixieCup class, write a method called numItems() that returns the total number of items in the cup.  Your method should ignore items with null values. 

- [ ] Make sure the menu you create calls the appropriate the methods and displays the appropriate content

- [ ] Test your program thoroughly to make sure it works properly for all conditions  

- [ ] Implement the "Summary of all Dixie cups" option.  When the summary of all dixie cups is called, it should print out a summary of the cups as shown below.  For a *three cup system*, it should print out the cups in order with respect to the number of things in the cup from fewest to greatest.  (YOU ONLY NEED TO BE ABLE TO DO THIS FOR A 3 CUP SYSTEM)

```
******************************************************************************
Cup with the most items:  cup 0              Cup with the least items: cup 1
******************************************************************************
Cup        Number of Items
******************************************************************************
1         	3
2               4
0               6

```
- [ ] Thoroughly document both your DixieCup and DixieCupMaker classes using proper javac documentation and comments. 

- [ ] Complete a thorough README. Refer to the template and the example located in the tutorials section of this site

- [ ] Grade your project against the Rubric [rubric.md](rubric.md)

- [ ] Submit your project according to the submission guidelines on Zofia




