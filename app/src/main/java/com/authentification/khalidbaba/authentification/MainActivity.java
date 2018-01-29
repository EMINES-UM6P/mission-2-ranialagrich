package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by khalidbaba on 28/01/2018.
 */


public class MainActivity extends Activity {

    EditText Email;
    EditText Password;
    Button btn_login;
    String _email;



    // TODO : declare all variables (elements AND variables)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO Instantiate object (EditText and Button)

        Email=(EditText) findViewById(R.id.email);
        Password=(EditText) findViewById(R.id.password);
        btn_login=(Button) findViewById(R.id.btnLogin);
        btn_login.setOnClickListener(new View.OnClickListener(){
        //TODO : handle click listener in button and get values from the editText
        public void onClick(View view) {
            _email=Email.getText().toString();
            Log.i("Btn_login", "Button register clicked ");
            Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
            i.putExtra("Email",_email);
            startActivity(i);
        }

    });
    }

}
