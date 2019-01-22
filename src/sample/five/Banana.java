package sample.five;

public class Banana {
    String color ;
    int j ;
    Banana(){
        j=7; //先被置为0，然后变成7
    }

    public void peel(String color){
        System.out.println("剥皮被调用了..."+color);
        this.color = color;//当a调用的时候，this是Banana@524|this就代表调用该方法当前对象的引用
    }

//    void f(){
//        int i;
//        i++;
//
//    }

}
