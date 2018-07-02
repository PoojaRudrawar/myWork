package NEW.Tree.ChecknPrint;

public class ChildrenSumPropertyCheck {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Node root;

    public static void main(String[] args) {

        ChildrenSumPropertyCheck tree=new ChildrenSumPropertyCheck();
        tree.root=new Node(10);
        tree.root.left=new Node(8);
        tree.root.right=new Node(2);
        tree.root.left.left=new Node(3);
        tree.root.left.right=new Node(5);
        tree.root.right=new Node(2);

        boolean output=checkChildrenSum(tree.root);
        System.out.println(output);
    }

    private static boolean  checkChildrenSum(Node root) {
            if(root!=null){
               boolean left= checkChildrenSum(root.left);
               boolean right= checkChildrenSum(root.right);
               if(left && right) {
                   if (root.left == null && root.right == null)
                       return true;

                   if (root.data == ((root.left != null) ? root.left.data : 0) + ((root.right != null) ? root.right.data : 0))
                       return true;
                   else
                       return false;

               }else{
                   return false;
               }
            }
            return true;
    }
}
