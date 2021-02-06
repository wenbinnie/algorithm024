/**
 * 切题四件套
 *
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            List<String> list = map.getOrDefault(newStr, new ArrayList<>());
            list.add(str);
            map.put(newStr, list);
        }

        return new ArrayList<>(map.values());
    }
}

    /**
     * 不用排序，判断一个字符串相等
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }



