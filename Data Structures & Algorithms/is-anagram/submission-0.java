

class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert strings to char arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Step 3: Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare arrays
        return Arrays.equals(arr1, arr2);
    }
}