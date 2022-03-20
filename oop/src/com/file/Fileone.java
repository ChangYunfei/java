package com.file;

import javax.annotation.processing.Filer;
import java.io.*;

public class Fileone {
    public static void main(String[] args) throws IOException {
        File f=new File("e:\\aa.txt");
        File f1=new File("e:\\ac.txt");
        f.createNewFile();
        f1.createNewFile();

        StringBuffer ba=get(f1);

        System.out.println(ba);
     //   insert(f1,"123456789");
        add(f1,"1223");






    }




    /**
     * 获取文本文件的内容
     * @param f1
     * @return
     * @throws IOException
     */
    private static StringBuffer get(File f1)  {
        StringBuffer str = new StringBuffer();
        //try()自动关闭io流，java1.7以上
       try( BufferedReader in=new BufferedReader(new FileReader(f1))) {
           char[] chars = new char[1024];
           int re = in.read(chars);

           while (re != -1) {
               str.append(chars, 0, re);
               re = in.read(chars);
           }

       }catch (Exception e){
           e.printStackTrace();
       }

        return str;


    }


    /**
     * 覆盖文件
     * @param file
     * @param newString
     * @throws IOException
     */
    private static void insert(File file, StringBuffer newString) {
        try(BufferedWriter bu=new BufferedWriter(new FileWriter(file));){
        bu.write(newString.toString());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    private static void insert(File file, String newString)  {
      try(  BufferedWriter bu=new BufferedWriter(new FileWriter(file));){

              bu.write(newString.toString());

          // bu.close();
      }catch (IOException e){
          e.printStackTrace();
      }

    }

    /**
     * new FileWriter(f)   相当于对原文件进行覆盖操作。
     * new FileWriter(f,false)  相当于对源文件进行覆盖操作。不是追加。
     *  new FileWriter(f,true)   对原来的文件进行追加，而不是覆盖。
     *
     *  追加字符串---------
     * @param file
     * @param newString
     * @throws IOException
     */
    private static void add(File file, StringBuffer newString)  {
       try( BufferedWriter bu=new BufferedWriter(new FileWriter(file,true))){
        bu.write(newString.toString());
       }catch(IOException e){
           e.printStackTrace();
        }
        }

        /*
        //append源码
        public Writer append(CharSequence csq) throws IOException {
        if (csq == null)
            write("null");
        else
            write(csq.toString());
        return this;

         }*/
       // bu.append(newString.toString());


    private static void add(File file, String newString)  {
       try( BufferedWriter bu=new BufferedWriter(new FileWriter(file,true));) {
           bu.write(newString.toString());

       }catch (Exception e){
           e.printStackTrace();
       }

    }
    private static void main2() throws IOException {
        File f=new File("e:\\aa.txt");
        File f1=new File("e:\\ac.txt");
        System.out.println(f.createNewFile());
        System.out.println(f1.createNewFile());
//        FileReader f=new FileSReader(f);
        //  FileInputStream fi=new FileInputStream(f);
        FileReader fi=new FileReader(f);
        BufferedReader fi2=new BufferedReader(fi);

        //   int read = fi2.read(ch);



        //-1-while-
        if (false) {
            char[] ch= new char[100];
            int re=fi2.read(ch);
            while(re!=-1){
                System.out.println(new String(ch,0,re));
                re=fi2.read(ch);
            }
        }

        //-2-for-
        StringBuffer ba=new StringBuffer();
        if (true) {
            char[] ch1= new char[100];
            for(int re1 = fi2.read(ch1); re1!=-1; re1 = fi2.read(ch1)){
                //String  a=new String(ch1,0,re1);
                ba.append(new String(ch1,0,re1));
                System.out.println(ba);
                System.out.println(ba.length());

            }
        }


//        StringBuffer aaa=new StringBuffer("aaa");
//        StringBuffer ddd = aaa.append("ddd");//StringBuffer的append方法返回值和自身一样
//        System.out.println(aaa);//aaaddd
//        System.out.println(ddd);//aaaddd





    }

}

