package com.file.serializable;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Mimi implements Serializable {
    private static final long serialVersionUID = 4078015553774163729L;
    private  HashMap<String,String> myMimi=new HashMap<String,String>();
    private  File  f=new File("a.txt");


    public static void main(String[] args) throws IOException {

        Mimi my=new Mimi();
        System.out.println("创建文件："+my.f.createNewFile());
        Scanner sin=new Scanner(System.in);

        while(sin.hasNext()) {
            System.out.println("exit / 1(保存) / 2(提取) /3(保存并退出） ");
            String in1 = sin.nextLine();
            in1=in1.trim();


            if(in1.equals("exit")){

                break;
             }
            if(in1.equals("3")){
                my.baoCun(my);
                break;
             }
            if(in1.equals("1")){
                my.baoCun(my);
             }
            if(in1.equals("2")){
                my=my.tiQu();
             }

            if((in1.indexOf(" ")==-1)){
                System.out.println(my.myMimi.get(in1));
            }else{
                String[] ss = in1.split(" ");
                my.myMimi.put(ss[0],ss[1]);

            }







        }

       // my.baoCun(my);
      //  my.tiQu();


       // add("key","value");
        //show();


    }

    public Mimi tiQu() {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));){
            Mimi o = (Mimi)in.readObject();
            return o;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void baoCun(Mimi my)  {
      try(  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));){
            out.writeObject(my);
        } catch (IOException e) {
          e.printStackTrace();
      }

    }

    public void add(String key, String value) {
        myMimi.put(key,value);
    }

    public void show() {
        Set<String> keys = myMimi.keySet();
        for (String key:keys) {
            System.out.println(key+" "+myMimi.get(key));
        }
    }

    public HashMap<String, String> getMyMimi() {
        return myMimi;
    }

    public void setMyMimi(HashMap<String, String> myMimi) {
        this.myMimi = myMimi;
    }
}
