class Solution {
    public int passThePillow(int n, int time) {
        if (n == 1) {
            return 1;
        }

        int direction = 1;
        int currentPerson = 1;
        for (int t = 0; t < time; t++) {
            currentPerson += direction;

            if (currentPerson == n) {
                direction = -1;
            } else if (currentPerson == 1) {
                direction = 1;
            }
        }

        return currentPerson;
    }
}