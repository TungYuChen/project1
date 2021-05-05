class Solution {
    private int key, count = 0;
    public boolean checkPossibility(int[] nums) {
        int temp;
        if (!checking(nums)) {
            temp = nums[key];
            nums[key] = nums[key+1];
            if (!checking(nums)) {
                nums[key] = temp;
                nums[key+1] = temp;
                if (!checking(nums)) {
                    return false;
                }
            }
        }
        return true;
        
    }
    public boolean checking(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            if (num[i] > num[i+1]) {
                if (count == 0) {
                    key = i;
                    count++;
                } 
                return false;
            }
        }
        return true;
    }
}
