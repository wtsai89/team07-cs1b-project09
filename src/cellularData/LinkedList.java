package cellularData;

import java.util.Iterator;
//I was able to get it to work however nothing is being passed into the methods.
public class LinkedList<T> implements Iterable {


    cellularData.Node T;
    int length;
    int size;
    int i;

    /**
     * Creates the node for the list
     */
    public LinkedList() {
        T = new cellularData.Node();
        this.size = 0;
    }

    /**
     * Is supposed to determine if the node is empty.
     * @return
     */
    public boolean isEmpty() {
        // If head is not pointing to any nodes, then our list is empty.
        if (T.head == null)    // alternatively, check this.length == 0;
            return true;

        // Otherwise, there are one or more nodes in the list.
        return false;
    }


    /**
     * This replaces a chosen index with the name of a country.
     *
     * @param index
     * @param country
     */
    public void replaceAtIndex(int index, Country country) {
        cellularData.Node temp = T.head;
        if (index < 0) {
            return;
        }
        while (--index >= -1 && temp != null) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        if (temp != null) {
            temp.country = country;
        }
    }

    /**
     * Adds in a country using the object of Country.
     * @param T
     */
    public void add(Country T) {
        if (this.T.head == null) {
            this.T.head = new cellularData.Node(T);
        } else {
            cellularData.Node temp = this.T.head;
            while (temp.getNext() != null) {
                temp.setNext(temp.getNext());
                temp = temp.getNext();
            }
            temp.setNext(new cellularData.Node(T));
        }
        this.i += 1;
    }

    /**
     * Supposed to convert the  node to string.
     * @return
     */
    public String toString() {
        cellularData.Node temp = this.T.head;
        System.out.println(temp.getCountry());
        while (temp.getNext() != null) {
            System.out.println(temp.getCountry());
            temp = temp.getNext();
        }
        return this.T.head.toString();
    }

    /**
     * Supposed to contain the list
     * @param T
     * @return
     */
    public Country contains(Country T) {
        cellularData.Node temp = this.T.head;
        while (temp != null && temp.getNext() != null) {
            if (temp.getCountry().getName().equals(T.getName())) {
                return T;
            } else {
                temp = temp.getNext();
            }
        }
        return null;

    }

    /**
     * Gets how many nodes the user wants as input.
     * @param index
     * @return
     */
    public Country getIndex(int index) {
        if (index < 1) {
            throw new IndexOutOfBoundsException();
        } else {
            cellularData.Node temp = this.T.head;
            while (temp != null && (--index) >= 0) {
                if (index == 0) {
                    return temp.getCountry();
                }
                temp = temp.getNext();
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * takes in the size of the node
     * @return
     */
    public int size() {
        return size;
    }

    @Override
    /**
     * This is from the class iterator. Its supposed to determine if there is an object next.
     */
    public Iterator iterator() {
        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
        return it;
    }

    /**
     * Supposed to get the next line in the node.
     * @return
     */
    public cellularData.Node next() {
        return T.next;
    }

    public class ListIterator<T> {
        T current;
        ListIterator t;

        /**
         * The constructor iterator for the ListIterator class.
         */
        public ListIterator() {
            t = new ListIterator();
        }

    }

}
