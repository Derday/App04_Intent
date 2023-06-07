package cz.spse.app04_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mName = findViewById(R.id.et_name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ei = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(ei);
                Bundle mBalik = new Bundle();
                mBalik.putString("jmenoAttrib", mName.getText().toString());
                ei.putExtras(mBalik);

                startActivity(ei);
            }
        });

    }
}