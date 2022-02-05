class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            while(i<nums.length && nums[i]!=0){
                i++;
            }
            if(i==nums.length)
               break;
            j=i+1;
            while(j<nums.length && nums[j] ==0){
                j++;
            }
            if(j==nums.length)
               break;
            int temp =nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
        }
    }
}