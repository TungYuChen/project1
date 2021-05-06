class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return getMedian(nums2);
        }
        if (nums2.length == 0) {
            return getMedian(nums1);
        }
        int[] nums = new int[nums1.length + nums2.length];
        int count = 0;
        int i = 0, j = 0;
        while(count < nums.length) {
            if(nums1[i] <= nums2[j]) {
                nums[count] = nums1[i];
                if (i < nums1.length - 1) {
                    i++;
                } else {
                    nums1[i] = 1000001;
                }
                
            } else {
                nums[count] = nums2[j];
                if (j < nums2.length - 1) {
                    j++;
                } else {
                    nums2[j] =  1000001;
                }
                
            }
            
            count++;
        }
        return getMedian(nums);
        
    }
    
    private double getMedian(int[] nums) {
        if (nums.length % 2 == 1) {
            return nums[nums.length / 2];
        } else {
            return 0.5 * (nums[nums.length / 2 - 1] + nums[nums.length / 2]);
        }
    }
}
