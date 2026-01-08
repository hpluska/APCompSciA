# Card Search and Sort

## Introduction
In this lab you will implement methods to search and sort an array of cards

## Your Tasks

- [ ] ~~Locate the CardSearchAndSort lab guide [CardSearchAndSort.pdf](CardSearchAndSort.pdf)~~

- [ ] ~~Complete the group portion of the lab as instructed~~

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

In the CardCounter class write a method called minToFront.  The minToFront method should locate the card with the lowest value in the dealtCardsArray then move it to the front of the array. It should return the new dealtCardsArray. The minToFront method should have the following signature,
 
```
public Card[] minToFront(Card[] cArr);

```

- selectionSort

In the CardCounter class write a method called selectionSort.  The selectionSort method should accept an unordered array of cards, then return the sorted array.  The selectionSort method should have the following signature, 

```
public Card[] selectionSort(Card[] cArr);

```

- insertionSort 

In the CardCounter class write a method called insertionSort.  The insertionSort method should accept an unordered array of cards, then return the sorted array.  The insertionSort method should have the following signature, 

```
public Card[] insertionSort(Card[] cArr);

```