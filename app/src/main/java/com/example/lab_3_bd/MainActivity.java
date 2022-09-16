package com.example.lab_3_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Output(File f){
        TextView Absolute=findViewById(R.id.textView6);
        TextView  Name=findViewById(R.id.textView2);
        TextView Path=findViewById(R.id.textView);
        TextView ReadText=findViewById(R.id.textView3);
        TextView WriteText=findViewById(R.id.textView5);
        TextView External=findViewById(R.id.textView4);
        Absolute.setText(f.getAbsolutePath());
        Name.setText(f.getName());
        Path.setText(f.getPath());
        boolean ReadState=f.canRead();
        boolean WriteState=f.canWrite();
        if(ReadState){
            ReadText.setText("Read:Yes");
        }
        else{
            ReadText.setText("No");
        }
        if(WriteState){
            WriteText.setText("Write:/Yes");
        }
        else{
            WriteText.setText("/No");
        }
        External.setText(Environment.getExternalStorageState());
    }
     public void onClick1(View v){
        File f=super.getExternalFilesDir(null);
        Output(f);
     }

     public void onClick2(View v){
        File f=super.getCacheDir();
        Output(f);
     }

     public void onClick3(View v){
        File f=super.getExternalCacheDir();
        Output(f);
     }

     public void onClick4(View v){
        File f=Environment.getExternalStorageDirectory();
        Output(f);
     }

     public void onClick5(View v){
        File f=Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS);
        Output(f);
     }

}