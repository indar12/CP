class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1, vote = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(vote==0)
            {
                candidate=nums[i];
                vote=1;
            }
            else{
                if(nums[i]==candidate)
                {
                    vote++;
                }
                else{
                    vote--;
                }
            }
        }
        int count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==candidate)
            {
                count++;
            }
        }
        if(count>nums.length/2)
        {
            return candidate;
        }
        
        return -1;
    }
}
