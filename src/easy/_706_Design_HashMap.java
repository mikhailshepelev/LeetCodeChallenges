package easy;

import java.util.LinkedList;
import java.util.Objects;

public class _706_Design_HashMap {

    private final LinkedList<Pair>[] hashMap;

    public _706_Design_HashMap() {
        hashMap = new LinkedList[1000000];
    }

    public void put(int key, int value) {
        int index = hashFunction(key);
        if (hashMap[index] == null) {
            hashMap[index] = new LinkedList<>();
        } else {
            for (Pair pair : hashMap[index]) {
                if (pair.key == key) {
                    pair.setValue(value);
                    break;
                }
            }
        }
        hashMap[index].add(new Pair(key, value));
    }

    public int get(int key) {
        int index = hashFunction(key);
        if (hashMap[index] != null) {
            for (Pair pair : hashMap[index]) {
                if (pair.key == key) {
                    return pair.getValue();
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hashFunction(key);
        if (hashMap[index] != null) {
            hashMap[index].removeIf(pair -> pair.key == key);
        }
    }

    private int hashFunction(int key) {
        return key % 10;
    }

    private static class Pair {
        private final int key;
        private int value;

        private Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        private int getValue() {
            return value;
        }

        private void setValue(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return key == pair.key && value == pair.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }
}
