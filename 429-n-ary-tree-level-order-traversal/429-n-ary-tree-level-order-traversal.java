/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        List<List<Integer>> answer=new ArrayList<>();
        while(!queue.isEmpty()){
            int qSize=queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<qSize; i++){
                Node poll=queue.poll();
                list.add(poll.val);
                for(var node : poll.children){
                    queue.add(node);
                }
            }
            answer.add(list);
        }
        return answer;
    }
}