// Java program to demonstrate working of HashTable 

import java.util.*;

public class HashTable {
    public static void main(String args[]) {
        Hashtable<String, String> contactlist = new Hashtable<String, String>();

        // Put
        // Inserts key-value pairs in a hash table.
        contactlist.put("Mama", "09068232544");
        contactlist.put("Papa", "09248563215");
        contactlist.put("Ate", "09254781563");
        contactlist.put("Kuya", "09658411354");
        contactlist.put("Bunso", "09548632596");


        // Remove
        // Removes key-value pairs in a hash table.
        contactlist.remove("Mama");

        // Get
        // Retrieves a value in a hash table using a key.
        System.out.println(contactlist.get("Papa"));

        // Size
        // Returns the total number of key-value pairs in the hash table.
        System.out.println(contactlist.size());

        // Show all content of hash table
        System.out.println(contactlist);

        // Clear
        // Resets and empties the hash table.
        contactlist.clear();
    }
}
