class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> t=new ArrayList<Integer>();
        HashSet<Integer> s=new HashSet<Integer>();
        for (int i=1;i<=nums.length;i++)
        s.add(i);
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i]))
                s.remove(nums[i]);
        }
        t.addAll(s);
        return t;
    }
}