package com.ricky.jvm;

/**
 *  VM Args: -Xss128k
 */
public class JVMStackOF {

    private int i = 1;
    public void stackLeak() {
        i++;
        stackLeak();
    }

    public static void main(String[] args){
        new JVMStackOF().stackLeak();
    }


}
