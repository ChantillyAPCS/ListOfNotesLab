ListOfNotesLab
==============
IMPORTANT: MAKE SURE TO DO YOUR OWN WORK. THIS IS ONLY FOR REFERENCE AND HELP IF YOU GET STUCK, BECAUSE TROCHIM DOES NOT TEACH AT ALL. DO NOT TURN THIS IN!
==============
Turning this in will result in disciplinary actions if caught. This is not meant to be turned in, and is only for reference. Turning this lab in is considered cheating.

Lab due 12/7/2014

ListOfNotes Lab
ArrayLists
Objectives: 
To get practice with collections and loops. 

Directions (mostly by Trochim, from the assignment sheet):

1.	Copy the ListOfNotes class into Eclipse (NOT JGRASP) (this class is found in this repository) 

2.	Take a moment to familiarize yourself with the Java code in the ListOfNotes class. The collection of notes is represented by an ArrayList of Strings (created in the constructor), and there are methods that add Strings to the list, remove Strings, and a loop that displays all of the Strings in the collection. Create an instance of ListOfNotes and experiment with its methods to get a feel for how it works. (Don't actually bother to do this, it's pretty useless)

3.	The storeANote method always adds new items at the end of the list. Users may prefer to add new items to the beginning of the list instead — especially if the notes are Important. Add a new method called storeImportantNote that works just like storeANote, but adds the new note to the front of the collection. It should prepend "Important: " to the front of the note string before adding it, to make clear that this is a high-priority item, as illustrated in the partial tester statements below. 

4.	Positions within an ArrayList are zero based. That is, the first item is at position zero, the next item is at position 1, etc. The removeANote method assumes users will pass in the appropriate zero-based number when specifying which note to remove, but users may not be familiar with this convention. Let's make it easier on the user and show item numbers when displaying the list. Change the code in the printNotes method so that it maintains a counter (an integer variable), and displays this number along with the notes as shown below. Note: You should not alter the basic loop. Instead, add extra statements to the existing loop to implement the numbers. 

5.	Write a printImportantNotes method that only displays the Important messages in the list. In other words, it only displays the notes that have "Important: " at the beginning. (There is a  'startsWith' method in the String class that you may find useful.) 

6. Write a method called endNote that takes a note number, just like removeANote does. Instead of removing the note from the list, endNote should move it to the end of the list. There's no ArrayList method for performing exactly this operation, but you can accomplish it by doing a remove and an add. To keep things simple, you may assume that the user passes in a valid, zero-based note number. Note that if you move an Important note, you must remove the "Important: " prefix from the moved note, if it's present. You can use startsWith to determine if the prefix is present, and substring from the String class to extract everything but the prefix.

7.	Write an exchangeNotes method that takes a note number like endNote does, but exchanges the specified note with its successor. In the example below (Check the assignment document written by Trochim, included in this repository), the note at position 1 is being swapped with the note "below" it: 

8. You need to write a ListOfNotesTester that tests each method in the ListOfNotes class.

Contributed by Benjamin Ward
