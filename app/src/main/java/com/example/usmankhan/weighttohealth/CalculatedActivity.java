package com.example.usmankhan.weighttohealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class CalculatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_calculated );
    }

    public void calculatebtn(View view)
    {
        double height=0;
        double weight=0;
        double bmi=0;

        String msg="";


        EditText editText=(EditText) findViewById( R.id.editText );
        EditText editText1=(EditText)findViewById( R.id.editText2 );

        Button btn=(Button) findViewById( R.id.calculate_btn_now );

        TextView views=(TextView) findViewById( R.id.weight_bmi );
        TextView view1=(TextView) findViewById( R.id.result);

        weight=Double.parseDouble( editText.getText().toString() );
        height=Double.parseDouble( editText1.getText().toString() );

        bmi=height*height;
        bmi=weight/bmi;
        views.setText( String.valueOf( bmi ) );

        if (bmi<18.5){
            msg="UnderWeight";
            }
            else if(bmi>18.6 && bmi<25){
            msg="Normal";
        }
        else if (bmi>25){
            msg="Over Weight";
        }
        view1.setText( msg );

    }
}
