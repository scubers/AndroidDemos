package com.example.jrwong.androiddemos.demo1;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.jrwong.androiddemos.R;

public class Demo1Activity extends AppCompatActivity {


    private RelativeLayout rootLayout;
    private Context context;

    {
        context = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_demo1);

        this.rootLayout = (RelativeLayout) findViewById(R.id.demo1activity_id);

        rootLayout.setBackgroundColor(Color.LTGRAY);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_demo1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Toast.makeText(this, "点击了search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "点击了settings", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return false;
    }
}
