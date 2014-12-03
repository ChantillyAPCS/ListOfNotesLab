// Benjamin Ward
// Chantilly APCS

// IMPORTANT: MAKE SURE TO DO YOUR OWN WORK. THIS IS ONLY FOR REFERENCE AND HELP IF 
// YOU GET STUCK, BECAUSE TROCHIM DOES NOT TEACH AT ALL. DO NOT TURN THIS IN!
// Turning this in will result in disciplinary actions if caught. This is not meant 
// to be turned in, and is only for reference. Turning this lab in is considered cheating.
// This file can be found in a Github repository at https://github.com/ChantillyAPCS/ListOfNotesLab

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
    
    public void storeImportantNote(String note) 
    {
    	notes.add(0, "Important: " + note);
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
    	if(noteNum < 0 || noteNum > notes.size()-1)
    		return;
        notes.remove(noteNum);
    }
    
    /**
     * Moves a note currently contained in the ListOfNotes to the end,
     * shifting all other elements to the left if needed
     * @param noteNum The number of the note to be moved.
     */
    public void endNote(int noteNum) 
    {
    	if(noteNum < 0 || noteNum > notes.size()-1)
    		return;
    	
    	String temp = notes.get(noteNum);
    	
    	// Shift elements over to the left if needed
    	int i = noteNum;
    	for(;i < notes.size()-1; i++) 
    	{
    		notes.set(i, notes.get(i+1));
    	}
    	
    	if(temp.startsWith("Important: ")) 
    	{
    		// Remove "Important: " from the note
    		temp = temp.substring(11);
    	}
    	notes.remove(i);
    	notes.add(temp);
    }
    
    public void exchangeNotes(int noteIndex) 
    {
    	if(noteIndex < 0 || noteIndex > notes.size()-2)
    		return;
    	
    	String temp = notes.get(noteIndex+1);
    	notes.set(noteIndex+1, notes.get(noteIndex));
    	notes.set(noteIndex, temp);
    }

    /**
     * Print all notes in the ListOfNotes.
     */
    public void printNotes()
    {
    	int i = 0;
        for(String note : notes) {
            System.out.println(Integer.toString(i) + ") " + note);
            i++;
        }
    }
    
    public void printImportantNotes() 
    {
    	int i = 0;
    	for(String note : notes) 
    	{
    		if(note.startsWith("Important: ")) 
    		{
    			System.out.println(Integer.toString(i) + ") " + note);
    			i++;
    		}
    	}
    }
}