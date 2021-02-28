class Solution {
    public int search(int[] nums, int target) {
        int l = 0,r = nums.length -1;
        while(l <= r){
            int mid = (r-l)/2 + l;
            if(nums[mid] == target){
                return mid;
            }else if(nums[l] <= nums[mid]){ // 左边递增,之所以有=，是因为考虑两个数字的情况[3,1],mid=0,l=0,r=1
                if(nums[l] <= target && nums[mid] > target){ //在有序的范围内查找
                    r = mid -1;
                }else{
                    l = mid + 1;
                }
            }else{ // 右边递增
                if(nums[mid] < target && nums[r] >= target){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }
        }
        return -1;
    }
}
