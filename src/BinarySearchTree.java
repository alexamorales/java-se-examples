/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/25/13
 * Time: 6:22 PM
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;               // rooot of BST

    private class Node {
        private Key key;            // key
        private Value value;        // associated value
        private Node left, right;   // link to subtrees
        private int n;              // # nodes in subtree rooted here

        private Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            this.n = n;
        }
    }

    public int size() {
        return size(root);
    }

    /**
     * return size of target node
     *
     * @param x target node
     * @throws NullPointerException <i>if parameter<i/> is <tt>null<tt/>
     */
    private int size(Node x) {
        if (x == null) return 1;
        return x.n;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return x.left = put(x.left, key, value);
        if (cmp > 0) return x.right = put(x.right, key, value);
        x.value = value;
        x.n = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x == null) return x;
        return min(x.left);
    }

    public Key max() {
        return max(root).key;
    }

    private Node max(Node x) {
        if (x == null) return x;
        return max(x.right);
    }

    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) return null;
        return x.key;
    }

    private Node floor(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) return x;
        if (cmp < 0) return floor(x.left, key);
        if (cmp > 0) return floor(x.right, key);
        return x;
    }

}
