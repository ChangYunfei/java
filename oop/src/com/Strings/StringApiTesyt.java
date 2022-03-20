package com.Strings;

public class StringApiTesyt {

    public static void main(String[] args) {
        String s="1212121212151212151241251251512421214";
        String s1 = s.replace("12", "0");
        System.out.println(s+"\n"+s1);

        StringBuilder sb=new StringBuilder("1212121212151212151241251251512421214");
        StringBuilder sb1 = sb.replace(0,1,"a");
        System.out.println(sb+"\n"+sb1);
        sb1=new StringBuilder (sb1.toString().replace("12","5"));


        System.out.println(sb+"\n"+sb1);

        System.out.println(s.charAt(0));
        s="1234567gkGGKgKgbKHhKHhjhkHjkHJJh89";
        String sub=s.substring(0,s.length()-1);
        System.out.println(s+"\n"+sub);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());



    }

}
