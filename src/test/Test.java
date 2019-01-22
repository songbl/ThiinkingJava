package test;

/**
 * 类加载过程
 */
class SingleTon {
//    public static int count1;
//    public static int count2 = 0;

    private static SingleTon singleTon = new SingleTon();
 //   public   SingleTon singleTon2 = new SingleTon();

    public static int count1;
    public static int count2 = 0;


     static {
         System.out.println("静态代码块执行了" );
    }
    {
        System.out.println("构造代码块执行了" );
    }
    public SingleTon() {
        System.out.println("构造方法执行了" );
        count1++;
        count2++;
    }

//    public  SingleTon getInstance2() {
//        return singleTon2;
//    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
public class Test {
    public static void main(String[] args) {
     SingleTon singleTon = SingleTon.getInstance();
 //       SingleTon singleTon2 = new SingleTon().singleTon2;
//        System.out.println("count1=" + singleTon2.count1);
//        System.out.println("count1=" + singleTon2.count2);
        System.out.println("count1=" + singleTon.count1);
        System.out.println("count2=" + singleTon.count2);
    }
}
