package cn.chen.exercise.chapter3;

/**
 -verbose:gc
 -Xms20M
 -Xmx20M
 -Xmn10M
 -XX:PrintGCDetails
 -XX:SurvivorRatio=8
 -XX:MaxTenuringThreadshold=1
 -XX:+PrintTenuringDistribution
 */
public class LongExistsObjectDemo {

    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        //什么时候进入老年代取决于XX：MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
