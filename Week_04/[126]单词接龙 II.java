/**
 * 输入:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * <p>
 * 输出:
 * [
 * ["hit","hot","dot","dog","cog"],
 *   ["hit","hot","lot","log","cog"]
 * ]
 * <p>
 * <p>
 * 思路：
 * 1 level [hit]
 * 2 level [hit,hot] 逻辑是在list最后一个元素字符串的基础上，逐一字符替换a-z，检查是否在字典中，
 *
 * 思路说明：在到达最短路径所在的层时，记录并输出所有符合条件的路径。
 * 在单词接龙的基础上，需要将找到的最短路径存储下来；
 * 之前的队列只用来存储每层的元素，那么现在就得存储每层添加元素之后的结果："ab","if",{"cd","af","ib","if"}；
 * （1）第一层：{"ab"}
 * （2）第二层：{"ab","af"}、{"ab","ib"}
 * （3）第三层：{"ab","af","if"}、{"ab","ib","if"}
 * 如果该层添加的某一个单词符合目标单词，则该路径为最短路径，该层为最短路径所在的层，但此时不能直接返回结果，必须将该层遍历完，将该层所有符合的结果都添加进结果集；
 * 每层添加单词的时候，不能直接添加到总的已访问单词集合中，需要每层有一个单独的该层访问的单词集，该层结束之后，再会合到总的已访问单词集合中，原因就是因为3.
 *
 */

class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        // 字典为空或者字典中不包含目标值,直接返回
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return res;
        }

        // 已经访问过的单词集合：只找最短路径，所以之前出现过的单词不用出现在下一层
        Set<String> visited = new HashSet<>();

        // 累积每一层的结果队列
        Queue<List<String>> queue = new LinkedList<>();
        List<String> list = new ArrayList<>(Arrays.asList(beginWord));
        queue.offer(list);
        visited.add(beginWord);

        boolean findEndWord = false;
        while (!queue.isEmpty() && !findEndWord) {
            int size = queue.size();
            Set<String> subVisited = new HashSet<>();
            for (int i = 0; i < size; i++) {
                List<String> path = queue.poll();
                // 获取该路径上一层的单词
                String word = path.get(path.size() - 1);
                char[] chars = word.toCharArray();
                // 寻找该单词的下一个符合条件的单词
                for (int j = 0; j < chars.length; j++) {
                    char temp = chars[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[j] = ch;
                        if(temp==ch){
                            continue;
                        }

                        String newStr = new String(chars);
                        if(!visited.contains(newStr) && dict.contains(newStr)){
                            List<String> newLevel = new ArrayList<>(path);
                            newLevel.add(newStr);
                            if(newStr.equals(endWord)){
                                findEndWord = true;
                                res.add(newLevel);
                            }
                            queue.offer(newLevel);
                            subVisited.add(newStr);
                        }
                    }
                    chars[j] = temp;
                }
            }
            visited.addAll(subVisited);
        }
        return res;
    }
}
