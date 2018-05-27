package cn.novate.architect_day14.simple4;

import android.view.View;
import android.view.ViewGroup;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 11:27
 * Version 1.0
 * Params:
 * Description:    目标接口 - 相当于 UsdTarget
*/

public interface TargetAdapter {


    /**
     * 获取多少条
     */
    int getCount() ;

    /**
     * 获取View
     */
    View getView(int position , ViewGroup parent) ;

}
