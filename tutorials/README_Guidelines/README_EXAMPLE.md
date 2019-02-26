# Project 1: Marshmallow Animation

* Author: Grace Hopper
* Class: CS121 Section 2
* Semester: Spring 2016

## Overview

This Java application displays an animated marshmallow with features based on
user input specifying sponginess, color, sugar density, and burn resistance.

## Compiling and Using

To compile, execute the following command in the main project directory:
```
$ javac Marshmallow.java
```

Run the compiled class with the command:
```
$ java Marshmallow
```

You will be prompted for integer values representing distance to the fire,
fire intensity, marshmallow burn resistance, and marshmallow sugar density.

## Discussion

When I realized my paintComponent() method was getting really long and hard to
read, I broke out each graphical element into its own private method.  The hard
part of that was figuring out that I needed to pass in the Graphics object to
each method, but it worked well after I did that. It also helped to read about
the Graphics class in the Java API, to learn how to use the different draw
methods.

I tested values from 0 to 20 for each of the input parameters, but I found that
values greater than 20 cause the program to freeze up. I don't know how to
restrict input values, yet, but that would be a good feature to add. I added
a warning to the input dialog, but there's nothing to stop users from adding
values over 20.

I tried running the program remotely over SSH with X, but my connection wasn't
fast enough to see the animation very well and there were several times the
dialog boxes for my input prompts showed up behind the main window. When I
came into the lab and ran it, however, everything looked good and worked just
like it did when I ran it locally on my own computer.

The starting file for the project had a window size of 200 x 500, but I found
that the text was too small to read unless the height was at least 300, so I
ended up with minimum dimensions of 300 x 500.  It looks best, though, even
bigger.  I recommend 400 x 600.

This project was challenging at first, but it was fun once I got the hang of
it and I feel like I learned a lot about graphics in Java.

## Extra Credit

I added the flame animation and screaming sound effect when the marshmallow
overheats. You can see it when sugar density is > 10 and burn resistance is
< 15.

## Sources used

- I found code for adding sound effects on stackoverflow.com.
[Sound Effects in Java](http://stackoverflow.com/questions/20354508/sound-effects-in-java)
