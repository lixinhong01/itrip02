package com.bdqn.biz;

import java.util.Random;

public class Text {
    public static void main(String[] args) {
        //生成四位随机数
        Random ne=new Random();//实例化一个random的对象ne
        int x=ne.nextInt(9999-1000+1)+1000;//为变量赋随机值1000-9999
        System.out.println("产生的随机数是:"+x);//输出
    }
}
