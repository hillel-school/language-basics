package com.hillel.language.basis23.collections;

import java.util.Map;

class MyRunnable implements Runnable {

    Map<String, Integer> resource;
    String sourceString;

    public MyRunnable(Map<String, Integer> resource, String sourceString) {
        this.resource = resource;
        this.sourceString = sourceString;
    }

    @Override
    public void run() {
        String[] strings = sourceString.split(" ");
        for(String s : strings) {
            String lower = s.toLowerCase();
            if(this.resource.containsKey(lower)) {
                int count = this.resource.get(lower);
                this.resource.put(s, ++count);
            }
            else {
                this.resource.put(lower, 1);
            }
        }
    }
}
