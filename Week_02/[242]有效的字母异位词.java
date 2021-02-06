
/**
 * 1.确认题目，保证理解了 2.想出尽可能多的解，分析时间空间 3.code 4.test case
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }
}


/**
 *
 * 此解法巧妙处在于 - 'a' 操作，开始没有理解，因为只有26个字母，这样减a操作能把字符转化为索引，而索引值则是字母出席的次数。
 *
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i : arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}


class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            map.put(schar,map.getOrDefault(schar,0)+1);
            map.put(tchar,map.getOrDefault(tchar,0)-1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) != 0){
                return false;
            }
        }

        return true;

    }
}


