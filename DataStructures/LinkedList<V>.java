// Our linked list node
public class LinkedListNode<V> {
  private V value;
  private LinkedListNode<V> next;
  public LinkedListNode(V value, LinkedListNode<V> next) {
    this.value = value;
    this.next = next;
  }
  
  public Optional<LinkedListNode<V>> getNext() {
    return Optional.ofNullable(next);
  }
}

// We use the optional classes to represent whether there is a link to the next node, the tail will always have an empty optional
// We use generics (<V>) to model the type of data we want to store, this way it can be used for any data type

public class LinkedList<V> {
  private LinkedListNode<V> head;
  public LinkeList() {
    head = null;
  }
}

// Initializing our linked list with our head pointing to nothing as it is empty

// Now we are adding methods to add to the front of our list and delete the front of our list
public void addFront(V item) {
  this.head = new LinkedListNode<V>(item, head);
}

public void deleteFront() {
  Optional<LinkedListNode<V>> firstNode = Optional.ofNullable(this.head);
  this.head = firstNode.flatMap(LinkedListNode::getNext).orElse(null);
  firstNode.ifPresent(n -> n.setNext(null));
}

public Optional<LinkedListNode<V>> find(V item) {
  Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
  while(node.filter(n -> n.getValue() != item).isPresent()) {
    node = node.flatMap(LinkedListNode::getNext);
  }
  return node;
}

public void addAfter(LinkedListNode<V> aNode, V item) {
  aNode.setNext(new LinkedListNode<>(item, aNode.getNext().orElse(null)));
}


