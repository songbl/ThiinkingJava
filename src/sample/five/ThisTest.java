package sample.five;

public class ThisTest {

    public static void main(String[] args) {
        Banana a = new Banana();
        Banana b = new Banana() ;
        a.peel("red");   //这个是Banana@524
        b.peel("blue");
//        如果只有一个peel方法，它如何知道被a还是b调用的呢-发送消息给对象，编译器做了一些幕后工作，它暗自吧“所操作对象的引用”作为一个参数传递给peel().会变成如下
//         Banana.peel(a,1);,这是内部的事情

    }



}
