class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int b[] = new int[nums.length];
        b = nums;int x=0;
        for(int i=0;i<nums.length;i++)
            if(b[i]!=0)
            {
                nums[x++]=b[i];
            }
        for(int i=x;i<nums.length;i++)
            nums[i]=0;
        return nums;
    }
}