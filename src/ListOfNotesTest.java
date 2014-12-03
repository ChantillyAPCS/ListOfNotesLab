// Benjamin Ward
// Chantilly APCS P2

// IMPORTANT: MAKE SURE TO DO YOUR OWN WORK. THIS IS ONLY FOR REFERENCE AND HELP IF 
// YOU GET STUCK, BECAUSE TROCHIM DOES NOT TEACH AT ALL. DO NOT TURN THIS IN!
// Turning this in will result in disciplinary actions if caught. This is not meant 
// to be turned in, and is only for reference. Turning this lab in is considered cheating.
// This file can be found in a Github repository at https://github.com/ChantillyAPCS/ListOfNotesLab
public class ListOfNotesTest
{
	public static void main(String[] args) 
	{
		ListOfNotes book;
		book = new ListOfNotes();
		book.storeANote("this is a non-Important note");
		book.storeANote("this note is also not Important");
		book.storeImportantNote("Remember to study for exam!");
		System.out.println("Print notes (added notes):");
		book.printNotes();
		book.endNote(0);
		book.endNote(book.numNotes()-1);
		System.out.println("Print notes (endNote(0) and endNote(book.numNotes()-1)):");
		book.printNotes();
		book.exchangeNotes(0);
		book.exchangeNotes(book.numNotes()-1);
		System.out.println("Print notes (exchangeNotes(0) and exchangeNotes(book.numNotes()-1):");
		book.printNotes();
		book.storeANote(null);
		book.storeImportantNote(null);
		System.out.println("Print notes (book.storeANote(null)):");
		book.printNotes();
		System.out.println("Print important notes (book.storeImportantNote(null)):");
		book.printImportantNotes();
		book.removeANote(0);
		book.removeANote(book.numNotes()-1);
		book.storeANote("Note1");
		System.out.println("Print notes (book.removeANote(0), book.removeANote(book.numNotes-1), and book.storeANote('Note1')):");
		book.printNotes();
	}
}
