package com.example.dell.uibestpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Msg> msgList = new ArrayList<>();
    Button send;
    EditText inputText;
    MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        send = (Button) findViewById(R.id.send);
        inputText = (EditText) findViewById(R.id.input_text);
        initMsgs();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new MsgAdapter(msgList);
        recyclerView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = inputText.getText().toString();
                if(!"".equals(content)){
                    Msg msg = new Msg(content, Msg.TYPE_SENT);
                    msgList.add(msg);
                    //当有新消息的时候，刷新listview中的显示
                    adapter.notifyItemInserted(msgList.size() - 1);
                    //将listview定位到最后一行
                     recyclerView.scrollToPosition(msgList.size() - 1);
                     //清空
                    inputText.setText("");
                }
            }
        });
    }

    private void initMsgs(){
        Msg msg1 = new Msg("hello, ccg", Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("what?", Msg.TYPE_SENT);
        msgList.add(msg2);
        Msg msg3 = new Msg("this is a test", Msg.TYPE_RECEIVED);
        msgList.add(msg3);
    }
}
