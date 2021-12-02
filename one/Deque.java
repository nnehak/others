package com.neha.gs.one;

public class Deque {

    static class DequeImpl{
        private Node first;
        private Node last;
        private int size;

        //Implement a double ended queue to add strings
        //Deque id data structure that has charasteristics of both stack and queue
        //Elements can be added or removed from either the front or back

        public int size(){
            return size;
        }

        public void addFirst(String str){

        }

        public void addLast(String str){

        }

        public String removeFirst(){
            return null;
        }
        public String removeLast(){
            return null;
        }

        public String peekFirst(){
            return null;
        }

        public String peekLast(){
            return null;
        }

        private static class Node{
            final String data;
            Node next;
            Node pre;

            Node(String data){
                this.data = data;
            }
        }
    }


    public static void main(String args[]){
        final DequeImpl deque = new DequeImpl();

        deque.addLast("a");
        deque.addLast("b");

        System.out.println(deque.size() == 2);
        System.out.println("a".equals(deque.peekFirst()));
        System.out.println("b".equals(deque.peekLast()));

        //dequeue
        System.out.println("a".equals(deque.removeFirst()));
        System.out.println("b".equals(deque.removeLast()));
        System.out.println(deque.size() == 0);

        //push
        deque.addFirst("a");
        deque.addFirst("b");

        //pop
        //b.equals(deque.removeFirst())
        //a.equals(deque.removeFirst())
    }
}
