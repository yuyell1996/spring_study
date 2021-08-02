package com.bjpowernode.exeception;

//运行时异常
public class NotEnoughException extends Exception{
    public NotEnoughException() {
    }
    public NotEnoughException(String s) {
        super(s);
    }
}
