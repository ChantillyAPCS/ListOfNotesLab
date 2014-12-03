import static org.junit.Assert.*;

import org.junit.Test;


public class ListOfNotesTest
{
	public static void main(String[] args) 
	{
		ListOfNotes book;
		book = new ListOfNotes();
		book.storeANote("this is a non-Important note");
		book.storeANote("this note is also not Important");
		book.storeImportantNote("Remember to study for exam!");
		book.printNotes();
		book.endNote(0);
		book.endNote(book.numNotes()-1);
		book.exchangeNotes(0);
		book.exchangeNotes(book.numNotes()-1);
		book.printNotes();
		book.storeANote(null);
		book.storeImportantNote(null);
		book.printNotes();
	}
}
