package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int tapCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.greeting);
        TextView counter = findViewById(R.id.counter);
        Button tapBtn = findViewById(R.id.tapButton);

        tapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapCount++;
                counter.setText("Tapped " + tapCount + " time" + (tapCount == 1 ? "" : "s") + "!");
                if (tapCount == 1) greeting.setText("It works!");
                if (tapCount >= 5) greeting.setText("You really like tapping!");
                if (tapCount >= 10) greeting.setText("OK OK we get it 😄");
            }
        });
    }
}
