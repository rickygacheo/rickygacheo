package com.ricky.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 *  VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(true) {
            list.add(String.valueOf(i++).intern());
        }


    }
}
