package Mod3W1HW2;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class MapsandArrays {

	public static void main(String[] args) {
		ArrayList<String> modes = new ArrayList<>();
		
		modes.add("Dorian");
		modes.add("Mixolydian");
		modes.add("Aeolian");

		System.out.println("Mode List I:" + modes); //Print Array 1
		
		ArrayList<String> modes2 = new ArrayList<>();
		
		modes2.add("Ionian");
		modes2.add("Locrian");
		modes2.add("Lydian");
		
		System.out.println("Mode List II:" + modes2); //Print Array 2
		
		modes2.addAll(modes); // Combine Arrays
		System.out.println("Mode List III:" + modes2); //Print Array 3
		
		ArrayList<String> modes3 = new ArrayList<String>(modes2.subList(3, 5)); //Extracting..
		System.out.println("SubList extracted from List III: " + modes3); //Print SubList
		
		Collections.swap(modes2, 3, 4); //Swap elements
		System.out.println("Swaped:" + modes2);
		
		//Is modes2 an empty Array??
		
		boolean ans = modes2.isEmpty();
		
		ans = modes2.isEmpty();
        if (ans == true)
            System.out.println("ArrayList is empty.");
        else
            System.out.println("ArrayList is not empty.");
        
        System.out.println("OG Swapped List:" + modes2);
        
        modes2.set(1, "Phrygian"); //New element(7th Mode) to replace 2nd 
        
        System.out.println("Updated Swapped List:" + modes2);
        
        // trims the size to the number of elements
        modes2.trimToSize();
  
        System.out.println("The 6 Modes of 'Updated Swap' are:");
  
        // prints all the elements
        for (String string : modes2) {
            System.out.println("Mode = " + string);
        }
        
        HashSet<String> keys = new HashSet();
        		keys.add("A");
        		keys.add("A#/Bb");
        		keys.add("B");
        		keys.add("C");
        		keys.add("C#/Db");
        		keys.add("D");
        		keys.add("D#/Eb");
        		keys.add("E");
        		keys.add("F");
        		keys.add("F#/Gb");
        		keys.add("G");
        		keys.add("G#/Ab");
         System.out.println("Original Hash Set (12Keys): " + keys);
         System.out.println("Checking if the above key list is empty or not..." + keys.isEmpty()); // Is Hash set empty?
         System.out.println("Size of the Hash Set: " + keys.size()); //SetSize

         // set Iterator 
         Iterator<String> i = keys.iterator();
         // Iterate the hash set
        while (i.hasNext()) {
        System.out.println(i.next());
        }
        
        HashSet<String> keys2 = new HashSet<String>();
        keys2.add("A#/Bb");
        keys2.add("C#/Db");
        keys2.add("D#/Eb");
        keys2.add("F#/Gb");
        keys2.add("G#/Ab");

        keys.retainAll(keys2);
        System.out.println("Sharps/Flats Removed:");
        System.out.println(keys);
        
        
	}
	

}
