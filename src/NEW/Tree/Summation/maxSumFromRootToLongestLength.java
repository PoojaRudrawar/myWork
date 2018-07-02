package NEW.Tree.Summation;

public class maxSumFromRootToLongestLength {
    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int maxLen;
    static int maxSum;

    public static void main(String[] args) {
        Node root = new Node(4);         /*        4        */
        root.left = new Node(2);         /*       / \       */
        root.right = new Node(5);        /*      2   5      */
        root.left.left = new Node(7);    /*     / \ / \     */
        root.left.right = new Node(1);   /*    7  1 2  3    */
        root.right.left = new Node(2);   /*      /          */
        root.right.right = new Node(3);  /*     6           */
        root.left.right.left = new Node(6);

        System.out.println( "Sum = "
                + sumOfLongRootToLeafPathUtil(root));
    }

    private static int sumOfLongRootToLeafPathUtil(Node root) {
        if (root == null)
            return 0;

        maxSum = Integer.MIN_VALUE;
        maxLen = 0;

        // finding the maximum sum 'maxSum' for the
        // maximum length root to leaf path
        sumOfLongRootToLeafPath(root, 0, 0);

        // required maximum sum
        return maxSum;
    }

    private static void sumOfLongRootToLeafPath(Node root, int sum, int len) {
if(root==null)
{
    if(maxLen<len) {
        maxLen = len;
        maxSum = sum;
    }
    else if(maxLen==len && maxSum<sum)
        maxSum=sum;

    return;
}
sumOfLongRootToLeafPath(root.left,sum+root.data,len+1);

        sumOfLongRootToLeafPath(root.right,sum+root.data,len+1);


    }
}
