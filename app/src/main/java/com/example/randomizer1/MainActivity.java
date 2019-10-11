package com.example.randomizer1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {
Scanner scan = new Scanner(System.in);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Random rand = new Random();


        Button rollButton = (Button)findViewById(R.id.rollButton);
        final TextView resultsTextView = (TextView)findViewById(R.id.Total);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Num1 = (EditText)findViewById(R.id.Num) ;
                String Numx = Num1.getText().toString();
                 int y = Integer.valueOf(Numx);
                 if (y > 0) {
                     resultsTextView.setText(Integer.toString(rand.nextInt(y) + 1));
                 }

            }
        });


    }


}
