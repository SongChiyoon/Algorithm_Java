package DataStructure.DS.tree;

/**
 * Created by songchiyun on 2017. 7. 19..
 */
public class BSTDemo {
    public static void main(String[] args){
        binarySearchTree bts = new binarySearchTree();

        bts.add(bts.root, bts.nodeCreate(10));

        bts.add(bts.root, bts.nodeCreate(6));

        bts.add(bts.root, bts.nodeCreate(9));

        bts.add(bts.root, bts.nodeCreate(12));

        bts.add(bts.root, bts.nodeCreate(11));

        bts.add(bts.root, bts.nodeCreate(15));

        bts.add(bts.root, bts.nodeCreate(1));
        System.out.println(bts.root.value);
        bts.Search(10, bts.root);
        bts.Delete(10, bts.root);
        bts.Search(10, bts.root);


    }
}
