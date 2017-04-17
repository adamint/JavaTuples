package tuples;

import java.io.Serializable;

public class Pair<K, V> implements Serializable {
    private K left;
    private V right;

    public Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }
    public K getLeft() {
        return left;
    }
    public void setLeft(K left) {
        this.left = left;
    }
    public V getRight() {
        return right;
    }
    public void setRight(V right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pair) {
            Pair p = (Pair) o;
            if (p.getLeft().equals(left) && p.getRight().equals(right)) return true;
            else return false;
        }
        else return false;
    }
}