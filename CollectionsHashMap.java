import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap instance
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 90);

        // Printing the HashMap
        System.out.println("Initial HashMap: " + studentGrades);

        // Accessing a value by its key
        String student = "Bob";
        if(studentGrades.containsKey(student)) {
            System.out.println(student + "'s grade: " + studentGrades.get(student));
        } else {
            System.out.println(student + " not found in the HashMap.");
        }

        // Removing a key-value pair
        studentGrades.remove("Charlie");

        // Iterating through the HashMap (using entrySet)
        System.out.println("\nIterating over HashMap:");
        for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Checking if the HashMap contains a particular value
        if (studentGrades.containsValue(92)) {
            System.out.println("\nThere is a student with the grade 92.");
        }

        // Clearing the HashMap
        studentGrades.clear();
        System.out.println("\nHashMap after clearing: " + studentGrades);
    }
}
