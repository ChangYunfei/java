package com.chang;

import java.util.Arrays;

public class JseStudent {
    public static void main(String[] args) {
        array();//数组学习



        System.out.println();
    }
    public static void array(){

        int a[];
        int[] b;
        int a1[]=new int [5];
        int a2[]=new int[]{1,2,3,684,145,687,6,54,687,5,54,45,58,14,8851,81,148,24,4,1};
        System.out.println(a2[1]);
        for (int i = 0; i <a2.length ; i++) {
            System.out.print(a2[i]+" ");
        }
        System.out.println();
        for (int cc:a2) {
            System.out.print(cc+" ");
        }
        System.out.println();

        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

        System.out.println(Arrays.binarySearch(a2,3));
        int a5[]=new int[]{1,2,3,684,145,687,6,54,687,5,54,55545,58,14,8851,81,148,24,4,1};
        System.out.println(max(a5));

        System.out.println(Arrays.toString(a5));
        insertA2(a5,4,666);
        System.out.println(Arrays.toString(a5));
        insertA1(a5,2,999);
        System.out.println(Arrays.toString(a5));
        System.out.println(getMax(a5));
        System.out.println(getMax(6,45,48,5,4,1,8,5,584,5,84,548,48,48,6,79455,514,48,48,48,8748,97,6));
        int a6[];
        int a7[];
        int a8[];
        int a9[];
        int a11[];
        System.out.println(Arrays.toString(a5));
        a6=Arrays.copyOf(a5,3);
        System.out.println(Arrays.toString(a5));
        System.out.println(Arrays.toString(a6));
        a7=Arrays.copyOfRange(a5,1,3);
        System.out.println(Arrays.toString(a7));
        a8=Arrays.copyOfRange(a5,1,3);
        System.out.println(Arrays.equals(a7,a8));
        Arrays.fill(a8,100);
        System.out.println(Arrays.toString(a8));
        a11=new int[]{12,5,566,48,515,26,56,52,065,56,0255,5546,15,10};

        System.out.println(Arrays.toString(a11));
        Arrays.fill(a11,3,6,0);
        System.out.println(Arrays.toString(a11));
        a9=new int[10];
        System.arraycopy(a11,2,a9,4,5);
        System.out.println(Arrays.toString(a9));

        int [][] aaa=new int[10][5];
        showArray(aaa);
        int [][] bbb=new int[][]{{1000,2 ,68},{2000},{556,8545,5,182,878,455,1548}};
        showArray(bbb);
        System.out.println();
        System.out.println(breakAndcontinue());
        switchText(12);
        switchText(1);
        switchText(2);

        printChengFa();
        printTuXing();
    }

    private static void printTuXing() {
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j >i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printChengFa(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

    }

    public static int breakAndcontinue(){
            int he=0;

        for (int i = 0; i <1000 ; i++) {

            if(i%10==0||i%3==0){
                continue;
            }
            he=he+i;
            if(he>100){
                break;
            }
        }
        return he;
    }

    public static  void showArray(int[][] a){
        for (int i = 0; i <=a.length-1 ; i++) {
            for (int j = 0; j <=a[i].length-1 ; j++) {
                if (j == 0) {
                    System.out.println();
                }
                System.out.print("a["+i+"]["+j+"]"+a[i][j]+"\t");

            }

        }

    }
    public static void switchText(int a){
        switch (a){
        case 1:
            System.out.println("is 1");
           break;
        case 2:
            System.out.println("is 2");
        break;
            default:
                System.out.println("无");

        }
    }

    public static int max(int [] a) {
        if(a.length<=0)return -1;
        int max=a[0];
        for (int i:a) {
            if(max<i){
                max=i;
            }

        }
        return max;
    }

    public static int getMax(int ... a) {
        if(a.length<=0)return -1;
        int max=a[0];
        for (int i:a) {
            if(max<i){
                max=i;
            }

        }
        return max;
    }


    public static void insertA1(int [] a,int index,int value){
        a[index]=value;
    }
    public static void insertA2(int [] a,int index,int value){
        for (int i = a.length-1; i >index ; i--) {
            a[i]=a[i-1];
        }
        a[index]=value;
    }



}
