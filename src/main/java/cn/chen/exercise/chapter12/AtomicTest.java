package cn.chen.exercise.chapter12;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic的原子自增运算
 *
 * @author Chen WeiJie
 * @date 2018-11-01 21:22:23
 **/
public class AtomicTest {

    public static AtomicInteger atomicInteger =new AtomicInteger(0);

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        atomicInteger.incrementAndGet();
                    }
                }
            }).start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(atomicInteger);

    }


}
