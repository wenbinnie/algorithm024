class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        doPreorder(root,res);
        return res;
    }

    private void doPreorder(Node node,List<Integer> list){
        if(node == null){
            return;
        }

        list.add(node.val);
        for(Node temp:node.children){
            doPreorder(temp,list);
        }
    }
}


class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            Node cur = stack.pop();
            list.add(cur.val);
            Collections.reverse(cur.children);
            for(Node node:cur.children){
                stack.push(node);
            }
        }

        return list;
    }
}
