package com.example.dell.activitytest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = (Button) findViewById(R.id.button_2);
        Button buttonBaidu = (Button) findViewById(R.id.button_baidu);
        Button button22 = (Button) findViewById(R.id.button_22);
        Log.d("SecondActivity", "Task id is " + getTaskId());
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        if(data != null){
            Log.d("SecondActivity", data);
        }

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello FirstActivity");
                setResult(RESULT_OK, intent);
                finish();
                /*Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13794587824"));
                startActivity(intent);*/
            }
        });
        buttonBaidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse("http://www.baidu.com"));
                intent.addCategory("com.example.dell.activitytest.MY_CATEGORYS");

                startActivity(intent);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        Log.d("SecondActivity", "onDestroy1");
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy2");
    }

    static void actionStart(Context context, String data){
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param", data);
        context.startActivity(intent);
    }

}
