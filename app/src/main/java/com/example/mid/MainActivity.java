package com.example.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    TextView t1;
    TextView t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.tv1);
        t2 = findViewById(R.id.tv2);
        e1 = findViewById(R.id.ed1);
        e2 = findViewById(R.id.ed2);
        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity2();
            }
        });
    }

    public void openMainActivity2() {
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if (s1.matches("") && s2.matches("")) {
            Toast.makeText(getApplicationContext(), "You left field Empty", Toast.LENGTH_LONG).show();
        }
        else {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            String s = e2.getText().toString();
            intent.putExtra("s", s);
        }
    }
}
