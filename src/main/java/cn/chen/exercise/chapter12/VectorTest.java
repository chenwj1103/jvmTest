package cn.chen.exercise.chapter12;

import java.util.Vector;

/**
 * vector线程安全测试
 *
 * @author Chen WeiJie
 * @date 2018-11-01 10:27:18
 **/
public class VectorTest {

    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {


        while (true){
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            }).start();


            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println(vector.get(i));
                    }
                }
            }).start();
            while (Thread.activeCount()>50);
        }

    }


}
