/**
 * 切题四件套
 *
 *
 * 复杂度分析
 *
 * 时间复杂度：O(nk \log k)O(nklogk)，其中 nn 是 \textit{strs}strs 中的字符串的数量，kk 是 \textit{strs}strs 中的字符串的的最大长度。需要遍历 nn 个字符串，对于每个字符串，需要 O(k \log k)O(klogk) 的时间进行排序以及 O(1)O(1) 的时间更新哈希表，因此总时间复杂度是 O(nk \log k)O(nklogk)。
 *
 * 空间复杂度：O(nk)O(nk)，其中 nn 是 \textit{strs}strs 中的字符串的数量，kk 是 \textit{strs}strs 中的字符串的的最大长度。需要用哈希表存储全部字符串。
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



