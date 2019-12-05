package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int isiCount =0;
    private int data =10;
    private int a=10;
    private TextView tampilCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampilCount = (TextView) findViewById(R.id.textview1);

    }

    public void View(View view) {
        Toast isi = Toast.makeText(this,"Jumlah data Masuk="+isiCount+"",Toast.LENGTH_LONG);
        isi.show();
    }

    public void Reset(View view) {
        isiCount=0;
        data=10;
        Toast reset = Toast.makeText(this,"Data berhasil direset",Toast.LENGTH_LONG);
        if (tampilCount!=null){
            tampilCount.setText(Integer.toString(isiCount));
        }
    }

    public void COUNT(View view) {
        isiCount++;
        if (isiCount==data) {
            Toast count = Toast.makeText(this, "Data=" + data + "", Toast.LENGTH_LONG);
            count.show();
        }    if (tampilCount!=null){
                tampilCount.setText(Integer.toString(isiCount));
        }
    }
}
