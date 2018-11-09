package cn.chen.exercise.chapter5;

/**
 *
 * 使用jstack精确找到异常代码的 demo
 * @author :  chen weijie
 * @Date: 2018-11-09 9:24 AM
 */
public class TestThread {


    public static void main(String[] args) {

        Thread thread = new Thread(new Worker());
        thread.start();
    }

    static class Worker implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Name:" + Thread.currentThread().getName());
            }
        }
    }


}
