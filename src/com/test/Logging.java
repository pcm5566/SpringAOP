package com.test;

public class Logging {
    public void beforeAdvice(){
        System.out.println("开始建立学生档案……");
    }
    public void afterAdvice(){
        System.out.println("学生档案已建立！");
    }
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString() );
    }
    public void AfterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}

