class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<size;i++){
                for(Node temp:queue.peek().children)
                    if(temp != null){
                        queue.offer(temp);
                    }
                subList.add(queue.poll().val);
            }
            res.add(subList);
        }
        return res;
    }
}
