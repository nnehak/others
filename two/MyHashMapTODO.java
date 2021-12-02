package com.neha.gs.two;

public class MyHashMapTODO {

    /**
     * Associates a key value pair in memory such that insert is O(1)
     * scales liniarly for large data
     * each unique key is associated with one single value
     *
     * ArrayList<List<Entry<K,V>>>
     */

    private static class HashMap<K,V>{

        private static class Entry<K,V>{
            private final K key;
            private  V value;
            Entry(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

    }

}
