package br.ufmg.coltec.e02activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView userName = findViewById(R.id.textViewUserName);
        Bundle bundle = this.getIntent().getExtras();

        userName.setText("Olá "+bundle.getString("user"));
    }
}