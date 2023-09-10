class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            // Check for both lowercase and uppercase vowels
            if ((str[i] == 'a' || str[i] == 'o' || str[i] == 'e' || str[i] == 'i' || str[i] == 'u' ||
                 str[i] == 'A' || str[i] == 'O' || str[i] == 'E' || str[i] == 'I' || str[i] == 'U') &&
                (str[j] == 'a' || str[j] == 'o' || str[j] == 'e' || str[j] == 'i' || str[j] == 'u' ||
                 str[j] == 'A' || str[j] == 'O' || str[j] == 'E' || str[j] == 'I' || str[j] == 'U')) {
                char c = str[i];
                str[i] = str[j];
                str[j] = c;
                i++;
                j--;
            } else if (str[i] != 'a' && str[i] != 'o' && str[i] != 'e' && str[i] != 'i' && str[i] != 'u' &&
                       str[i] != 'A' && str[i] != 'O' && str[i] != 'E' && str[i] != 'I' && str[i] != 'U') {
                i++;
            } else if (str[j] != 'a' && str[j] != 'o' && str[j] != 'e' && str[j] != 'i' && str[j] != 'u' &&
                       str[j] != 'A' && str[j] != 'O' && str[j] != 'E' && str[j] != 'I' && str[j] != 'U') {
                j--;
            }
        }
        s = String.valueOf(str);
        return s;
    }
}
