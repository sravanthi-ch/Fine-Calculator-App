package com.example.sravanthi.app1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
import java.util.Calendar;

import static android.R.attr.id;

public class Login extends AppCompatActivity {

    public Button btn3;
    public Button btn89;
    int year_x,month_x,day_x;
    private static final int DIALOG_ID=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Calendar cal= Calendar.getInstance ();
        year_x=cal.get(Calendar.YEAR);
        month_x=cal.get ( Calendar.MONTH );
        day_x=cal.get ( Calendar.DATE );
        showDialogOnButtonClick();
    }

    public void showDialogOnButtonClick(){
        Button btn3 = (Button) findViewById(R.id.button);

        btn3.setOnClickListener(
                new View.OnClickListener (){
                    @Override
                    public void onClick(View v){
                        showDialog ( DIALOG_ID );
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID)
            return new DatePickerDialog (this,dpickerListener,year_x,month_x,day_x);
        return null;
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        //init();
    }
    private DatePickerDialog.OnDateSetListener dpickerListener
            =new DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view,int year,int monthOfYear,int dayOfMonth ){
            year_x=year;
            month_x=monthOfYear+1;
            day_x=dayOfMonth;
            Toast.makeText ( Login.this,year_x+"/"+month_x+"/"+day_x , Toast.LENGTH_LONG ).show ();
        }
    };

    public boolean onCreateOptionMenu(Menu menu){
     getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    public void passData(View view)
    {
        Intent passdata_intent = new Intent(Login.this,userpage.class);
        passdata_intent.putExtra ("year1",year_x);
        passdata_intent.putExtra ("month1", month_x );
        passdata_intent.putExtra("day1",day_x);
        startActivity( passdata_intent );
    }

    private void init() {
        Button btn89 = (Button) findViewById(R.id.button4);
        btn89.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent toy22;
                                       toy22 = new Intent(Login.this, userpage.class);
                                       startActivity(toy22);
                                   }
                               }
        );
    }




}

