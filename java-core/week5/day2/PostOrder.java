class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }


}

class Solution{
    public Node createBinaryTree(){
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right= new Node(5);

        return root;
    }
}

class Helper{
    public void PrintBinaryTree(Node node){
        System.out.println(node.data);
        if(node.left!=null) PrintBinaryTree(node.left);
        if(node.right!= null)PrintBinaryTree(node.right);
    }
}
public class PostOrder{
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = solution.createBinaryTree();
        Helper h = new Helper();
        h.PrintBinaryTree(root);
    }
}