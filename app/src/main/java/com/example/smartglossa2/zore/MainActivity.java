package com.example.smartglossa2.zore;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView mytxtvw;
    private Button myButton;
    private TextView mytxtvw1;
    private Button myButton1;
    private TextView mytxtvw2;
    private Button myButton2;
    private TextView mytxtvw3;
    private Button myButton3;
    private TextView mytxtvw4;
    private Button myButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytxtvw=(TextView)findViewById(R.id.myTextView);
        myButton=(Button)findViewById(R.id.mybtn);
        mytxtvw1=(TextView)findViewById(R.id.myTextView2);
        myButton1=(Button)findViewById(R.id.mybtn2);
        mytxtvw2=(TextView)findViewById(R.id.myTextView3);
        myButton2=(Button)findViewById(R.id.mybtn3);
        mytxtvw3=(TextView)findViewById(R.id.myTextView4);
        myButton3=(Button)findViewById(R.id.mybtn4);
        mytxtvw4=(TextView)findViewById(R.id.myTextView5);
        myButton4=(Button)findViewById(R.id.mybtn5);

        onBtnClick();
        onBtnClicks();
        onBtnClickbold();
        onBtnClickbig();
        onBtnClickbody();
    }

    public void onBtnClick()
    {
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw.setVisibility((mytxtvw.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });



    }
    public void onBtnClicks()
    {
        myButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw1.setVisibility((mytxtvw1.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });



    }
    public void onBtnClickbold()
    {
        myButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw2.setVisibility((mytxtvw2.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });



    }

    public void onBtnClickbig()
    {
        myButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw3.setVisibility((mytxtvw3.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });



    }

    public void onBtnClickbody()
    {
        myButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mytxtvw4.setVisibility((mytxtvw4.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);

            }
        });



    }
}
