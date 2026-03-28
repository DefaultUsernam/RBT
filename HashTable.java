/*


import java.util.*;
import java.io.*;

public class HashTable {
    String[] keys;
    int index;

    public HashTable() {
        keys = new String[100];
        index = 0;
    }
    // Methods you have to supply:

    public void put(String key) {
        // check to see if 2/3 of table is full because if so, must resize (double) the
        // hashtable
        if (((Double) index) >= (keys.length) * (2.0 / 3.0)) {
            resize();
        }

        // goes through the array and inserts immediately if the space is open, if it's
        // occupied it puts the key into the next available space
        int h = Math.abs(key.hashCode()) % keys.length;

        while (keys[h] != null) {
            // replace if already exists;
            if (keys[h].equals(key)) {
                keys[h] = key;
                return;
            }
            h = (h + 1) % keys.length;
        }
        keys[h] = key;

        index++;
    }

    public String get(String key) {

        // goes through the array and retrieves the key immediately if the space is
        // occupied by it, if it's occupied by the key it returns the key, else it keeps
        // searching for the key forward down the array
        int h = Math.abs(key.hashCode()) % keys.length;
        while (keys[h] != null) {
            if (keys[h].equals(key)) {
                return keys[h];
            }
            h = (h + 1) % keys.length;
        }
        return null;
    }

    public String remove(String key) {
        // goes through array to find key
        int h = Math.abs(key.hashCode()) % keys.length;
        while (keys[h] != null) {
            if (keys[h].equals(key)) {
                // takes out key
                String remove = keys[h];
                keys[h] = null;
                index--;
                // rehashes
                h = (h + 1) % keys.length;
                while (keys[h] != null) {
                    String t = keys[h];
                    keys[h] = null;
                    index--;
                    put(t);
                    h = (h + 1) % keys.length;
                }
                return remove;
            }
            h = (h + 1) % keys.length;
        }
        return null;
    }

    public void resize() {
        // store past items from old array
        String[] arrStrings = keys;
        // double size of array
        keys = new String[arrStrings.length * 2];
        index = 0;
        // rehash array with previous keys
        for (int i = 0; i < arrStrings.length; i++) {
            if (arrStrings[i] != null) {
                put(arrStrings[i]);
            }
        }

    }

    // returns the iterator i created
    public Iterator<String> keys() {
        return new myItr();
    }

    public void print() {
        // prints out everything using the iterator
        Iterator<String> itr = keys();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    /*
     //* Loads this HashTable from a file named "Lookup.dat".
     
    public void load() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        // Open the file for reading
        try {
            File f = new File(System.getProperty("user.home"), "Lookup.dat");
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find input file \"Lookup.dat\"");
        }

        // Read the file contents and save in the HashTable
        try {
            while (true) {
                String key = bufferedReader.readLine();
                if (key == null)
                    return;
                String value = bufferedReader.readLine();
                if (value == null) {
                    System.out.println("Error in input file");
                    System.exit(1);
                }
                String blankLine = bufferedReader.readLine();
                if (!"".equals(blankLine)) {
                    System.out.println("Error in input file");
                    System.exit(1);
                }
                put(key);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        // Close the file when we're done
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    /**
    // * Saves this HashTable onto a file named "Lookup.dat".
     
    public void save() {
        FileOutputStream stream;
        PrintWriter printWriter = null;
        Iterator iterator;

        // Open the file for writing
        try {
            File f = new File(System.getProperty("user.home"), "Lookup.dat");
            stream = new FileOutputStream(f);
            printWriter = new PrintWriter(stream);
        } catch (Exception e) {
            System.err.println("Cannot use output file \"Lookup.dat\"");
        }

        // Write the contents of this HashTable to the file
        iterator = keys();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            printWriter.println(key);
            String value = (String) get(key);
            value = removeNewlines(value);
            printWriter.println(value);
            printWriter.println();
        }

        // Close the file when we're done
        printWriter.close();
    }

    /**
   //  * Replaces all line separator characters (which vary from one platform
   //  * to the next) with spaces.
   //  * 
    // * @param value The input string, possibly containing line separators.
     //* @return The input string with line separators replaced by spaces.
     
    private String removeNewlines(String value) {
        return value.replaceAll("\r|\n", " ");
    }

    private class myItr implements Iterator<String> {
        int a;

        public myItr() {
            int d = 0;

            // finds first non null object in keys
            while (keys[d] == null) {
                d++;
            }
            a = d;
        }

        // checks for the next appearance of something (not null) in the array, if
        // there's nothing else it returns false
        public boolean hasNext() {
            while (a < keys.length && keys[a] == null) {
                a++;
            }
            return a < keys.length;
        }

        public String next() {
            // if a next exists, move current index "a" to the next key and return it
            if (hasNext() == false) {
                return null;
            }
            while (a < keys.length && keys[a] == null) {
                a++;
            }
            return keys[a];
        }

        public void remove() {
            // i'm a a bit confused here, do i delete the current object, the next one,
            // recode the other remove(), or something else? honestly not sure what to put
            // here. throw exceptions?
            keys[a] = null;
            next();
        }
    }

}
*/