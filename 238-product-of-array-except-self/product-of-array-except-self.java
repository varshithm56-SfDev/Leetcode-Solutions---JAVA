class Solution 
{
    public int[] productExceptSelf(int[] nums)
     {
         int []ans = new int[nums.length];
         Arrays.fill(ans,1);
          int curr =1;
          for(int i=0;i<nums.length;i++)
          {
            ans[i] =ans[i]*curr;
            curr *= nums[i];
          }
           curr=1;
           for(int m=nums.length-1;m>=0;m--)
           {
            ans[m] =ans[m]*curr;
            curr *=nums[m];
           }

           return ans;
     }
}