package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private Button getName;
    private Button setName;
    private Shpf shpf;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText_Input2);
        getName = (Button) findViewById(R.id.button_Display);
        setName = (Button) findViewById(R.id.button_GoSave);
        //綁定按鈕及函式，使用監聽器
        getName.setOnClickListener(this::getNameOnClick);
        setName.setOnClickListener(this::setNameOnClick);

        shpf = new Shpf(this);

    }
    public void getNameOnClick(View view) {
        name.setText(shpf.getName());
    }

    public void setNameOnClick(View view) {
        shpf.setName(String.valueOf(name.getText()));
        name.setText("");
    }
}