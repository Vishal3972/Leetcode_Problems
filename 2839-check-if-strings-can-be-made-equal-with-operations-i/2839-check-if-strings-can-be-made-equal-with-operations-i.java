class Solution {
   
    public boolean canBeEqual(String s1, String s2) {        
        if (s1.equals(s2)) {
            return true;
        } else {
            String sw1 = String.valueOf(s1.charAt(2)) + s1.charAt(1) + s1.charAt(0) + s1.charAt(3);
            String sw2 = String.valueOf(s1.charAt(0)) + s1.charAt(3) + s1.charAt(2) + s1.charAt(1);
            String sw3 = String.valueOf(s1.charAt(2)) + s1.charAt(3) + s1.charAt(0) + s1.charAt(1);
            return (s2.equals(sw1) || s2.equals(sw2) || s2.equals(sw3));
        }
    }
}