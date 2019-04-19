package sample.lambda;

public class LambdaMyInterface {

    public static void main(String[] args) {
        //传统方式
        invlckCook(new Cook() {
            @Override
            public void makeCook() {
                System.out.println("makeCooke 被调用");
            }
        });
        //Lambda,简化匿名内部类方法
        invlckCook(()->{

            System.out.println("makeCooke 被调用");
        });
//---------------------------------------------------------------------------
        //匿名内部类实现
        invlckCal(10, 20, new Calculator() {
            @Override
            public int Calculator(int a, int b) {
                return a+b;
            }
        });

        //Lambada，实现带参数带返回值
        invlckCal(10,20,(int a,int b)->{
            return a+b;
        });

        //优化
        invlckCal(10,20,( a, b)->
             a+b
        );
    }
    public static void invlckCook(Cook cook){
        cook.makeCook();
    }

    public static void invlckCal(int a,int b,Calculator calculator){
       int sum =  calculator.Calculator(a, b);
        System.out.println("计算方法 被调用"+sum);
    }
}
