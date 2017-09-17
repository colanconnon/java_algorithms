package com.colanconnon.app.DataStructures;

import java.util.HashMap;
import java.util.Set;

public class LRUCache<Key, Value> {
    private int capacity;
    private Node<Key, Value> head;
    private Node<Key, Value> end;
    HashMap<Key, Node<Key, Value>> nodeMap = new HashMap<>();
    
    private class Node<Key, Value> {
        Key key;
        Value value;
        Node<Key, Value> next;
        Node<Key, Value> prev;

        public Node(Key key, Value value) {
            this.value = value;
            this.key = key;
        }
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public Set<Key> keys()
    {
        return this.nodeMap.keySet();
    }

    public Value get(Key key) {
        if (this.nodeMap.containsKey(key)) {
            Node<Key,Value> node = this.nodeMap.get(key);
            this.remove(node);
            this.setHead(node);
            return node.value;
        }
        return null;
    }

    private void remove(Node<Key, Value> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        else {
            // if the prev is null it must be the head, so the head to the next node
            this.head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        else {
            this.end = node.prev;
        }
    }

    private void setHead(Node<Key,Value> node) {
        node.next = this.head;
        node.prev = null;
        if (this.head != null) {
            this.head.prev = node;
        }
        this.head = node;

        if (this.end == null) {
            this.end = node;
        }
    }

    public void set(Key key, Value value) {
        if (this.nodeMap.containsKey(key)) {
            Node<Key, Value> node = this.nodeMap.get(key);
            node.value = value;
            this.remove(node);
            this.setHead(node);
        } else {
            Node<Key, Value> node = new Node<>(key, value);
            if (this.nodeMap.size() >= this.capacity) {
                this.nodeMap.remove(this.end.key);
                this.remove(this.end);
            }
            this.setHead(node);
            this.nodeMap.put(key, node);
        }
    }
}