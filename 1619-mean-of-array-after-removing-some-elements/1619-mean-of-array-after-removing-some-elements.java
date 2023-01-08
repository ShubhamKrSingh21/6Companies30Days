class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length,i,t=0;double c=0;Arrays.sort(arr);
        for(i=(int)(.05*n);i<(n-.05*n);i++)
        {c+=arr[i];t++;}
        return c/t;
    }
}