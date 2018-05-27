package cn.novate.architect_day14.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:20
 * Version 1.0
 * Params:
 * Description:    对象适配
 *                 具体的适配器： 把人民币转为美元
*/

public class Adapter implements UsdTarget {


    private RMBAdapter rmbAdapter;
    public Adapter(RMBAdapter rmbAdapter) {
        this.rmbAdapter = rmbAdapter ;
    }

    @Override
    public float getUsd() {
        return rmbAdapter.getRMB()/5.6f ;
    }
}
