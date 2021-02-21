class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        doPost(root,list);
        return list;
    }

    private void doPost(Node node,List<Integer> list){
        if(node == null){
            return;
        }
        for(Node subNode:node.children){
            doPost(subNode,list);
        }
        list.add(node.val);
    }
}


public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Deque<Node> stack = new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node cur = stack.pop();

            List<Node> ch = cur.children;
            for(Node node:ch){
                stack.push(node);
            }
            ans.add(cur.val);
        }
        Collections.reverse(ans);
        return ans;
    }
}
