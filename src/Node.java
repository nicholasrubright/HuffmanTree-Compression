public class Node {

    // Huffman Tree Node
    private double weight;
    private char symbol;
    private Node left;
    private Node right;

    public Node(double weight, char symbol, Node left, Node right) {
        this.weight = weight;
        this.symbol = symbol;
        this.left = left;
        this.right = right;
    }

    public double getWeight() {
        return weight;
    }

    public char getSymbol() {
        return symbol;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
