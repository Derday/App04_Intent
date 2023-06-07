package cz.spse.app04_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class SecondActivity extends AppCompatActivity {

    private TextView mOutput;
    private Button mbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mOutput = findViewById(R.id.textView);
        mbtn2 = findViewById(R.id.button2);

        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ei = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(ei);
            }
        });



        Bundle bu = getIntent().getExtras();

        mOutput.setText("welcome to " + bu.getString("jmenoAttrib").toUpperCase());


    }
}