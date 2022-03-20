package com.chang;

import java.util.Objects;

public abstract class person implements Run{
   private int age;
   private String name;
   private String id;

   public void eat(){
       System.out.println("我在吃");
   }
   public final String mySchool(){
       System.out.println("蓝天大学");
       return "蓝天大学";
   }
   public void jieShao(){
       System.out.println("我是"+name);
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return age == person.age &&
                name.equals(person.name) &&
                id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public person() { }

    public person(String name) {
        this.name = name;
    }

    public person(int age, String name, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }
}
