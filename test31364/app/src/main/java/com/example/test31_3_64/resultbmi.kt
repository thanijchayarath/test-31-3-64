package com.example.test31_3_64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class resultbmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultbmi)

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resultbmi);
            Intent intent = getIntent();
            String message = intent.getStringExtra("RESULT");
            float bmiValue = intent.getFloatExtra("BMI",0);
            float weight = intent.getFloatExtra("WEIGHT",0);
            float height = intent.getFloatExtra("HEIGHT",0);
            //BMI-TEXTVIEW
            TextView textView = (TextView)findViewById(R.id.number);
            textView.setText(String.format("%.1f",bmiValue));
            //LOG
            Log.d("BMI",""+bmiValue);
            Log.d("WEIGHT",""+weight);
            Log.d("HEIGHT",""+height);
        }

    }
}