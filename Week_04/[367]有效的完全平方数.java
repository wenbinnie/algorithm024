class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while(l <= r){
            int mid = (r-l)/2 + l;
            // mid * mid 使用long 防止越界
            long temp = (long)mid * mid;
            if(temp == num){
                return true;
            }else if(temp < num){
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }

        return false;
    }
}





    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }


