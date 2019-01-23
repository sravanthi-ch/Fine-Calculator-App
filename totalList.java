package com.example.sravanthi.app1;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.sravanthi.app1.R.layout.activity_total_list;

//import static com.example.sravanthi.app1.R.id.button7;
//import static com.example.sravanthi.app1.R.layout.activity_total_list;

public class totalList extends AppCompatActivity {

    public Button btn10;

    private void init() {
        Button btn10 = (Button) findViewById(R.id.button7);
        btn10.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent toy1;
                                       toy1 = new Intent(totalList.this, Login.class);
                                       startActivity(toy1);
                                   }
                               }
        );
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_total_list);
        init();
    }
}
