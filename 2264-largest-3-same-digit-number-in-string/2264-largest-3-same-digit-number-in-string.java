class Solution {
    public String largestGoodInteger(String s) {
        int i=0;
        int j=0;
        int ans=-1;
        while(j<s.length())
        {
            if(j-i+1==3)
            {
                if(s.charAt(i)== s.charAt(i+1) && s.charAt(i)== s.charAt(j)) 
                    ans = Math.max(ans,Integer.parseInt(s.substring(i,j+1)));    
                i++;
            }
            j++;
        }
        return ans==0?"000": ans==-1?"": ans+"";
    }
}