class Solution {
    void gs(int idx,int nums[],List<Integer> curr,List<List<Integer>> res)
    {
        res.add(new ArrayList(curr));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx&&nums[i-1]==nums[i])
                continue;
            curr.add(nums[i]);
            gs(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList();Arrays.sort(nums);
        gs(0,nums,new ArrayList(),res);
        return res;
    }
}