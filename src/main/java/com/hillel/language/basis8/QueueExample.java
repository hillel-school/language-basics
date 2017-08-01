package com.hillel.language.basis8;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });

        //Queue<Integer> queue = new LinkedList<>();
        //Queue<Integer> queue = new ArrayDeque<>();


        // add
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.offer(4);

        System.out.println(queue);
        Integer first = queue.peek();
        System.out.println(first);
        System.out.println(queue);

        first = queue.poll();
        System.out.println(first);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }



}
