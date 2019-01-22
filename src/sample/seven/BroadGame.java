package sample.seven;

public class BroadGame extends  Game {
//    BroadGame(){//如果注释了，子类不调用带参数的构造方法，会找不到父类的构造器。
//        System.out.println("BroadGame===");
//    }

    BroadGame(int i){
        System.out.println("BroadGame==="+i);
    }
}

