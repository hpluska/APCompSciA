# Bouncy ball
In this lab, you will create an animation that paints a colored ball, bouncing around within the confines of the window.

## Introduction
You will apply conditional (if) statements to recognize boundary conditions, and will replace hard-coded values with random numbers to create a colorful bouncy ball

## Your Tasks

- [ ] Locate the "Bouncy Ball" lab guide [BouncyBall.pdf](BouncyBall.pdf)

- [ ] Complete the group portion of the lab as instructed

- [ ] Complete the individual portion of the lab

	* In your AP Computer Science A Repo on your computer make sure you have created a directory called "labs"
	* Inside your labs directory, create another directory called "BouncyBall"
	* Download the following file into your BouncyBall directory: [BouncyBall.java](BouncyBall.java)
	* Open the file in your text editor and take a look around.  You probably do not understand most of this, but that is ok, you will eventually!
	* Complete the challenges below to create a bouncy ball like the one shown in this video [BouncyBall_video.swf](BouncyBall_video.swf)
	* Once you have completed your challenges push your AP Computer Science A Repo to GitHub
	* Show your completed challenges to Ms. Pluska to receive credit for the individual portion of this lab

### Challenges 1

- [ ] In the BouncyBall.java class locate the comment "**TODO 1: needs more to stay in-bounds**"

	* Keep the ball in bounds in the horizontal direction by improving the code flagged with TODO 1 
	* Add conditional statements to check when the ball has hit the vertical edges of the window (x = 0 and x = width). When this happens, you will need to reverse the corresponding delta direction and keep the ball in-bounds. Your bounds checking should not depend on a specific window size. The ball should never extend out of bounds, so you'll also need to take RADIUS into account

### Challenge 2

- [ ] Locate the comment "**TODO 2: needs more to stay in-bounds**"

	* Keep the ball in bounds in the vertical direction by improving the code flagged with TODO 2 
	* Add conditional statements to check when the ball has hit the horizontal edges of the window (y = 0 and y = height). When this happens, you will need to reverse the corresponding delta direction and keep the ball in-bounds. Your bounds checking should not depend on a specific window size. The ball should never extend out of bounds, so you'll also need to take RADIUS into account

### Challenge 3

- [ ]  Locate the comment "**TODO 3: use rDelta, MIN_RADIUS, and MAX_RADIUS to increase/decrease oval radius.**"
        
	* Have the radius of the ball transition between a range of sizes with each step 

### Challenge 4

- [ ] Locate the comment "**TODO 4: replace xDelta and yDelta with random deltas from -DELTA_RANGE to +DELTA_RANGE/2**"

	* Set the inital speed of the ball to a random number within -DELTA_RANGE/2 - +DELTA_RANGE/2

### Challenge 5

- [ ] Locate the comment "**TODO 5: replace centered starting point with a random position anywhere in-bounds**"

	* Set the starting position to a random point anywhere in-bounds.  The ball should never extend out of bounds, so you'll need to take RADIUS into account

### Challenge 6

- [ ] Locate the comment "**TODO 6: replace with random starting color**"

	* Create three random numbers for the colors Red (R), Green (G), Blue (B).  Each number needs to be in the range of 0 - 256 (not inclusive).  
	* Use the code below to set the color of the ball to a random color, 

```

color = new Color(R, G, B);

```

### Extra Credit

- [ ] Make your bouncy ball awesome! 

	* Have the color of your ball change by a small amount with each step. You will need to keep track of the current value of each RGB color channel, delta values for each color channel, and checking to make sure each color channel stays within the 0-to-255 range.[BouncyBallFancy_video.swf](BouncyBallFancy_video.swf)
	* Try disabling the call to clear the panel in paintComponent() so the ball becomes a continuous paintbrush on the panel.




















