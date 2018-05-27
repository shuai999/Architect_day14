package cn.novate.architect_day14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cn.novate.architect_day14.simple4.ListAdapter;
import cn.novate.architect_day14.simple4.NovateListView;

public class MainActivity extends AppCompatActivity {

    private NovateListView novate_lv;
    private List<String> items = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novate_lv = (NovateListView) findViewById(R.id.novate_lv);

        // 假设后台返回的数据是一个集合，而我们要显示的是列表，是View，
        for (int i = 0 ; i<10 ; i++){
            items.add(i+"") ;
        }


        // ListView 需要的是 View ，后台给我们返回的是列表对象数组 ，我们采用适配器模式适配

        // 一般写法 - 不断的for循环，不断添加View
        /*for (String item : items) {
            TextView itemView = (TextView) LayoutInflater.from(this).inflate(R.layout.item_main , null);
            itemView.setText(item);
            novate_lv.addView(itemView);
        }*/


        // 改进版 - adapter设计模式
        novate_lv.setAdapter(new ListAdapter(items , this)) ;

    }
}
