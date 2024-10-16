package com.example.volume_calculator_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Prism extends AppCompatActivity {

    EditText prism_volume;
    TextView result, title;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        prism_volume = findViewById(R.id.editText_prism);
        title = findViewById(R.id.textView8);
        result = findViewById(R.id.textView9);
        btn = findViewById(R.id.btn4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String length = prism_volume.getText().toString();
                String breadth = prism_volume.getText().toString();
                String height = prism_volume.getText().toString();
                int l = Integer.parseInt(length);
                int b = Integer.parseInt(breadth);
                int h = Integer.parseInt(height);

                //V = l*b*h

                double volume = l*b*h;
                result.setText("V: "+volume+"m^3");


            }
        });

    }
}