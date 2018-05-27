package cn.novate.architect_day14.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:12
 * Version 1.0
 * Params:
 * Description:    对象适配
*/

public class Client {
    public static void main(String[] args){

        // 第一个版本：只是显示人民币
        RMBAdapter rmbAdapter = new RMBAdapter(560) ;
        Adapter adapter = new Adapter(rmbAdapter) ;
        float usd = adapter.getUsd() ;
        System.out.println("美元："+usd);
    }
}
