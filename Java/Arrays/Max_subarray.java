import java.util.Scanner;

class Kadanealgo {
    public static int maxSubArray(int[] nums) {
        int pos = 0, neg = 0;
        int sum = 0;
        // total sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] >= 0) {
                pos++;
            } else {
                neg++;
            }
        }
        // positive numbers == length means all numbers are positive and return whole
        // sum
        if (pos == nums.length) {
            return sum;
        }
        // negative numbers == length means all numbers are negative and return largest
        // integer
        else if (neg == nums.length) {
            int max = nums[0];
            // finding maximum
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        }
        // kadane algorithm - contains two variables one is current number and another
        // is maximum number
        else {
            int curr = 0;
            int maxi = 0;
            // iterate through whole array
            for (int i = 0; i < nums.length; i++) {
                // if negative then make current as zero
                if (curr + nums[i] <= 0) {
                    curr = 0;
                }
                // if positive add current with current element and find the maximum
                else {
                    curr += nums[i];
                    maxi = maxi >= curr ? maxi : curr;
                }
            }
            return maxi;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxSubArray(arr));
        sc.close();
    }
}
