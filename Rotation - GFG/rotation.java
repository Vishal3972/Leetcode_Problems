//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    int findKRotation(int arr[], int n) {
        int s = 0;
        int e = n-1;
        int index = -1;
        int ans = Integer.MAX_VALUE;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[s] <= arr[e]){
                if(arr[s] < ans){
                    ans = arr[s];
                    index = s;
                }
                break;
            }
            if(arr[s] <= arr[mid]){
                if(arr[s] < ans){
                    ans = arr[s];
                    index = s;
                }
                s = mid+1;
            }
            else{
                if(arr[mid] < ans){
                    ans = arr[mid];
                    index = mid;
                }
                e = mid-1;
            }
        }
        return index;
        
    }
}