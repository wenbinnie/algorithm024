class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        doPermute(list,subList,0,nums);
        return list;
    }


    private void doPermute(List<List<Integer>> list,List<Integer> subList,int index,int[] nums){
        if(index == nums.length){
            list.add(new ArrayList<>(subList));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(subList.contains(nums[i]))continue;
            subList.add(nums[i]);
            doPermute(list,subList,index+1,nums);
            subList.remove(subList.size()-1);
        }


    }
}
