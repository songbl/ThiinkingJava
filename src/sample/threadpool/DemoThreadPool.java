package sample.threadpool;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadPool {
    public static void main(String args[]){
        ExecutorService executorService  = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
        executorService.submit(new RunnableImpl());
    }
}
