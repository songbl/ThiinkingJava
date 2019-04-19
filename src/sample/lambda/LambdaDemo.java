package sample.lambda;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LambdaDemo {

    public static void main(String[] args) {

        //匿名内部类的实现
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("似乎只有这个run方法是核心");
            }
        }).start();

        //Lambda表达式的实现
        new Thread(()-> {
            System.out.println("似乎只有这个run方法是核心");
            System.out.println("似乎只有这个run方法是核心");
            System.out.println("似乎只有这个run方法是核心");
        }).start();

        new Thread(()-> {
            System.out.println("似乎只有这个run方法是核心");
            System.out.println("似乎只有这个run方法是核心");
            System.out.println("似乎只有这个run方法是核心");
        }).start();
    }
}
