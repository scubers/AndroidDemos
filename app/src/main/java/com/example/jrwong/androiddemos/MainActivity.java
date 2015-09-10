package com.example.jrwong.androiddemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;

    private List<Map<String, Object>> dataSource = new ArrayList<>();

    {
        // 初始化数据源
        for (int i = 0 ; i < 20; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("title", "试试看");
            this.dataSource.add(map);
        }
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
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,"点击了第" + (position + 1) + "个item", Toast.LENGTH_SHORT).show();

        switch (position) {
            case 0: {

            }break;


            default:
                break;
        }

    }
}
