package aldaya_exam2;

import java.util.LinkedList;
import java.util.Scanner;

class Node{
String data;
Node next;


    Node (String m) {
            
         data = m;
         next = null;
     }
}


public class Aldaya_Exam2 {
     
    public static Node head, tail;
    private String size;
      
    public Node insertNode(String data){
        
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    
        return head;
    }
    
    
    public void display1(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        System.out.println();
    }
    
    
    
    public boolean search(String target){
        Node current = head;
        
            while (current != null) {            
                if (current.data == target) {
                    return true;
                }
                current = current.next;
        }
        
        return false;
    }
    
    public String searchPosition(String target){
    Node current = head;
    String pos = "";
    
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
           //pos++;
        }
        return "";
    }
    

    private Node createNewNode(String index) {
        Node node = new Node(index);
        node.data = index;
        node.next = null;
        return node;
    }

    private void insertBeg(String index) {
        Node node = createNewNode(index);
          
        if (size == "") {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

        tail.next = head;
        //size++;
    }

    private void insertEnd(String index) {
        Node node = createNewNode(index);

        if (size == "") {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        tail.next = head;
       // size++;
    }
    
//    private void insertAtPosition(int index, int position) throws Exception {
//        
//        if (position < 0 || position > size) {
//            throw new Exception("Invalid position");
//        } else if (position == 0) {
//            insertBeg(index);
//        } else if (position == size) {
//            insertEnd(index);
//        } else {
//            Node node = createNewNode(index);
//            Node current = head;
//
//            for (int i = 0; i < position ; i++) {
//                current = current.next;
//            }
//
//            node.next = current.next;
//            current.next = node;
//            size++;
//        }
//    }
    
    
    
    

    private void display() throws Exception {
        if (size == " ") {
            throw new Exception("List is Empty");
        }

        Node current = head;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        

        System.out.println();
    }

    public static void main(String[] args) throws Exception {
      Aldaya_Exam2 List = new Aldaya_Exam2();
        Scanner scn = new Scanner(System.in);
         boolean num = true;
         
         System.out.println("Choose number");
         System.out.println("Number? 1 ");
         System.out.println("Number? 2 ");
         int choi = scn.nextInt();
         
         if (choi == 2){
             
             List.insertNode("fita");
             List.insertNode("Pride powder");
             List.insertNode("Canola oil");
             List.insertNode("Nescafe Black Coffe");
             List.insertNode("Ariel powder");
             List.insertNode("Rebisco");
             List.insertNode("Steelwool");
             List.insertNode("Head and Shoulders");
             List.insertNode("Nova");
             List.insertNode("Tanduay");
             List.insertNode("Bearbrand");
             List.insertNode("Natuta SpringWater8oz");
            List.insertNode("Coke 1ltr");
             List.insertNode("Sprite");
             List.insertNode("Royal 1ltr");
             List.insertNode("Sugar");
            
             
             
            List.display1();
            
             System.out.println("Enter New Product to insert");
             String search = scn.next();
             
             String targerVal = search;

                    String posi = List.searchPosition(targerVal);

                    if (posi != "") {
                        System.out.println(targerVal + "Here in " + posi);
                    } else {
                        System.out.println("The " + targerVal + " is not here");
                    }
             
        }else if (choi == 1){
            while (num){
                
                System.out.println("1. Insert Name");
                System.out.println("2. Display Name");
                System.out.println("3. search Name");
                int secondchoi = scn.nextInt();
                
                switch (secondchoi){
                    case 1:
                        System.out.println("Enter Name");
                        String element = scn.next();
                        System.out.println("Enter Position");
                        String position = scn.next();
                        
                        //List.insertAtPosition(element, position +" ");
                        break;
                    case 2:
                        List.display();
                        break;
                    case 3:
                       System.out.println("Enter the Name:");
                        String input = scn.next();
                        String targetVal = input;
                        String posi = List.searchPosition(targetVal);
                        if (posi != "") {
                            System.out.println("The " + targetVal + " is here at position " + posi);
                        } else {
                            System.out.println("The " + targetVal + " is not here");
                        }
                        break;
                }
            }
        }
    }
}

