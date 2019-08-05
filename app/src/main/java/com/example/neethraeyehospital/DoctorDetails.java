package com.example.neethraeyehospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
    }

    public void Book(View view){
        Intent intent = new Intent(this,PatientDetails2.class);
        startActivity(intent);
    }
}
