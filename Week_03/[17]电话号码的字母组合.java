class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null ||digits.length()==0)return ans;

        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        doCombination(0,digits,ans,"",map);
        return ans;
    }
// 思路和生成有效的括号一样，模版也相似
    private void doCombination(int index, String digits, List<String> list,String str,Map<Character,String> map){
        if(index == digits.length()){
            list.add(str);
            return ;
        }
        String letters = map.get(digits.charAt(index));

        for(int i=0;i<letters.length();i++){
            doCombination(index+1,digits,list,str+letters.charAt(i),map);
        }
    }
}
