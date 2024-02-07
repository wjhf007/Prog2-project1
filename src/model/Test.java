package model;

public class Test{

    public void showNumbers(){
        for(int i = 0; i <= 1000; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.showNumbers();
    }
}