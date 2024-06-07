package org.javacommunity.basic;

public class Test {
    public static void main(String[] args) {
        String descrtion = "hell\"xccxzcxz\"asdasdsad";
        //descrtion = descrtion.replaceAll("'","\\/'");
        descrtion = descrtion.replaceAll("\"","\\\\\"");
        System.out.println(descrtion);
    }
}
