package com.example.user.calculadora_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2;
    TextView tv1;
    private double n1=0,n2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

    }
    @Override
    public void onClick(View view) {

        n1=Double.parseDouble(et1.getText().toString());
        n2=Double.parseDouble(et2.getText().toString());
        tv1=(TextView) findViewById(R.id.tv1);

        double n3 = 0;

        switch (view.getId())
        {
            case R.id.btn1:
                n3 = n1+n2;
                tv1.setText(String.valueOf(n3));

                break;
            case R.id.btn2:
                tv1.setText(String.valueOf(n1-n2));
                break;
            case R.id.btn3:
                tv1.setText(String.valueOf(n1*n2));
                break;
            case R.id.btn4:
                tv1.setText(String.valueOf(n1/n2));
            break;
        }
    }
}
