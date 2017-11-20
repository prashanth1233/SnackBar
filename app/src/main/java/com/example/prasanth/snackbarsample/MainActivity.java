package com.example.prasanth.snackbarsample;

import android.graphics.Color;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* RelativeLayout relativeLayout = findViewById(R.id.parentLayoutRL);*/
        CoordinatorLayout coordinatorLayout = findViewById(R.id.parentLayoutRL);

        //showing snackbar for short time
        // use Snackbar.LENGTH_INDEFINITE for displaying snackbar indefinite amount of time

        snackbar = Snackbar.make(coordinatorLayout, "You have notification", Snackbar.LENGTH_INDEFINITE);

        //setting action to snackbar like setting onclick listener to text we have displayed

        snackbar.setAction("Click Here", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked here", Toast.LENGTH_LONG).show();
            }
        });


        //changing snackbar text color
        //Snackbar comes with default white color text and #323232 background color.
        // You can override these colors as mentioned below.


        // Changing message text color
        snackbar.setActionTextColor(Color.RED);

        // Changing action button text color
        View snackBarView = snackbar.getView();
        TextView snackBarTextView = snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        snackBarTextView.setTextColor(Color.CYAN);

        snackbar.show();
    }


}
