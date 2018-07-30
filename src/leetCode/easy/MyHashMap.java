package leetCode.easy;
/*
All keys and values will be in the range of [0, 1000000].
The number of operations will be in the range of [1, 10000].
Please do not use the built-in HashMap library.
*/
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
public class MyHashMap {
    private int lowerBound = 0;
    private int upperBound = 1000000;
    private double factcor = 0.75;
    private int entrySize;
    private Entry entries[];

    class Entry {
       int value;
       int key;
       Entry next;
       public Entry(int key, int value) {
           this.key = key;
           this.value = value;
       }
    }

    /** Initialize your data structure here. */
    public MyHashMap() {
        entries = new Entry[16];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        if (key < lowerBound || value < lowerBound) return;
        if (key > upperBound || value > upperBound) return;
        int slot = key % entries.length;

        if (entries[slot] == null) {
            entries[slot] = new Entry(key, value);
        } else if (entries[slot].key == key) { //첫번째 item인 경우
            entries[slot].value = value;
        } else { //첫번째 이후 item인 경우.
            Entry cur = entries[slot];
            //move position.
            while (cur.next != null && cur.next.key != key)
                cur = cur.next;

            if (cur.next != null) {
                cur.next.value = value;
            } else {
                cur.next = new Entry(key, value);
            }
        }
        entrySize++;
        if ( (entrySize * 1.0)/entries.length > factcor) {
           remakeEntries(); 
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (key < lowerBound || key > upperBound) return -1;

        int slot = key%entries.length;
        if (entries[slot] == null) {
            return -1;
        } else if (entries[slot].key == key) { //첫번째 item인 경우
            return entries[slot].value;
        } else { //첫번째 이후 item인 경우.
            Entry cur = entries[slot].next;
            while(cur != null) {
                if (cur.key == key) {
                    return cur.value;
                }
                cur = cur.next;
            }
        }

        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (key < lowerBound || key > upperBound) return;
        int slot = key%entries.length;

        if (entries[slot] == null) {
            return;
        } else if (entries[slot].key == key) { //첫번째 item인 경우
            entries[slot] = entries[slot].next;
        } else { //첫번째 이후 item인 경우.
            Entry cur = entries[slot];
            while (cur.next != null && cur.next.key != key)
                cur = cur.next;

            if (cur.next != null) {
                cur.next = cur.next.next;
            }
        }
    }

    private void remakeEntries() {
        Entry [] oldEntries = entries;
        entries = new Entry[entries.length*2];

        for (int i = 0; i < oldEntries.length; i++) {
            Entry cur = oldEntries[i];
            while (cur != null) {
              put(cur.key, cur.value);
              cur = cur.next;
            }
        }

    }
}
