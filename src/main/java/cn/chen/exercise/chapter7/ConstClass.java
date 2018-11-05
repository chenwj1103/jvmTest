package cn.chen.exercise.chapter7;

/**
 * //常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
 * @author Chen WeiJie
 * @date 2018-11-05 10:14:44
 **/
public class ConstClass {

    static {
        System.out.println("constClass init");
    }
    public static final String HELLO_WORLD = "hello world";
}
