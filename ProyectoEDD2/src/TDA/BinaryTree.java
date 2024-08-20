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
        // root no esta vacio
        if (!this.isEmpty()){
            return root.getLeft() == null && root.getRight() == null;
            // return root.getLeft().isEmpty() && root.getRight().isEmpty();
        }
        return false;
    }
    
    public int countLeavesRecursive(){
        // Caso base 1: Árbol vacío
        if(this.isEmpty()){
            return 0;
        }
        
        // Caso base 2: El árbol es una hoja
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
        // Algoritmo
        // Contar las hojas
        // Iterar o recorrer
        
        // contador
        int leaves=0;
        
        // Pila que almacenará los elementos del árbol que no han sido visitados
        Stack<BinaryTree<E>> s = new Stack();
        
        // Caso base 1: Árbol vacÍo
        
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
        
        // 1. Imprimir a la raiz
        // 2. recorrer preorden en hijo izquierdo
        // 3. recorrer preorden en hijo derecho
        
        if (!this.isEmpty()) {
            
            // 1. Imprimir a la raiz
            System.out.println(this.root.getContent());
            
            // 2. recorrer preorden en hijo izquierdo
            if (root.getLeft()!=null) {
                root.getLeft().recorrerPreorden(); 
            }
        
            // 3. recorrer preorden en hijo derecho
            if (root.getRight()!=null) {
                root.getRight().recorrerPreorden(); 
            }
        }
    }
    
    public void recorrerPostorden(){
        
        if (!this.isEmpty()){
            
            // 1. recorrer postorden en hijo izquierdo
            if (root.getLeft()!=null){
                root.getLeft().recorrerPostorden(); 
            }
        
            // 2. recorrer postorden en hijo derecho
            if (root.getRight()!=null){
                root.getRight().recorrerPostorden(); 
            }
            
            // 3. Imprimir a la raiz
            System.out.println(this.root.getContent());
        }
    }
    
    public void recorrerEnorden(){
        
        if (!this.isEmpty()){
            
            // 1. recorrer enorden en hijo izquierdo
            if (root.getLeft()!=null){
                root.getLeft().recorrerEnorden(); 
            }
        
            // 2. Imprimir a la raiz
            System.out.println(this.root.getContent());
            
            // 3. recorrer enorden en hijo derecho
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
