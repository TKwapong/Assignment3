
public class Main {

    public static void main(String[] args) {

        // Creates an empty instance of a Hashtable
        Hashing hashing = new Hashing();

        hashing.insert("Theo");
        hashing.insert("Hash");
        hashing.insert("DevInVogue");

        HashTable hashTable = hashing.search("Hash");

        System.out.println("This is " + hashTable.hash);

    }

}