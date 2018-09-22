package com.example.nimishgupta.mycollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText getEmail;
    EditText getPwd;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEmail = (EditText)findViewById(R.id.email);
        getPwd = (EditText)findViewById(R.id.password);
        button = (Button)findViewById(R.id.loginButton);
    }

    public void SigninButton(View view){
        String emailEntered = getEmail.getText().toString();
        String pwdEntered = getPwd.getText().toString();
        if(emailEntered.equals("nimish@1") && pwdEntered.equals("nimish@1")){
            Intent myIntent = new Intent(MainActivity.this, BottomNavigation.class);
            startActivity(myIntent);
            this.finish();
        }
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
    }
}
