package com.metanit;

import java.net.*;

public class Main {
    public static void main(String[] args) {
       InetAddress bsu = null;
       try{
           bsu = InetAddress.getByName("www.sutkt.ru");}
       catch (UnknownHostException e){}
       System.out.println(bsu);

    }
}