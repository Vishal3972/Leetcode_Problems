class Solution {
    public int[] mergeSort(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int nums[] = new int[arr1.length + arr2.length];
        int k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                nums[k++] = arr1[i++];
            }else{
                nums[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length){
            nums[k++] = arr1[i++];
        }
        while(j < arr2.length){
            nums[k++] = arr2[j++];
        }
        
        return Arrays.copyOf(nums, k);
    }
    
    public int[] sortArray(int[] nums) {
        if(nums.length <= 1){
            return nums;
        }
        
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end)/2;
        
        
        int[] part1 = new int[mid-start+1];
        for(int i=0; i<part1.length; i++){
            part1[i] = nums[start+i];
        }

        int[] part2 = new int[end-mid];
        for(int i=0; i<part2.length; i++){
            part2[i] = nums[mid+1+i];
        }
        
        part1 = sortArray(part1);
        part2 = sortArray(part2);
        
        return mergeSort(part1,part2);
    }
}