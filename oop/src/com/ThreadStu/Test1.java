package com.ThreadStu;

import java.io.IOException;
import java.nio.CharBuffer;

public class Test1 {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(1);
        });
    }
}
