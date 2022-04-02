package com.example.practical__6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean getnumbers()
    {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 =(TextView) findViewById(R.id.result);

        String s1=e1.getText().toString();
        String s2=e2.getText().toString();

        if((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals("")))
        {
            String result = "please enter a value";
            return false;
        }
        else{
            num1=Integer.parseInt(s1);
            num2=Integer.parseInt(s2);
        }
    return true;
    }

    public void dosum(View v)
    {
        if(getnumbers())
        {
            int sum=num1+num2;
            t1.setText(Integer.toString(sum));
        }
    }

    public void dosub(View v)
    {
        if(getnumbers())
        {
            int sub=num1-num2;
            t1.setText(Integer.toString(sub));
        }
    }

    public void domul(View v)
    {
        if (getnumbers())
        {
            int mul=num1*num2;
            t1.setText(Integer.toString(mul));
        }
    }

    public void dodiv(View v)
    {
        if(getnumbers())
        {
            double div=num1 / (num2 * 1.0);
            t1.setText(Double.toString(div));
        }
    }

    public void domod(View v)
    {
        if (getnumbers())
        {
            double mod=num1%num2;
            t1.setText(Double.toString(mod));
        }
    }

}