package com.yichang;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 异常学习
 */
public class YiChang {
    public static void main(String[] args) {
    //a1();
   // y3();
        try {
            System.out.println(y4());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void a1() {
        try {
            y1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        y2();
    }


    private static void y1() {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b= 0;
        try {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e) {

           // e.printStackTrace();
            System.out.println("输入有误");
        }catch (ArithmeticException e){
         //e.printStackTrace();
            System.out.println("除数不能为零");
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用！");
        }

    }
    private static void y2() throws ArithmeticException{
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b= 0;
        try {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a/b);
        } catch (InputMismatchException e) {

           // e.printStackTrace();
            System.out.println("输入有误");
        }catch (ArithmeticException e){
         //e.printStackTrace();
            System.out.println("除数不能为零");
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用！");
        }

    }

    /**
     * 测试return 和 finally 那个先执行
     * finally会先于return执行，return之前先执行finally的内容
     * finally中如果有return 就返回finally中的return值
     * @throws ArithmeticException
     * @return
     */
 private static int y3() throws ArithmeticException{
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b= 0;

        try {
            a = in.nextInt();
            b = in.nextInt();

            if(a>b)return 6;
            System.out.println(a/b);

        } catch (InputMismatchException e) {

           // e.printStackTrace();
            System.out.println("输入有误");
        }catch (ArithmeticException e){
         //e.printStackTrace();
            System.out.println("除数不能为零");
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用！");
        }

     return a;
 }

    /**
     *
     * System.exit(0) 优于一切
     * finally中如果有return 就执行finally中的
     * @throws ArithmeticException
     * @return
     */
    private static int y4() throws Exception{
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b= 0;

        try {
            a = in.nextInt();
            b = in.nextInt();
           // System.exit(0);

            if(a>b)return 6;
            System.exit(0);
            System.out.println(a/b);

        } catch (InputMismatchException e) {

           // e.printStackTrace();
            System.out.println("输入有误");
        }catch (ArithmeticException e){
         //e.printStackTrace();
            System.out.println("除数不能为零");
            throw e;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用！");
            return 9999;

        }


    }

}
