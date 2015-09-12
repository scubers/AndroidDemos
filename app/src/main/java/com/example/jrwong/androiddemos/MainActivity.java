package com.example.jrwong.androiddemos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.jrwong.androiddemos.demo2.Demo2Activity;
import com.example.jrwong.androiddemos.demo1.Demo1Activity;
import com.example.jrwong.androiddemos.demo3.Demo3Activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;

    private List<Map<String, Object>> dataSource = new ArrayList<>();

    {
        // 初始化数据源
        HashMap<String, Object> map ;

        map = new HashMap<>();
        map.put("title", "demo1");
        this.dataSource.add(map);

        map = new HashMap<>();
        map.put("title", "demo2");
        this.dataSource.add(map);

        map = new HashMap<>();
        map.put("title", "demo3");
        this.dataSource.add(map);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.mListView = (ListView) findViewById(R.id.menuList);

        SimpleAdapter adapter = new SimpleAdapter(this, this.dataSource, R.layout.menu_item, new String[]{"title"}, new int[]{R.id.menuItem});

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this, "点击了第" + (position + 1) + "个item", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();

        switch (position) {
            case 0: {
                intent.setClass(this, Demo1Activity.class);
            }break;

            case 1: {
                intent.setClass(this, Demo2Activity.class);
            }break;

            case 2: {
                intent.setClass(this, Demo3Activity.class);
            }break;

            default:
                break;
        }

        startActivity(intent);

    }
}
