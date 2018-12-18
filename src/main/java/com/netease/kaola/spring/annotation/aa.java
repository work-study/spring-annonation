package com.netease.kaola.spring.annotation;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.*;

public class aa {
    public static void main(String[] args) throws Exception {
        Scanner in  = new Scanner(System.in);
        in.close();
        Class<System> s = System.class;
        Method registerNatives = s.getDeclaredMethod("registerNatives");
        registerNatives.setAccessible(true);
        registerNatives.invoke(s);
        Scanner in1  = new Scanner(System.in);
        String line = in1.nextLine();
        System.out.println(line);

    }
}
