package com.example.sravanthi.app1;
//import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import static com.example.sravanthi.app1.database.DATABASE_NAME;


public class Activity1 extends AppCompatActivity {


    public Button btn;

    private void init() {
        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent toy;
                                       toy = new Intent(Activity1.this, totalList.class);
                                       startActivity(toy);
                                   }
                               }
        );
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView(R.layout.activity_1);
        init();


    }
}