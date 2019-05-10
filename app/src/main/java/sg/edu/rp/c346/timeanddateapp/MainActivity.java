package sg.edu.rp.c346.timeanddateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button bthReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        bthReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
                tvDisplay.setText(time);

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View vi){
                String date = "Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) + "/" + dp.getYear();
                tvDisplay.setText(date);
            }
        });

        bthReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View va){
                dp.updateDate(2019,00,01);
                tp.setCurrentHour(00);
                tp.setCurrentMinute(00);

            }
        });


    }

}
