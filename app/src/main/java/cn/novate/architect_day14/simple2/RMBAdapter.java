package cn.novate.architect_day14.simple2;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 10:10
 * Version 1.0
 * Params:
 * Description:
*/

public class RMBAdapter {
    private float mRMB ;
    public RMBAdapter(float rmb){
        this.mRMB = rmb ;
    }

    /**
     * 获取人民币
     */
    public float getRMB(){
        return mRMB ;
    }


    /**
     * 获取美元
     */
    public float getUsd(){
        return mRMB/5.6f ;
    }
}
