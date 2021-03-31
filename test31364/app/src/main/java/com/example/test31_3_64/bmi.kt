package com.example.test31_3_64

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_bmi.*

class bmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

//        ดัชนีมวลกายน้อยกว่า 18.5
//
//        คุณมีน้ำหนักน้อยเกินไป ซึ่งอาจจะเกิดจากนักกีฬาที่ออกกำลังกายมาก และได้รับสารอาหารไม่เพียงพอ วิธีแก้ไขต้องรับประทานอาหารที่มีคุณภาพ และมีปริมาณพลังงานเพียงพอ และออกกำลังกายอย่างเหมาะสม
//
//        ดัชนีมวลกายระหว่าง 18.5-22.9
//
//        คุณมีน้ำหนักปกติและมีปริมาณไขมันอยู่ในเกณฑ์ปกติ มักจะไม่ค่อยมีโรคร้าย อุบัติการณ์ของโรคเบาหวาน ความดันโลหิตสูงต่ำกว่าผู้ที่อ้วนกว่านี้
//
//        ดัชนีมวลกายอยู่ระหว่าง 23-24.9
//
//        คุณเริ่มจะมีน้ำหนักเกิน หากคุณมีกรรมพันธ์เป็นโรคเบาหวานหรือไขมันในเลือดสูงต้องพยายามลดน้ำหนักให้ดัชนีมวลกายต่ำกว่า 23
//
//        ดัชนีมวลกายอยู่ระหว่าง 25-29.9
//
//        คุณจัดว่าเป็นคนอ้วนระดับ1 และหากคุณมีเส้นรอบเอวมากกว่า 90 ซม.(ชาย) 80 ซม.(หญิง) คุณจะมีโอกาศเกิดโรคความดัน เบาหวานสูง จำเป็นต้องควบคุมอาหาร และออกกำลังกาย
//
//        ดัชนีมวลกายมากกว่า 30
//
//        คุณจัดว่าอ้วนระดับ2 คุณเสี่ยงต่อการเกิดโรคที่มากับความอ้วน หากคุณมีเส้นรอบเอวมากกว่าเกณฑ์ปกติคุณจะเสี่ยงต่อการเกิดโรคสูง คุณต้องควบคุมอาหาร และออกกำลังกายอย่างจริงจัง

//        cal.setOnClickListener {
//            val wei = weight.text.toString().toDouble()
//            val hei = height.text.toString().toDouble()
//            var sum = answer.text.toString().toDouble()
//
//            if (wei != "0" && hei != "0"){
//                val heimeter = hei / 100
//                sum = wei / (heimeter * heimeter)
//                answer.setText("sum")
//            }
//        }

        val wei = (weight) findViewById(R.id.weight); //อ้างอิงถึง EditText ที่มี id = et1
        weight.requestFocus(); //เรียก cursor ให้ไปที่ตำแหน่ง TextView ดังกล่าว

        //Calculate BMI
        private fun calculateBMI(float weight, float height) {
            return (float) (weight / (height * height));
        }

        // Interpret what BMI means
        private fun interpretBMI(bmiValue, weight, height) {
            String message = ""
            if (bmiValue < 18.5) {
                message = "underweight"
            } else if (bmiValue < 25) {
                message = "normal";
            } else if (bmiValue < 30) {
                message = "overweight"
            } else {
                message = "obese"
            }
            Intent intent = new Intent(this, resultbmi::class.java)
            intent.putExtra("RESULT", message);
            intent.putExtra("BMI", bmiValue);
            intent.putExtra("WEIGHT", weight);
            intent.putExtra("HEIGHT", height);
            startActivity(intent);
        }

        cal.setOnClickListener{
            val wei = (weight) findViewById(R.id.weight);
            val hei = (height) findViewById(R.id.height);
            val str1 = wei.getText().toString();
            val str2 = hei.getText().toString();
            //Get the user values from the widget reference
            float wei = Float.parseFloat(str1);
            float hei = Float.parseFloat(str2);
            //Calculate BMI value
            float bmiValue = calculateBMI(weight, height / 100);
            //Define the meaning of the bmi value
            interpretBMI(bmiValue, weight, height);
        }

    }
}