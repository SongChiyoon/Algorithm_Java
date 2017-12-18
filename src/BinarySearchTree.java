package sort;
import java.util.*;
public class BinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(5);
		bst.add(6);
		bst.add(21);
		bst.add(16);



		bst.delete(bst.getRoot(),10);
		if(!bst.search(10))
			System.out.println("not find 10");

		bst.printTree(bst.root);

	}
	public void printTree(Node current){
		System.out.println(current.getData());
		if(current.getLeftChild() != null)
			printTree(current.getLeftChild());
		if(current.getRightChild() != null)
			printTree(current.getRightChild());
	}
	Node root;
	BinarySearchTree(){
		this.root = null;
	}
	public boolean search(int data) {
		Node temp = root;
		while(true) {
			if(temp == null)
				return false;
			if(temp.getData() == data) {
				return true;
			}
			else if(temp.getData() > data) {
				temp = temp.getLeftChild();
			}
			else {
				temp = temp.getRightChild();
			}
		}
		
	}
	public Node getNode(Node node, int data) {
		Node temp = node;
		while(true) {
			if(temp == null)
				return null;
			if(temp.getData() == data) {
				return temp;
			}
			else if(temp.getData() > data) {
				temp = temp.getLeftChild();
			}
			else {
				temp = temp.getRightChild();
			}
		}

	}
	public boolean add(int data) {
		Node node = new Node();
		node.setData(data);
		node.setLeftChild(null);
		node.setRightChild(null);
		
		if(root == null) {
			root = node;
			return true;
		}
		Node temp = root;
		
		while(true) {
			
			if(temp.getData() == node.getData())
				return false;
			else if(temp.getData() < node.getData()) {
				if(temp.getRightChild() == null) {
					node.setParent(temp);
					temp.setRightChild(node);
					return true;
				}
				else {
					temp = temp.getRightChild();
					continue;
				}
			}
			else {
				if(temp.getData() > node.getData()) {
					if(temp.getLeftChild() == null) {
						node.setParent(temp);
						temp.setLeftChild(node);
						return true;
					}
					else {
						temp = temp.getLeftChild();
						continue;
					}
				}
			}
		}
		
	}
	public Node findMin(Node node){
		if(node == null)
			return null;
		if(node.getLeftChild() != null) return findMin(node.getLeftChild());
		else return node;
	}
	public void delete(Node node, int data) {

		System.out.println("start delete : " + data);
		Node remove = getNode(node, data);
		if(remove==null){
			System.out.println("no data");
			return;
		}
		System.out.println("find");
		if(remove.getRightChild()==null && remove.getLeftChild()==null){

			if(remove.getParent().getLeftChild() == remove)
				remove.getParent().setLeftChild(null);
			else
				remove.getParent().setRightChild(null);
			System.out.println("delete");
			return;
		}
		if(remove.getLeftChild() !=null && remove.getRightChild()!=null){

			Node temp = findMin(remove.getRightChild());
			int remove_data = remove.getData();
			remove.setData(temp.getData());

			temp.setData(remove_data);
			delete(remove.getRightChild(), remove_data);

			return;
		}
		else {

			if(remove.getLeftChild() !=null){
				if(remove.getParent().getLeftChild() == remove){
					remove.getParent().setLeftChild(remove.getLeftChild());
				}
				else{
					remove.getParent().setRightChild(remove.getLeftChild());
				}
			}
			else{
				if(remove.getParent().getLeftChild() == remove){
					remove.getParent().setLeftChild(remove.getRightChild());
				}
				else{
					remove.getParent().setRightChild(remove.getRightChild());
				}

			}
			System.out.println("delete");
			return;
		}
	}
	public Node getRoot(){return this.root;}
}
