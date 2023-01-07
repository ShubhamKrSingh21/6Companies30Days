class Solution {
    void gc(int st,int nums[],List<Integer> cur,List<List<Integer>> comb,int t)
    {
        if(t==0)
            comb.add(new ArrayList(cur));
        if(t<0)
            return;
        for(int i=st;i<nums.length;i++)
        {
            cur.add(nums[i]);
            gc(i,nums,cur,comb,t-nums[i]);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> x=new ArrayList();
        gc(0,candidates,new ArrayList(),x,target);
        return x;
    }
}