package br.ufmg.coltec.e02activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = findViewById(R.id.TextInputLogin);
        EditText password = findViewById(R.id.editTextPassword);
        Button btnSend = findViewById(R.id.buttonSend);

        btnSend.setOnClickListener(view -> {
            if(login.getText().toString().equals("admin") && password.getText().toString().equals("admin123")){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle args = new Bundle();
                args.putCharSequence("user", password.getText().toString());
                intent.putExtras(args);

                startActivity(intent);
            }else{
                Log.e("login", login.getText().toString());
                Log.e("password", password.getText().toString());

                Toast toast = Toast.makeText(MainActivity.this, "Dados incorretos!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}