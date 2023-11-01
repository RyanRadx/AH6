import java.util.List;
import javax.swing.JOptionPane;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static String linkedListValues(Node<String> head) {
    StringBuilder out = new StringBuilder();
    //out = out.append(head.val);

    // System.println(out.toString());
    // String ex = head.val;

    // System.println(ex);

    while (head.next != null){
      out.append(head.val);
      head = head.next;
    }
    out.append (head.val);
    String output = out.toString();
    return output;
  }

  public static void main(String [] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d
    // Solution.linkedListValues(a);
    JOptionPane.showMessageDialog(null, Solution.linkedListValues(a));
    // -> [ "a", "b", "c", "d" ]
  }
}
