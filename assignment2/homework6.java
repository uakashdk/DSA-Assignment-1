class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length -1, mid;
        while(low <= high){
            mid = (low + high)/2;
            if (nums[mid] == target)
                return mid;
            if(target < nums[mid]){
                high = mid-1;
            }else
                low = mid+1;
        }
        return -1;
    }
}