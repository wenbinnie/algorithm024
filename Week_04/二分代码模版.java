// 使用二分的前提是，数据要有单调性，也就是升序或者降序

public int binarySearch(int[]array,int target){
        ​    int left=0,right=array.length-1,mid;
        ​    while(left<=right){
        ​        mid=(right-left)/2+left;
        ​        if(array[mid]==target){
        ​            return mid;
        ​        }else if(array[mid]>target){
        ​            right=mid-1;
        ​        }else{
        ​            left=mid+1;
        ​        }
        ​    }
        ​    return-1;
        }
