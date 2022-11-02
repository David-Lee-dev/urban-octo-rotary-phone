package hash;

import java.util.LinkedList;

public class MyHashTable {

    LinkedList<Node>[] table;

    public MyHashTable(int size) {
        this.table = new LinkedList[size];
    }

    public void put(String key, String value) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        if (table[index] == null) {
            table[index] = new LinkedList<Node>();
            table[index].add(new Node(key, value));
        } else {
            Node searched = searchNode(index, key);

            if (searched != null) {
                searched.value = value;
            }
//            else {
//                table[index].add(new Node(key, value));
//            }
        }
    }

    public String get(String key) {
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);

        Node searched = searchNode(index, key);

        if(searched == null) {
            return "no data";
        } else {
            return searched.value;
        }
    }

    public Node searchNode(int index, String key) {
        LinkedList<Node> indexList = table[index];

        for (Node node : indexList) {
            if (node.key == key){ return node;}
        }

        return null;
    }

    private int getHashCode(String key) {
        int hashcode = 0;

        return hashcode + (int) key.charAt(0);
    }

    private int convertToIndex(int hashCode) {
        return hashCode % 2;
    }


    private static class Node {
        private String key;
        private String value;

        private Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
