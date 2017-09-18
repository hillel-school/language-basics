package com.hillel.language.basis23.readwrite;

public class ReadWriteLockMain {

    public static void main(String[] args) {
        ReadWriteLockExample example = new ReadWriteLockExample();

        for (int i = 0; i < 5; i++) {
            final int count = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 20; j++) {
                        if((j + count) % 3 == 0){
                            example.put("key" + count , count);
                        } else {
                            example.get("key" + (count - 1));
                        }
                    }
                }
            }).start();
        }
    }
}
