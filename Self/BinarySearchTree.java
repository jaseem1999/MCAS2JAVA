package Self;
//binery search tree
import java.util.Scanner;

class Nodes {
    int data;
    Nodes left;
    Nodes right;
}

class BinarySearchTree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodes root = null;
        BinarySearchTree bst = new BinarySearchTree();
        while (true) {
            System.out.println("Enter the choice:");
            System.out.println("1.Insert\n2.Search\n3.Inorder\n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int data = sc.nextInt();
                    root = bst.insert(root, data);
                    break;
                case 2:
                    System.out.println("Enter the element to be searched:");
                    int key = sc.nextInt();
                    if (bst.search(root, key) == true) {
                        System.out.println("Element found");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 3:
                    System.out.println("Inorder Traversal:");
                    bst.inorder(root);
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public Nodes insert(Nodes root, int data) {
        if (root == null) {
            root = new Nodes();
            root.data = data;
            root.left = null;
            root.right = null;
        } else if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(Nodes root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data <= root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public void inorder(Nodes root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

}