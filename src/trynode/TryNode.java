/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trynode;

/**
 *
 * @author Win10
 */
public class TryNode {
    

    Node root; 
    
    public void addNode(int key, String name){ 
        
        Node newNode = new Node(key, name); 
        
        if(root == null){ 
            root = newNode; 
            
        }else{
            Node focusNode = root; 
            Node parent; 
            
            while(true){ 
                
                parent = focusNode; 
                
                if(key < focusNode.Key){ 
                
                    focusNode = focusNode.leftChild; 
                    
                    if(focusNode == null){ 
                        parent.leftChild = newNode; 
                        return; 
                    }
            }else { 
                    focusNode = focusNode.rightChild; 
                    if(focusNode == null){ 
                        parent.rightChild = newNode; 
                        return; 
                    }
                }
                
            }
        }
    }
    
    public void inOrderTraverseTree(Node focusNode){ 
        
        if (focusNode != null){ 
            inOrderTraverseTree(focusNode.leftChild); 
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild); 
        }

}
    
    public static void main(String[] args) {
        
        TryNode node = new TryNode(); 
        node.addNode(10, "Eubert");
        node.addNode(20, "Eubert");
        node.addNode(30, "Eubert");
        node.addNode(40, "Eubert");
        
        node.inOrderTraverseTree(node.root);
        
        
    }
   
    
}



class Node { 
    int Key; 
    String name; 
    
    Node leftChild; 
    Node rightChild; 
    
    Node(int key, String nmae) { 
        
        this.Key = Key; 
        this.name = name; 
    }
    
    public String toString(){ 
        return name + "Has a key of " + Key; 
    }
}
