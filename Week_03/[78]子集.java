class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        doSub(0,nums,ans,new ArrayList<Integer>());
        return ans;
    }

    private void doSub(int index,int[] nums,List<List<Integer>> ans,List<Integer> subList){
        if(index == nums.length){
            //因为每次都会remove，所以要做一个浅拷贝副本，直接add subList 最后都为null
            ans.add(new ArrayList<Integer>(subList));
            return;
        }

        doSub(index+1,nums,ans,subList);

        subList.add(nums[index]);
        doSub(index+1,nums,ans,subList);

        subList.remove(subList.size()-1);
    }
}
