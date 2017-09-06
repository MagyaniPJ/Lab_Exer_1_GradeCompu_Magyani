package com.patrick.mygrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText ra;
    EditText fn;
    Button btn_Back;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ra = (EditText) findViewById(R.id.raGrade);
        fn = (EditText) findViewById(R.id.finalGrade);
        btn_Back = (Button) findViewById(R.id.goBackToMain);

        String rg = getIntent().getExtras().getString("raGrade");
        ra.setText(rg);
        String fg = getIntent().getExtras().getString("fgGrade");
        fn.setText((fg));
    }

    public void goBackToMain (View view)
    {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }


}