package com.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
       /* File f=new File("a.xyz");

        System.out.println(f.createNewFile());

        System.out.println("f.getName():"+f.getName());
        System.out.println("f.getAbsoluteFile():"+f.getAbsoluteFile());
        System.out.println("getAbsolutePath:"+f.getAbsolutePath());
        System.out.println(f.isFile());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalFile());
        System.out.println(f.getCanonicalPath());
        System.out.println(f.canWrite());*/
        File f=new File("D:/aa/bb");
        System.out.println(f.mkdir());
        System.out.println(f.mkdirs());
        System.out.println("文件是否可读："+f.canRead());
        System.out.println("文件是否可写："+f.canWrite());
        System.out.println("文件的名字："+f.getName());
        System.out.println("上级目录："+f.getParent());
        System.out.println("是否是一个目录："+f.isDirectory());
        System.out.println("是否是一个文件："+f.isFile());
        System.out.println("是否隐藏："+f.isHidden());
        System.out.println("文件的大小："+f.length());
        System.out.println("是否存在："+f.exists());
        System.out.println("绝对路径："+f.getAbsolutePath());
        System.out.println("相对路径："+f.getPath());
        System.out.println("toString:"+f.toString());
        System.out.println(f.delete());
        System.out.println("是否存在："+f.exists());
//        System.out.println("绝对路径："+f.getAbsolutePath());
//        System.out.println("相对路径："+f.getPath());
//        System.out.println("上级目录："+f.getParent());

    }
}
