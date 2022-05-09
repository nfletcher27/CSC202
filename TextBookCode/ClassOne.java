import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

import java.util.HashMap;
import java.util.LinkedList;

public class ClassOne {
    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addLast(10);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(22, 5);

        BinaryTree tree = new BinaryTree() {
            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }

            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }
        } ;
    }
}

package dsa;

public class BigO {
    public static class Main {

        public void log(int[] numbers) {
            // Constant time complexity O(1)
            System.out.println(numbers[0]);
        }

        public void log2(int[] numbers) {
            // O(n) time complexity, linear time complexity
            for (int j : numbers) System.out.println(j);
            // Other example
            for(int number : numbers)
                System.out.println(number);
        }

        public void log3(int[] numbers) {
            // quadratic O(n^2), the larger the input the larger our scale of increase
            for(int i : numbers) {
                for(int j : numbers)
                    System.out.println(numbers[j]);
            }
        }





    }
    public static class LinkedList {
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

    }
}
