package com.yichang;

public class Test {
    public static void main(String[] args) {

        if(8>4){
            throw new MyException2();
        }
        if (1>0){

            try {
                throw new MyException3();
            } catch (MyException3 myException3) {
                myException3.printStackTrace();
            }
        }

    }
}
class MyException2 extends RuntimeException{
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
class MyException3 extends Exception{
    public MyException3() {
    }

    public MyException3(String message) {
        super(message);
    }
}
