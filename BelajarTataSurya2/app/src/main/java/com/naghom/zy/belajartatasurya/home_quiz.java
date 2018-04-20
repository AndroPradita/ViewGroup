package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class home_quiz extends AppCompatActivity {

    Button next, back;
    EditText IsiNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_quiz);

         next = (Button)findViewById(R.id.nexts);
         IsiNama = (EditText)findViewById(R.id.username);
         back = (Button)findViewById(R.id.main);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (IsiNama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Input data !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent home_quiz = new Intent(home_quiz.this, home_quiz_1.class);
                    home_quiz.putExtra("username", IsiNama.getText().toString());
                    startActivity(home_quiz);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home_quiz = new Intent(home_quiz.this, MainActivity.class);
                startActivity(home_quiz);
            }
        });

    }
}
