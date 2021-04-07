package com.metanit;

import java.net.*;
import java.io.*;

public class Main {
    public static void main(String args[])  {
       Socket socket = null;
       try {
           socket = new Socket("localhost", 3456);
           BufferedReader dis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           String msg = dis.readLine();
           System.out.println(msg);
       }catch (IOException e){System.out.println("Ошибка:" + e);}

    }
}