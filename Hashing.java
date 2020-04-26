
public class Hashing {

    int tableSize = 150;
    public HashTable[] table;
    
    public Hashing()
    {
        table = new HashTable[150];
        for(int i = 0; i < tableSize; i++)
        {
            table[i] = null;
        }
    }

    public int HashFunc(String value)
    {
        int key = 0;
        char[] chars = value.toCharArray();
        for(int i = 0; i<2; i++){
            key += chars[i];
        }

        return key % tableSize;
    }

   public void insert (String value)
    {
        int hash = HashFunc(value);
        if(table[hash] == null)
        table[hash] = new HashTable(value);
    }

    public void remove (String value)
    {
        int hash = HashFunc(value);
        if(table[hash] != null)
        {
           table[hash] = null;
        }
    }

    public HashTable search(String value)
    {
        int hash = HashFunc(value);
        if(table[hash] == null)
        {
            System.out.println(value + " was not found");
            return null;
        }
        else{
            return table[hash];
        }

    }

}