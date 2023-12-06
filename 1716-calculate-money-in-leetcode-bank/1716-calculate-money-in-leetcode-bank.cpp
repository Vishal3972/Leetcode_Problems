class Solution {
public:
    int totalMoney(int n) {
        
        int total = 0;
        int temp = 1;
        int result = 1;
        
        for(int day=1;day<=n;day++){
            if(day%7==0){
                total = result + total;
                temp++;
                result = temp;
            }else{
                 
            total = result + total;
            result++;
            }
              
        }
       
        return total;
    }
};