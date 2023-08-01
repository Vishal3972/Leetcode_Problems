class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n>9){
            int temp = n%10;
            product *= temp;
            sum += temp;
            n = n/10;
        }
        product *= n;
        sum += n;
        return product - sum;
    }
}