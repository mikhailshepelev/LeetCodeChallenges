package easy;

import java.util.LinkedList;

@SuppressWarnings("unchecked")
public class _705_Design_HashSet {
    static class MyHashSet {

        private final LinkedList<Integer>[] hashSet;

        public MyHashSet() {
            hashSet = new LinkedList[10000];
        }

        public void add(int key) {
            int index = hashFunction(key);
            if (hashSet[index] == null) {
                hashSet[index] = new LinkedList<>();
                hashSet[index].add(key);
            } else {
                if (!hashSet[index].contains(key)) {
                    hashSet[index].add(key);
                }
            }
        }

        public void remove(int key) {
            int index = hashFunction(key);
            if (hashSet[index] != null && hashSet[index].contains(key)) {
                hashSet[index].removeFirstOccurrence(key);
            }
        }

        public boolean contains(int key) {
            int index = hashFunction(key);
            if (hashSet[index] != null) {
                return hashSet[index].contains(key);
            }
            return false;
        }

        private int hashFunction(int key) {
            return key % 10;
        }
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)
    }
}
