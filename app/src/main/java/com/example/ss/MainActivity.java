package com.example.ss;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示信息");
        builder.setPositiveButton("确定",null);
        builder.setNegativeButton("取消",null);
        builder.setNeutralButton("再想想",null);
        builder.create().show();
    }

    public void click2(View v){
        Intent intent = new Intent();
        intent.setAction(intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+110"));
        startActivity(intent);
    }


}
