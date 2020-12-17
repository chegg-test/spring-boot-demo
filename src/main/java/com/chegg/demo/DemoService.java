package com.chegg.demo;


import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void methodWithLongListOfArguments(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {

        int sum = arg0 + arg1 + arg2 + arg3 + arg4 + arg5 + arg6 + arg7 + arg8 + arg9 + arg10;
        System.out.println("call to DemoService.methodWithLongListOfArguments()");
        System.out.println("Sum is: " + sum);

        int sub = arg0 - arg1 - arg2 - arg3 - arg4 - arg5 - arg6 - arg7 - arg8 - arg9 - arg10;
        
    }
}