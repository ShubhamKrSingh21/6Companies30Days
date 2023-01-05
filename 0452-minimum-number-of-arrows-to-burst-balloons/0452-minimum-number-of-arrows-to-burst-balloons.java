class Solution {
    public int findMinArrowShots(int[][] p) {
        Arrays.sort(p,(a,b)->Integer.compare(a[1],b[1]));
        int ar=1,end=p[0][1];
        for(int i=1;i<p.length;i++)
        {
            if(p[i][0]>end)
            {
                ar++;end=p[i][1];}
        }
        return ar;
    }
}