package com.example.wastelocation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Map;

public class CustomerActivity extends AppCompatActivity {

    Button mLogin, mExit;
    TextView mEmail, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.login);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.register:
                        startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.login:
                        return true;
                    case R.id.information:
                        startActivity(new Intent(getApplicationContext(), InformationActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        mLogin = (Button) findViewById(R.id.loginer);
        mExit = (Button) findViewById(R.id.loginer2);
        mEmail = (TextView) findViewById(R.id.email);
        mPassword = (TextView) findViewById(R.id.password);


        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEmail.getText().toString().equals("logisticad@gmail.com")&&
                        mPassword.getText().toString().equals("polsl")){
                    Toast.makeText(getApplicationContext(),
                            "Zalogowno się jako logisticad",
                            Toast.LENGTH_LONG).show();
                    Intent login = new Intent(CustomerActivity.this, MapActivity.class);
                    startActivity(login);
                }else {
                    Toast.makeText(getApplicationContext(),
                            "Niepoprawny email lub hasło",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        mExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
