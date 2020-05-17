package com.example.learnandroidfromgoogle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.learnandroidfromgoogle.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                Toast.makeText(MainActivity.this, "add", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove:
                Toast.makeText(MainActivity.this, "remove", Toast.LENGTH_SHORT).show();
                break;
            default:
                Log.d("nothing", "xxx");
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 老办法
//        setContentView(R.layout.activity_main);
        // 新办法
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.idButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"your clck the button 1",Toast.LENGTH_SHORT).show();
            }
        });
        binding.idButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"2222", Toast.LENGTH_SHORT).show();
            }
        });
        binding.idButton2.setText("这是第二个button");

        findViewById(R.id.id_button_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我是传统发放除法的", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
