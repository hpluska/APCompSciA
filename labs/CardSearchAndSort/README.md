# Card Search and Sort

## Introduction
In this lab you will implement methods to search and sort an array of cards

## Your Tasks

- [ ] Locate the CardSearchAndSort lab guide [CardSearchAndSort.pdf](CardSearchAndSort.pdf)

- [ ] Complete the group portion of the lab as instructed

- [ ] Complete the individual portion of the lab

	* If you have not finished the CardCounter lab, you must do this before continuing with this lab
	* Locate your CardCounter project folder, then locate the CardCounter class. 
	* Implement the following methods in the CardCounter class

		- locateCard
In the CardCounter class write a method called locateCard.  The locateCard method should search the dealtCardsArray for a Card.  If the Card is found, the index of the card in the dealtCardsArray is returned, otherwise the method will return -1.   The locateCard method should have the following signature, 
```
public int locateCard(Card[] cArr, Card c);
```
		- minToFront
In the CardCounter class write a method called minToFront.  The minToFront method should locate the card with the lowest value in the dealtCardsArray then move it to the front of the array.  The minToFront method should have the following signature, 
```
public void minToFront(Card[] cArr);
```
		- cardSort
In the CardCounter class write a method called cardSort.  The cardSort method should accept an unordered array of cards, then return the sorted array.  The cardSort method should have the following signature, 
```
public Card[] cardSort(Card[] cArr);
```

