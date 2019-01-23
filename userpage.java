package com.example.sravanthi.app1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.sql.Date;
import java.util.Calendar;
import java.util.stream.*;
import static android.R.id.text1;

//import static android.R.attr.y;
//import static android.R.id.text1;
//import static android.view.View.Y;

public class userpage extends AppCompatActivity {
    public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_userpage );

        Bundle bundle = getIntent ().getExtras ();
        int y = bundle.getInt ( "year1" );
        int m = bundle.getInt ( "month1" );
        int d = bundle.getInt ( "day1" );
        //Date mydate = new Date(y,m,d);
        Calendar cal= Calendar.getInstance () ;
        cal.set(Calendar.YEAR,y);
        cal.set(Calendar.MONTH,m);
        cal.set(Calendar.DAY_OF_MONTH,d);

       // TextView text1 = (TextView) findViewById ( R.id.textView12 );
       // text1.setText ( "oyy" );

        long millis = System.currentTimeMillis ();
        Date date = new Date (millis);
        String str = date.toString ();
        String[] arrOfStr = str.split ( "-", 3 );
        int y1 = Integer.parseInt ( arrOfStr[0] );
        int m1 = Integer.parseInt ( arrOfStr[1] );
        int d1 = Integer.parseInt ( arrOfStr[2] );
        Calendar cal1= Calendar.getInstance () ;
        cal1.set(Calendar.YEAR,y1);
        cal1.set(Calendar.MONTH,m1);
        //System.out.println(date);
        String temp;
        cal1.set(Calendar.DAY_OF_MONTH,d1);
        TextView text1 = (TextView) findViewById ( R.id.textView12 );
        TextView text2 = (TextView) findViewById ( R.id.textView3 );
       // text1.setText ( "oyy" );
        System.out.print ( "HLOOO" );

       if (y > y1 || (y==y1 && m>m1) || (y==y1 && m==m1 && d>d1)) {
            text1.setText ( "plz go back n select proper date" );
        } else {
            //int day = daysBetween(mydate,date);
            long  diff = cal1.getTimeInMillis () - cal.getTimeInMillis ();
            float daycount = (float) diff / (24  * 60  * 60 *1000);
            int count ;
            count = (int) daycount;
            if(count>7) {
                int fine= (count-7)*10;//edit this line to change the fine amount
                text2.setText ("Your fine is");
                text1.setText ( Integer.toString ( fine ));
            }
           else
            {
                text1.setText ( "Thankq.. you have no fine!");
            }
        }




    };
}


