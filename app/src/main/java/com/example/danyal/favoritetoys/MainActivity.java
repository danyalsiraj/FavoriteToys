package com.example.danyal.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare a textview variable called ToyList
    TextView ToyListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToyListView=(TextView) findViewById(R.id.toyList);
        // use find by view to get a refrence to textview from layout

        //use the static toybox.gettoynames method to store the names in a string
        String[] toyName=ToyBox.getToyNames();
        //loop through each toy and append the name in textview
        for (String toy:toyName){
            ToyListView.append(toy+"\n\n\n");
        }


    }
}
