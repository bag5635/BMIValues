package com.example.bmivalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private BMI bmi;
    DecimalFormat df = new DecimalFormat("#.00");
    private EditText WeightEditText,
                        HeightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeightEditText = (EditText)findViewById(R.id.amount_Weight);
        HeightEditText = (EditText) findViewById(R.id.amount_Height);

        bmi =  new BMI(0,0);
    }

    public void calculate(View v){
        String WeightString = WeightEditText.getText().toString();
        String HeightString = HeightEditText.getText().toString();


        TextView totalTextView = (TextView)findViewById(R.id.label_total);



        try {
            double WeightAmount = Double.parseDouble(WeightString);
            double HeightAmount = Double.parseDouble(HeightString);

            bmi.setWeight(WeightAmount);
            bmi.setHeight(HeightAmount);

            double total = bmi.BMITop();

            totalTextView.setText(df.format(total));
        }catch (NumberFormatException nfe)
        {
            Toast.makeText(this, "Numbers entered are invalid", Toast.LENGTH_LONG).show();
        }
    }
}