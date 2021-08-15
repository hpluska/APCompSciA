# Mine Hunter Path

In this lab you will apply ArrayLists to create a random path through a grid of mines. 

## Introduction
In this lab you will build upon the Mine Hunter game you created previously.  The goal is create a path through the mines given a starting coordinate and an ending coordinate.

## Your Tasks

- [ ] Locate the MineHunterPath lab guide [MineHunterPath.pdf](MineHunterPath.pdf)

- [ ] Complete the group portion of the lab as instructed

- [ ] Complete the individual portion of the lab

	* Make a copy of your MineHunter project in NetBeans, then rename the copy to MineHunterPath
	* I made some additions to the MineHunterGrid class, take a look at the files I have provided below and integrate these changes with the MineHunterGrid class you wrote
		- [MineHunter.java](mineHunterPath/MineHunter.java)
		- [MineHunterControls.java](mineHunterPath/MineHunterControls.java)
		- [MineHunterGrid.java](mineHunterPath/MineHunterGrid.java)
		- [MineHunterInterface.java](mineHunterPath/MineHunterInterface.java)
		- [MineHunterPane.java](mineHunterPath/MineHunterPane.java)
		- [MineHunterPath.java](mineHunterPath/MineHunterPath.java) 
		- [flag.jpg](https://github.com/hpluska/APCompSciA/blob/master/labs/MineHunterPath/images/flag.jpg)

	* Complete the challenges below. (NOTE:  You do not need to implement the challenges I have subscribed, you have the freedom to combine methods or create your own. The end goal is that the MineHunterPath class, when implemented, will successfully find a path through the grid of mines. Get creative!)
	* Once you have completed your challenges push your AP Computer Science A Repo to GitHub.
	* Show your working game to Ms. Pluska to receive credit for the individual portion of this lab.

### Challenge 1
Write the reset() method. The reset method, resets the starting point of the path and clears the path array path.clear()

### Challenge 2
Write the getNext() method. The getNext method generates a random number and depending on the random number gets the next available tile.  Remeber the path cannot land on a mine!

### Challenge 3
Write the step() method.  Once you determine the next move you can step.  And continue stepping until you have reached the stopping point, that is where isDone is true. 

### Challenge 4
Write the isDone() method isDone() is a boolean type method.   Each time isDone() is called, it checks to see if you have made it to the end.  If you have, it returns true, otherwise it returns false.

### Challenge 5
Write the getPath() method getPath returns the completed path.  Recall, we need to access this from the MineHunterGrid so we can display the path. 

### EXTRA CREDIT: 
Modify your project such that a random path can be created in 4 directions (not just two).  If you get "stuck" your program must reset and continue to look for a path until one is found.  You must be mindful of situations where no path may not exists.  

