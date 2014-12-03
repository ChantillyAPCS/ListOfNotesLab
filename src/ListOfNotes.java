// Warning: This class written by Trochim!

import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
*/
public class ListOfNotes
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * ListOfNotes.
     */
    public ListOfNotes()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the ListOfNotes.
     * @param note The note to be stored.
     */
    public void storeANote(String note)
    {
       notes.add(note);
    }

    /**
     * @return The number of notes currently in the ListOfNotes.
     */
    public int numNotes()
    {
        return notes.size();
    }

    /**
     * Remove a note from the ListOfNotes if it exists.
     * @param noteNum The number of the note to be removed.
     */
    public void removeANote(int noteNum)
    {
        if(noteNum < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNum < numNotes()) {
            // This is a valid note number.
            notes.remove(noteNum);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * Print all notes in the ListOfNotes.
     */
    public void printNotes()
    {
        for(String note : notes) {
            System.out.println(note);
        }
    }
}