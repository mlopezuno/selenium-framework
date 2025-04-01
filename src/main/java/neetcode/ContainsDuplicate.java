package neetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        // Using HashSet to store unique numbers
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set (duplicate found), return true
            if (set.contains(num)) {
                return true;
            }
            set.add(num); // Otherwise, add it to the set
        }

        // If no duplicates were found, return false
        return false;
    }
}
