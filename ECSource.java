class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it

    Node<T> temp = head;

    T ans = null;

    int counter = 1;

    while(temp!= null){

      if(counter == index){
        return temp.val;
      }
      temp = temp.next;
      counter++;
    }

    return null;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));
  }
}