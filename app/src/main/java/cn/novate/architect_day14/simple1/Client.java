package cn.novate.architect_day14.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:12
 * Version 1.0
 * Params:
 * Description:
*/

public class Client {
    public static void main(String[] args){

        // 第一个版本：只是显示人民币
        RMBAdapter rmbAdapter = new RMBAdapter(560) ;
        float rmb = rmbAdapter.getRMB() ;
        System.out.println("人民币："+rmb);


        // 第二个版本：要去兼容美元  ， 这样的写法可以，设计模式只是一种思想
        float usd = rmbAdapter.getUsd() ;
        System.out.println("美元："+usd);

    }
}
