/**
 * LRU cache
 *
 * August 2016 - jbisa <jay.bisa@gmail.com>
 */
package com.questions;

/**
 * QUESTION:
 *
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following
 * operations: get and set.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 */
public class LRUCache {
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        return -1;
    }

    public void set(int key, int value) {

    }

    public static void main(String[] args) {

    }

}
