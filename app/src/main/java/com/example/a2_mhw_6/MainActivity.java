package com.example.a2_mhw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit_text1 ;
    private EditText edit_text2;
    private    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text1 =findViewById(R.id.edit_text1);
        btn1 = findViewById(R.id.btn1);

        onClickListener();
        }

    private void onClickListener() {
        edit_text1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btn1.setBackgroundColor(Color.YELLOW);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });
    }
}





