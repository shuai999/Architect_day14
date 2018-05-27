package cn.novate.architect_day14.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:12
 * Version 1.0
 * Params:
 * Description:    第二个版本
*/

public class Client {
    public static void main(String[] args){

        // 第一个版本：只是显示人民币
        RMBAdapter rmbAdapter = new RMBAdapter(560) ;
        float rmb = rmbAdapter.getRMB() ;
        System.out.println("人民币："+rmb);


        // 第二个版本：要去兼容美元  ， 采用适配器模式
        // 角色：需要适配的接口 UsdTarget(把人民币转为美元)、适配器对象(Adapter)
        UsdAdapter adapter = new UsdAdapter(560) ;
        rmb = adapter.getRMB() ;
        System.out.println("人民币："+rmb);

        float usd = adapter.getUsd() ;
        System.out.println("美元："+usd);

    }
}
