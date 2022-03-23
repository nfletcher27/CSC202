import java.util.Optional;

public class BinaryTreeSuccessor<K,V> extends SimpleBinaryTree<K,V> {
    public Optional<K> inOrderSuccessorKey(K key) {
        Optional<BinaryTreeNode<K, V>> node = Optional.ofNullable(root);
        Optional<K> succesor = Optional.empty();
        while(node.isPresent() && !node.get().getKey().equals(key)) {
            if(((Comparable) node.get().getKey()).compareTo(key) > 0) {
                succesor = node.map(BinaryTreeNode::getKey);
                node = node.flatMap(BinaryTreeNode::getLeft);
            } else {
                node = node.flatMap(BinaryTreeNode::getRight);
            }
        }
        return node.flatMap(BinaryTreeNode::getRight).map(this::minKey)
            .map(Optional::of).orElse(succesor);
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
