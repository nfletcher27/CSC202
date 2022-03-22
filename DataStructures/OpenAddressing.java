import java.util.Optional;

public class OpenAddrHashTable<K, V> implements HashTable<K, V> {
    private final HashProvider<K> hashProvider;
    private Pair<K, V>[] array;
    int cap;
    public OpenAddrHashTable(int capacity, HashProvider<K> hashProvider) {
        array = new Pair[capacity];
        this.hashProvider = hashProvider;
        this.cap = capacity;
    }

    public void put(K key, V value) {
        int len = array.length;
        int hashValue = 0;
        int i = 0;


    }

    private int searchPosition(K key) {
        return 0;
    }

    public void remove(K key) {
        
    }

    public Optional<V> get(K key) {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("It's working");
        OpenAddrHashTable<Integer, String> hashTable = new OpenAddrHashTable<>(10, new RemainderHashing());
        System.out.println(hashTable.cap);
        hashTable.put(2, "wicked");
    }
}

// --------------------------------------------------
import java.util.Optional;

public class OpenAddrHashTable<K, V> implements HashTable<K, V> {
    private final HashProvider<K> hashProvider;
    private Pair<K, V>[] array;
    int cap;
    public OpenAddrHashTable(int capacity, HashProvider<K> hashProvider) {
        array = new Pair[capacity];
        this.hashProvider = hashProvider;
        this.cap = capacity;
    }

    public void put(K key, V value) {
        int hashValue = hashProvider.hashKey(key, array.length);
        array[hashValue]= new Pair<>(key, value);
    }

    private int searchPosition(K key) {
        s = array.length;
        int hashValue = hashProvider.hashKey(key, array.length);
        int i = 0;
        while(i < s && array[(hashValue+i) % s] != null && array[(hashValue+i) % s].key != key) {
            i += 1;
            keyValue = array[(hashValue+i) % s];
            if(keyValue != null && keyValue.key == key) {
                return keyValue.value;
            } else {
                return null;
            }  
        }
    }

    public void remove(K key) {
        int hashValue = hashProvider.hashKey(key, array.length);
        array[hashValue].removeIf(p -> p.getKey().equals(key));
    }

    public Optional<V> get(K key) {
        int hashValue = hashProvider.hashKey(key, array.length);
        return array[hashValue].stream()
                .filter(keyValue -> keyValue.getKey().equals(key))
                .findFirst()
                .map(Pair::getValue);
    }

    public static void main(String[] args) {
        System.out.println("It's working");
        OpenAddrHashTable<Integer, String> hashTable = new OpenAddrHashTable<>(10, new RemainderHashing());
        System.out.println(hashTable.cap);
        hashTable.put(2, "???");
    }
}
