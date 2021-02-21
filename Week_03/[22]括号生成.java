class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        doGenerateParenthesis(0,0,n,ans,"");
        return ans;
    }

    private void doGenerateParenthesis(int left,int right,int max,List<String> list,String str){
        if((left == max) && (right == max)){
            list.add(str);
            return;
        }

        if(left < max)doGenerateParenthesis(left +1,right,max,list,str+"(");
        if(left > right)doGenerateParenthesis(left,right+1,max,list,str+")");

    }
}


class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        doGenerateParenthesis(0, 0, n, "");
        return list;
    }

    private void doGenerateParenthesis(int left,int right,int max,String str){
        if(left == max && right == max){
            list.add(str);
            return;
        }

        if(left < max)doGenerateParenthesis(left +1,right,max,str+"(");
        if(left > right)doGenerateParenthesis(left,right+1,max,str+")");
    }
}
