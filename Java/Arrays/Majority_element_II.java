//advanced level of moore's algorithm i.e next level of majority problem
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //to find two majority element take two variable count
        int count1=0, count2=0;
        //as for the two candidate take two variables
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        //this loop for to find the candidate values
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==first)
             {
                count1++;
             } 
             else if(nums[i]==second)
             {
                count2++;
             }
            //first candidate value        
            else if(count1==0)
            {
                first=nums[i];
                count1++;
            }
            //second candidate value
            else if(count2==0)
            {
                second=nums[i];
                count2++;
            }
            else{
                    count1--;
                    count2--;
                }
            
            
        }
        int count11=0;
        int count22=0;
        int j;
        //this loop is for finding majority count
        for(j=0;j<nums.length;j++)
        {
            //count of first value
            if(nums[j]==first)
            {
                count11++;
            }
            //count of  second value
            else if(nums[j]==second)
            {
                count22++;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        //first value has more occurance then return the value
//         if(count11>nums.length/3)
//         {
           
//             ;
//         }
//         second value has more occurance then return the value
//         else if(count22>nums.length/3)
//         {
            
//             ;
//         }
//         else{
//             ;
//         }
        int flag=0;
        if(count11>nums.length/3)
        {
            flag=1;
            list.add(first);
        }
        if(count22>nums.length/3)
        {
            flag=1;
            list.add(second);
        }
        if(flag==0)
        {
            ;
        }
        return list;
    }
}
