package com.naghom.zy.belajartatasurya;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class home_quiz_1 extends Activity {
    TextView UserName;
    String str_Username;
    Button mulai,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_quiz_1);

        castingId();
        UserName.setText("Halo "+str_Username+", sudah siap ?");

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SoalPertama= new Intent(home_quiz_1.this, quiz_1.class);
                startActivity(SoalPertama);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void castingId(){
        str_Username = getIntent().getStringExtra("username");
        UserName = (TextView) findViewById(R.id.username);
        mulai = (Button)findViewById(R.id.mulai);
        home = (Button) findViewById(R.id.home);
    }

}
