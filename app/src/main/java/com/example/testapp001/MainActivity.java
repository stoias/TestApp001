package com.example.testapp001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設置
        Button button = (Button)findViewById(R.id.button);

        // テキストの設置
        textView = (TextView)findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(flag){
                    textView.setText("TRUE");
                    flag = false;
                }else{
                    textView.setText("FLASE");
                    flag = true;
                }
            }
        });

    }

}
