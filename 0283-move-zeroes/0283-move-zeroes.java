class Solution {
    public void moveZeroes(int[] nums) {
        int b[] = new int[nums.length];
        b = nums;int x=0;
        for(int i=0;i<nums.length;i++)
            if(b[i]!=0)
            {
                nums[x++]=b[i];
            }
        for(int i=x;i<nums.length;i++)
            nums[i]=0;
    }
}