package cellularData;

public class Node<T> {




    Country country;
    Node next;
    T data;
    Node head;
    int count;

    Node() {

    }

    /**
     * Uses the iterator to pass in x as any type.
     * @param x
     */
    public Node(T x) {
        this.data = x;
        this.next = null;
    }

    /**
     * Gets the data and an object from Node.
     * @param data
     * @param n
     */
    public Node(T data, Node n) {
        this.data = data;
        this.next = n;
    }
    /*8
    Constructor that passes in country in the object Country.
     */
    public Node(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }


    public Node getHead() {
        return head;
    }

    public int getCount() {
        return count;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {

        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    /**
     * @param country Uses the countries name to see where the node is supposed to go next.
     * @return Return the name passed into the country
     */
    public String nextCountry(String country) {
        return country;
    }

    /**
     * The method for the name we're supposed to get.
     * @return Supposed to get the next name in the file.
     */

    /**
     * Supposed to be a method for all attributes.
     */
    public int size() {
        int size = count;
        return this.count;

    }

    public String toString(int count) {
        String numberString = Integer.toString(count);
        return numberString;
    }


    /**
     * The String representation of Data
     *
     * @return
     */
    @Override
    public String toString() {
        return "Node{" +
                "country=" + country +
                ", next=" + next +
                ", data=" + data +
                ", head=" + head +
                ", count=" + count +
                '}';
    }
    /*public String toString() {

        return this.toString();
    }*/
}
