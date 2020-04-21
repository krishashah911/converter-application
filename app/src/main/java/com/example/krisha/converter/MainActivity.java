package com.example.krisha.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Volume(View view){
        EditText ed1=(EditText)findViewById(R.id.editText2);
        int r=Integer.parseInt(ed1.getText().toString());
        int result=r*1000;
        Toast.makeText(MainActivity.this,Integer.toString(result),Toast.LENGTH_LONG).show();
    }

    public void Temperature(View view){
        EditText ed1=(EditText)findViewById(R.id.editText2);
        int r=Integer.parseInt(ed1.getText().toString());
        double result=(r*9/5)+32;
        Toast.makeText(MainActivity.this,Double.toString(result),Toast.LENGTH_LONG).show();
    }

    public void Length(View view){
        EditText ed1=(EditText)findViewById(R.id.editText2);
        int r=Integer.parseInt(ed1.getText().toString());
        double result=r*100;
        Toast.makeText(MainActivity.this,Double.toString(result)+"(M -> CM)",Toast.LENGTH_LONG).show();
    }

    public void Distance(View view){
        EditText ed1=(EditText)findViewById(R.id.editText2);
        int r=Integer.parseInt(ed1.getText().toString());
        double result=r*1000;
        Toast.makeText(MainActivity.this,Double.toString(result)+"(KM -> M)",Toast.LENGTH_LONG).show();
    }

}



