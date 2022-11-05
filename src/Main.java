import hash.MyHashTable;
import hash.MyHashTableWithSeperateChaining;
import linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        linkedList.add("first");
//        linkedList.add("second");
//        linkedList.add("third");
//        linkedList.add("fourth");
//        linkedList.print();
//
//        linkedList.add("insert", 4);
//        linkedList.print();
//
//        linkedList.remove();
//        linkedList.print();
//
//        linkedList.remove(2);
//        linkedList.print();

        MyHashTable hashTable = new MyHashTable(10);
        hashTable.put("a", "a");
        hashTable.put("b", "b");

        System.out.println(hashTable.get("a"));
        System.out.println(hashTable.get("b"));

        hashTable.put("abc", "abc");
        System.out.println(hashTable.get("abc"));

        MyHashTableWithSeperateChaining myHashTableWithSeperateChaining = new MyHashTableWithSeperateChaining(10);
        myHashTableWithSeperateChaining.put("a", "a");
        myHashTableWithSeperateChaining.put("b", "b");

        System.out.println(myHashTableWithSeperateChaining.get("a"));
        System.out.println(myHashTableWithSeperateChaining.get("b"));

        myHashTableWithSeperateChaining.put("abc", "abc");
        System.out.println(myHashTableWithSeperateChaining.get("abc"));
    }
}
