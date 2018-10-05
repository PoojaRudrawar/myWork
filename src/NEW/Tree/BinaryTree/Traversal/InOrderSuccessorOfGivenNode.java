package NEW.Tree.BinaryTree.Traversal;

public class InOrderSuccessorOfGivenNode {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root, rootNode;
    static Node next = null;
    Node temp = null;
    static boolean found = false, outputNotPrinted = true;

    public static void main(String[] args) {
        InOrderSuccessorOfGivenNode tree = new InOrderSuccessorOfGivenNode();
        Node rootNode = new Node(1);
        tree.root = rootNode;
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        Node node = tree.getInOrderSuccessor(tree.root, 7);

        if (outputNotPrinted) {
            System.out.println("Node inorder successor found");
        }

    }

    private Node getInOrderSuccessor(Node root, int nodeData) {
        Node currentNode = root;
        if (currentNode != null) {
            if (currentNode.data == nodeData) {
                found = true;
                if (currentNode.right != null) {
                    System.out.println("Inorder succesor of " + nodeData + " is " + currentNode.right.data);
                    outputNotPrinted = false;
                }
                return currentNode;
            }
            if (!found) {
                temp = getInOrderSuccessor(root.left, nodeData);

                if (temp == null) {
                    temp = getInOrderSuccessor(root.right, nodeData);
                }
                if (found && outputNotPrinted) {
                    if (currentNode.left == temp) {
                        System.out.println("Inorder succesor of " + nodeData + " is " + currentNode.data);
                        outputNotPrinted = false;
                    } else return currentNode;
                }


                return temp;
            }
        }
        return null;
    }
}
