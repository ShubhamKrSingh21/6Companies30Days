class Solution {
    void gs(int st,int end,List<Integer> cur,List<List<Integer>> sub,int k, int tar)
    {
        if(tar==0&&cur.size()==k)
        {
            sub.add(new ArrayList(cur));
            return;
        }
        for(int i=st;i<=end;i++)
        {
            cur.add(i);
            gs(i+1,end,cur,sub,k,tar-i);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> s=new ArrayList();
        gs(1,9,new ArrayList(),s,k,n);
        return s;
    }
}