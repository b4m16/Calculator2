package com.example.destroy.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button btnClr;
    Button bt8;
    Button bt9;
    Button btplus;
    Button btminus;
    Button btmulti;
    Button btdiv;
    Button btdot;
    Button btequal;
    Button btac;
    TextView tv;

    double var1,var2;
    private String equation,con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt7=(Button)findViewById(R.id.btn7);
        btnClr= (Button) findViewById(R.id.btnClr);
        bt8=(Button)findViewById(R.id.btn8);
        btplus=(Button)findViewById(R.id.btnplus);
        btequal=(Button)findViewById(R.id.btnequ);
        bt9=(Button)findViewById(R.id.btn9);
        bt0=(Button)findViewById(R.id.btn0);
        btminus=(Button)findViewById(R.id.btnminus);
        btmulti=(Button)findViewById(R.id.btnmul);
        btdiv=(Button)findViewById(R.id.btndiv);
        btdot=(Button)findViewById(R.id.btndot);
        bt1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);
        bt5=(Button)findViewById(R.id.btn5);
        bt6=(Button)findViewById(R.id.btn6);
        tv=(TextView)findViewById(R.id.tve);
        btac= (Button) findViewById(R.id.btac);
        tv.setText("");

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("7"));
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("8"));
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("9"));
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("1"));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("2"));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("3"));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("4"));
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("5"));
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("0"));
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("6"));
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp= Double.parseDouble(tv.getText().toString());
                int temp2= (int) (temp/10);
                tv.setText(String.valueOf(temp2));
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().concat("."));
            }
        });
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con=tv.getText().toString();
                var1=Double.valueOf(con);
                equation="-";
                tv.setText(null);

            }
        });
        btmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con=tv.getText().toString();
                var1=Double.valueOf(con);
                equation="*";
                tv.setText(null);

            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                con=tv.getText().toString();
                var1=Double.valueOf(con);
                equation="/";
                tv.setText(null);

            }
        });



        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(tv.getText().toString());
                equation="+";
                tv.setText(null);
            }
        });


        btac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setText("");
                var1=0;
                var2=0;
                equation="";
            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(tv.getText().toString());
                switch(equation){
                    case "+":
                        var1=var1+var2;
                        equation="";
                        tv.setText(String.valueOf(var1));
                        break;
                    case "-":
                        var1=var1-var2;
                        equation="";
                        tv.setText(String.valueOf(var1));
                        break;
                    case "*":
                        var1=var1*var2;
                        equation="";
                        tv.setText(String.valueOf(var1));
                        break;
                    case "/":
                        var1=var1/var2;
                        equation="";
                        tv.setText(String.valueOf(var1));
                        break;
                }
            }

        });
    }
}
