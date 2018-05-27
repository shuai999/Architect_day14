package cn.novate.architect_day14.simple4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 11:12
 * Version 1.0
 * Params:
 * Description:    自定义ListView - 不考虑复用
*/

public class NovateListView extends ScrollView {

    // 把所有创建的View都添加到 mContainer里边
    private LinearLayout mContainer ;
    // 目标接口
    private TargetAdapter mAdapter ;

    public NovateListView(Context context) {
        this(context,null);
    }

    public NovateListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public NovateListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mContainer = new LinearLayout(context) ;
        mContainer.setOrientation(LinearLayout.VERTICAL);
        addView(mContainer,0);
    }


    @Override
    public void addView(View child) {
        mContainer.addView(child);
    }

    public void setAdapter(ListAdapter adapter) {
        this.mAdapter = adapter ;

        // 观察者，注册、反注册
        int count = mAdapter.getCount() ;
        for (int i = 0; i < count; i++) {
            View childView = mAdapter.getView(i , mContainer) ;
            addView(childView);
        }
    }
}
