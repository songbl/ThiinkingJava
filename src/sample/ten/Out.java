package sample.ten;

public class Out {
    void function(){
        System.out.println("外部类的方法");
    }
    static void function2(){
        System.out.println("静态的外部类的方法");
    }
    public class Inner {
        public Out getOutObject(){
            return Out.this;


        }
    }
    public Inner getInnerOnj(){
        return  new Inner();
    }

    public static class StaticInner{
        public void  staticFunction(){
            System.out.println("静态内部类的方法");
        }
    }
    public static void main(String[] args) {
        Out out = new Out() ;
        Out.Inner inner = out.getInnerOnj();
        inner.getOutObject().function();       //通过内部类对象调用外部类对象的方法

        Out.Inner inner1 = out.new Inner();    //生成内部类对象
        inner1.getOutObject().function();

        Out.StaticInner staticInner = new Out.StaticInner();
        staticInner.staticFunction();

        StaticInner staticInner1 = new StaticInner() ;
        staticInner1.staticFunction();


    }
}
