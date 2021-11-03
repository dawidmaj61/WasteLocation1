package com.example.wastelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompanyActivity extends AppCompatActivity {

    Button cLogin, cCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        cLogin = (Button) findViewById(R.id.loginc);
        cCancel = (Button) findViewById(R.id.loginc2);

        cLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,ListActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        cCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompanyActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
