package cn.novate.architect_day14.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:20
 * Version 1.0
 * Params:
 * Description:    适配器对象 - 把人民币转为美元
*/

public class UsdAdapter extends RMBAdapter implements UsdTarget{

    public UsdAdapter(float rmb) {
        super(rmb);
    }

    @Override
    public float getUsd() {
        return getRMB()/5.6f ;
    }
}
