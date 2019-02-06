package com.anurag.android.meterstoinches.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mbutton;
    private EditText editText;
    private TextView tview;
    private Button nbutton;
    private Button pbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tview = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editTexts);
        mbutton = (Button) findViewById(R.id.tbutton);
        nbutton=(Button)findViewById(R.id.button2);
        pbutton=(Button)findViewById(R.id.rbutton);
        nbutton.setText(R.string.buton_name);
        mbutton.setText(R.string.button_name);
        pbutton.setText(R.string.bttn_name);

        mbutton.setOnClickListener(this);
        nbutton.setOnClickListener(this);
        pbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tbutton:
                double mutiplier = 39.37;
                double result = 0.0;

                if (editText.getText().toString().equals("")) {
                    tview.setText(R.string.error_message);
                    tview.setTextColor(Color.GRAY);
                } else {


                    double metervalue = Double.parseDouble(editText.getText().toString());
                    result = metervalue * mutiplier;
                    tview.setTextColor(Color.BLUE);
                    tview.setText(String.format("%.2f", result) + " INCHES");
                }
                break;

            case R.id.button2:
                double multiply=3.28;
                double res=0.0;

                if (editText.getText().toString().equals("")){
                    tview.setText(R.string.errr_message);
                    tview.setTextColor(Color.BLACK);
                }else{

                    double metvalue=Double.parseDouble(editText.getText().toString());
                    res=metvalue*multiply;
                    tview.setTextColor(Color.RED);
                    tview.setText(String.format("%.2f",res) + " FEETS");

                }
                break;
            case R.id.rbutton:
                 double mul=1.09;
                 double resl=0.0;
                 if(editText.getText().toString().equals("")) {
                     tview.setText(R.string.errorr_message);
                     tview.setTextColor(Color.DKGRAY);
                 }else{

                     double mettval=Double.parseDouble(editText.getText().toString());
                     resl=mettval*mul;
                     tview.setTextColor(Color.BLACK);
                     tview.setText(String.format("%.2f",resl) + " YARDS");


                 }
                 break;
        }
    }
}