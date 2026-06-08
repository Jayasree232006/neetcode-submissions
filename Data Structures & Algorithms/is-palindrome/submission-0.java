class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        // convert to lowercase
        s = s.toLowerCase();

        // keep only alphanumeric
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                str += ch;
            }
        }

        // compare first and last
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}