#!/bin/bash

rm *.class > /dev/null 2>&1

echo "-------------------"
echo "Testing TextStatistics.java "
echo "-------------------"

javac TextStatisticsTest.java
if [ ! $? == 0 ] # Make sure the program built
then
  echo "FAIL reason: TextStatisticsTest.java did not compile"
  exit 1
fi

timeout 10 java TextStatisticsTest
if [ ! $? == 0 ] # Make sure the program exited with success
then
  echo "FAIL reason: TextStatisticsTest failed"
  exit 1
fi

echo "----------------------"
echo "Testing ProcessText.java "
echo "----------------------"

javac ProcessText.java
if [ ! $? == 0 ];then
  echo "FAIL reason: ProcessText.java did not compile"
  exit 1
fi

timeout 10 java ProcessText etext/testfile.txt not-a-file.txt etext/Gettysburg-Address.txt
if [ ! $? == 0 ]
then
  echo "FAIL reason: autograde.sh failed"
  exit 1
else
    echo "The file 'sample-output' has the correct statistics for the files"
    echo "testfile.txt, not-a-file.txt, and Gettysburg-Address.txt"
    echo "(not-a-file.txt is a file that doesn't exist. Make sure"
	echo "your program handles it correctly.)"
	echo
fi

if [ ! -f "README" ];then
  echo "FAIL reason: No README file (or it may be named something different)"
  exit 1
else
  echo "README found. Make sure it follows the correct format."
fi

echo "removing class files"
rm *.class
