package com.example.neethraeyehospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorChanneling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_channeling);
    }

    public void Search(View view){
        Intent intent = new Intent(this,DoctorDetails.class);
        startActivity(intent);
    }
}
