package cn.chen.exercise.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用jConsole监控OOM
 *
 * @author Chen WeiJie
 * @date 2018-10-29 10:13:28
 **/
public class JconsoleOOMDemo {

    static class OOMObject {

        public byte[] placeHolder = new byte[60 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }


}
