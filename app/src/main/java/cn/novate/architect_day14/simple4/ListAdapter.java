package cn.novate.architect_day14.simple4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cn.novate.architect_day14.R;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/27 11:30
 * Version 1.0
 * Params:         属于对象适配
 * Description:    具体的适配器 - 相当于simple3 的Adapter
 *                 把数据集合适配成View
*/

public class ListAdapter implements TargetAdapter{

    private List<String> mItems ;
    private Context context ;

    public ListAdapter(List<String> items  , Context context){
        this.mItems = items ;
        this.context = context ;

    }


    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public View getView(int position, ViewGroup parent) {
        TextView itemView = (TextView) LayoutInflater.from(context).inflate(R.layout.item_main , parent , false);
        itemView.setText(mItems.get(position));
        return itemView;
    }
}
