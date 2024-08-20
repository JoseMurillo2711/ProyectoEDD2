package TDA;

import java.util.Stack;


public class BinaryTree<E> {
    
    private NodeBinaryTree<E> root;

    public BinaryTree() {
        this.root=null;
    }
    
    public BinaryTree(NodeBinaryTree<E> root) {
        this.root=root;
    }
    
    public boolean isEmpty(){
        return root == null;
    }
    
    public boolean isLeaf(){
        if (!this.isEmpty()){
            return root.getLeft() == null && root.getRight() == null;
        }
        return false;
    }
    
    public int countLeavesRecursive(){
        if(this.isEmpty()){
            return 0;
        }
        else if (this.isLeaf()){
            return 1;
        }
        else {
            int leftLeaves = 0;
            int rightLeaves=0;
            
            if (this.root.getLeft() != null){
                leftLeaves = this.root.getLeft().countLeavesRecursive();
            }
            
            if (this.root.getRight() != null){
                rightLeaves = this.root.getRight().countLeavesRecursive();
            }
            
            return leftLeaves + rightLeaves;
        }  
    }
    
    public int countLeavesIterative() {
        int leaves=0;
        Stack<BinaryTree<E>> s = new Stack();
        if (!this.isEmpty()){
            s.push(this);
            
            while (!s.isEmpty()){
                
                BinaryTree<E> tree = s.pop();
                
                if (tree.isLeaf()){
                    leaves++;
                }
                
                if (tree.getRoot().getLeft() != null){
                    s.push(tree.getRoot().getLeft());
                }
                if (tree.getRoot().getRight() != null){
                    s.push(tree.getRoot().getRight());
            }    
        }   
    }
        return leaves;
    }
    
    
    public void recorrerPreorden(){
        if (!this.isEmpty()) {
            System.out.println(this.root.getContent());
            if (root.getLeft()!=null) {
                root.getLeft().recorrerPreorden(); 
            }
            if (root.getRight()!=null) {
                root.getRight().recorrerPreorden(); 
            }
        }
    }
    
    public void recorrerPostorden(){
        
        if (!this.isEmpty()){
            if (root.getLeft()!=null){
                root.getLeft().recorrerPostorden(); 
            }
            if (root.getRight()!=null){
                root.getRight().recorrerPostorden(); 
            }
            System.out.println(this.root.getContent());
        }
    }
    
    public void recorrerEnorden(){
        if (!this.isEmpty()){
            if (root.getLeft()!=null){
                root.getLeft().recorrerEnorden(); 
            }
            System.out.println(this.root.getContent());
            if (root.getRight()!=null){
                root.getRight().recorrerEnorden(); 
            }
            
        }
    }
    
    public NodeBinaryTree<E> getRoot() {
        return root;
    }

    public void setRoot(NodeBinaryTree<E> root) {
        this.root = root;
    }
    
    
}
