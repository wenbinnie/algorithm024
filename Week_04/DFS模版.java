
// 递归
public List<List<Integer>>levelOrder(TreeNode root){

        ​    List<List<Integer>>allResults=new ArrayList<>();

        ​    if(root==null){

        ​      return allResults;

        ​    }

        ​    travel(root,0,allResults);

        ​    return allResults;

        }

private void travel(TreeNode root,int level,List<List<Integer>>results){

        ​    if(results.size()==level){

        ​      results.add(new ArrayList<>());

        ​    }

        ​    results.get(level).add(root.val);

        ​    if(root.left!=null){

        ​      travel(root.left,level+1,results);

        ​    }

        ​    if(root.right!=null){

        ​      travel(root.right,level+1,results);

        ​    }

        }

