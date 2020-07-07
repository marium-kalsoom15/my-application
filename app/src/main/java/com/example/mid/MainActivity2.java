package com.example.mid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mid.R.id.gv1;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    ImageButton ib;
    GridView gridview;
    String[] alphabets;
    Intent intent;
    String s;
    String s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("s");
        gridview = findViewById(gv1);
        alphabets = getResources().getStringArray(R.array.alphabets);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alphabets);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                s2= alphabets[position];
                Toast.makeText(getApplicationContext(),"M Appears 2 times in the name",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton b1= (ImageButton) findViewById(R.id.imageButton2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:03360591022"));
                startActivity(intent);
            }
        });
    }
}
