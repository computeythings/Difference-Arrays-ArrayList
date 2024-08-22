import java.util.ArrayList;
import java.util.Arrays;

public class Difference_Arrays_ArrayLists {
    public static void main(String[] args)
    {
        // Difference in initialization:
        int[] array = new int[10]; // native type
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); // using java.util and must contain Object type Integer

        for(int i = 0; i < 10; i++)
        {
            // Adding elements
            array[i] = i;
            arrayList.add(i);
        }

        // Printing Elements
        System.out.println("Elements in array: " + Arrays.toString(array)); // Must use toString method from Arrays class
        System.out.println("Elements in ArrayList: " + arrayList.toString()); // Uses its own toString method

        // Removing elements
        array[3] = -1; // Fixed size, no real method to remove
        arrayList.remove(3); // Easily remove and dynamically resize

        System.out.println("Size of array: " + array.length); // Object property
        System.out.println("Size of ArrayList: " + arrayList.size()); // Object method

        // Built-in ArrayList methods that don't exist with arrays
        arrayList.contains(7); // check if value exists
        arrayList.indexOf(4); // find index of value
        arrayList.add(3, 6); // insert at index
    }
}
