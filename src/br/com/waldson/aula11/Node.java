package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getHeightLeft() {
        return getHeightLeft(this, 0);
    }

    public int getHeightLeft(Node node, int n) {
        if (node.left == null)
            return n;
        n++;
        return getHeightLeft(node.left, n);
    }

    public int getHeightRight() {
        return getHeightRight(this, 0);
    }

    public int getHeightRight(Node node, int n) {
        if (node.right == null)
            return n;
        n++;
        return getHeightRight(node.right, n);
    }

    public boolean ehBalanceada() {

        return ehBalanceada(this, true);
    }

    public boolean ehBalanceada(Node node, boolean bal) {

        int valorBal = node.getHeightRight() - node.getHeightLeft();

        boolean left = false, right = false;

        if (valorBal == -1 || valorBal == 0 || valorBal == 1) {
            if (node.getLeft() != null && bal == true)
                return ehBalanceada(node.getLeft(), true);

            if (node.getRight() != null && bal == true)
                return ehBalanceada(node.getRight(), true);

            if (node.getLeft() == null && bal == true)
                left = true;

            if (node.getRight() == null && bal == true)
                right = true;
        }

        return left && right;
}



    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public boolean isChildOf(Node parent) {

        if (parent.getLeft() == this || parent.getRight() == this)
            return true;

        return false;
    }

    void print(Node node, String prefix) {
        if(node == null) return;
        System.out.println(prefix + " |-- " + node.value);
        print(node.left , prefix + "   ");
        print(node.right , prefix + "   ");
    }
}
