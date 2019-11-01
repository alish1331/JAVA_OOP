package singlyLinkedList;

public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        this.head = null;
    }
    
    //Goes until the last node and adds a new node of the value given
    // If there is no head, it creates a new node with the value given and
    // makes it the head:
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    
    // Goes until the penultimate (the one before the last) node and then changes its .next
    // property to null, getting rid of the final node:
    public void remove(){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next.next != null){
                pointer = pointer.next;
            }
            pointer.next = null;
        }
    }
    
    //Prints all the values of each node in the list in order:
    public void printValues() {
    	if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                System.out.println(pointer.value);
                pointer = pointer.next;
            }
        }
    }
    
    // Finds the first node in the list with the given value and returns it
    // Otherwise it just returns the head:
    public Node find(int value){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                if(pointer.value == value){
                    return pointer;
                }
                pointer = pointer.next;
            }
        }
        return this.head;
    }
      
    // Removes the node at the given index (0 is the first, 1 is the second...):
    public void removeAt(int index){
        if(this.head != null){
            int count = 0;
            Node pointer = this.head;
            Node temp = null;
            while(pointer.next != null){
                if(count == index){
                    temp.next = temp.next.next;
                    break;
                }
                temp = pointer;
                pointer = pointer.next;
                count++;
            }
        }
    }
}
   