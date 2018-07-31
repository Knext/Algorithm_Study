package leetCode.easy;

//HashSet은 value가 모두 같은 hashmap이다.

public class MyHashSet {

    private double mFactor = 0.75;
    private Entry [] entries;
    private int mEntrySize = 0;

    class Entry {
        private int key;
        Entry next;
        public Entry(int key) {
            this.key = key;
        }
    }

    /** Initialize your data structure here. */
    public MyHashSet() {
        entries = new Entry[8];
    }

    public void add(int key) {
        int slot = key % entries.length;
        if (entries[slot] == null) { //slot이 비어있다.
            entries[slot] = new Entry(key);
        } else if (entries[slot].key == key) { //이미 같은 key가 들어 있다.
            return;
        } else { //다음 리스트 아이템으로 추가.
            Entry cur = entries[slot];
            while(cur.next != null && cur.next.key != key)
                cur = cur.next;

            if (cur.next == null) {
                cur.next = new Entry(key);
            }
        }

        mEntrySize++;
        //TODO: re-making entries
        if ( (mEntrySize*0.1)/entries.length > mFactor) {
            remakeEntries();
        }
    }

    public void remove(int key) {
        int slot = key % entries.length;
        Entry cur = entries[slot];
        if (cur == null) {
            return ;
        } else if (cur.key == key) {
            entries[slot] = cur.next;
        } else {
            while (cur.next != null && cur.next.key != key)
                cur = cur.next;

            if (cur.next.key == key) {
                cur.next = cur.next.next;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int slot = key % entries.length;
        Entry cur = entries[slot];
        if (cur == null) {
            return false;
        } else if (cur.key == key) {
            return true;
        } else {
           while (cur != null) {
               if (cur.key == key)
                   return true;

               cur = cur.next;
           }
        }

        return false;
    }

    private void remakeEntries() {
        Entry[] oldEntries = entries;
        entries = new Entry[entries.length*2];

        for (int i = 0; i < oldEntries.length; i++) {
            Entry cur = oldEntries[i];
            while (cur != null) {
                add(cur.key);
                cur = cur.next;
            }
        }
    }
}
