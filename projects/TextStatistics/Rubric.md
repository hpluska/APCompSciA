Points Possible: /100  

=================================================
Quality (15 points)
------------------------------------
- Submission
   * Files are named exactly as described in write-up.
   * No extra files are present.
   * Submitted to correct section.
   * Code compiles on onyx.
- Documentation
   * Javadocs with @author, @param, and @return tag.
   * README follows required style.
- Code style
   * Indentation/white space.
   * Correct casing and meaningful names for class name/variables.

ProcessText (20 points)
------------------------------------
- Command-line validation (5 points)
- Handles multiple files (5 points)
	- If one file doesn't exist, keeps processing others.
- Handles invalid files (5 points)
	- Prints meaningful error and continues program.
- Creates TextStatistics instance and prints results using toString (5 points)

TextStatistics (65 points)
------------------------------------
- Implements interface (5 points)
- File exception handling (5 points)
- Constructor (5 points)
	* Accepts a File object.
	* Processes file and sets all values.
	* Contents of file are only read once.
- Gather statistics / accessors
  The values for each of the following should be determined when the object
  is created and simply returned by the accessors/getters. No logic should
  be in the accessors.
	* Number of characters (5 points)
	* Number of lines (5 points)
	* Number of words (10 points)
	* Number of each word length (10 points)
	* Number of each letter (10 points)
- toString (10 points)


