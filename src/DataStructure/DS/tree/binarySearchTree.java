package DataStructure.DS.tree;

/**
 * Created by songchiyun on 2017. 7. 19..
 */
public class binarySearchTree {
    Node root;
    public binarySearchTree(){
        this.root = null;
    }
    public void Delete(int value, Node start){
        if(start == null){
            System.out.println("node is not exist");
            return;
        }
        if(value == start.value){
            if(start.left != null) {
                start = start.left;
                System.out.println("delete the node1");
            }
            else if(start.right != null){
                start = start.right;
                System.out.println("delete the node2");
            }
            else{
                start = null;
                System.out.println("delete the node3");
            }

        }
        else if(value > start.value){
            Delete(value, start.right);
        }
        else{
            Delete(value,start.left);
        }
    }
    public Node nodeCreate(int value){
        return new Node(value, null, null);
    }
    public void add(Node start, Node newNode){

        if(root == null){
            root = newNode;
            return;
        }
        if( newNode.value > start.value ){
            if(start.right == null){
                start.right = newNode;
                return;
            }
            add(start.right, newNode);
        }
        else{
            if(start.left == null){
                start.left = newNode;
                return;
            }
            add(start.left, newNode);
        }
    }

    public void Search(int value, Node start){

        if(start == null){
            System.out.println("node is not exist");
            return;

        }
        if(value == start.value){
            System.out.println("node is found");
            return;
        }
        else if(value > start.value){
            Search(value, start.right);
        }
        else{
            Search(value,start.left);
        }
    }
}
