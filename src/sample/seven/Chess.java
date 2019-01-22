package sample.seven;

public class Chess extends  BroadGame {

    Chess(){
        super(1);//显示的调用，否则调用默认的()
        System.out.println("chesss===");
    }

    public static void main(String[] args) {
        Chess chess = new Chess() ;
    }

}
