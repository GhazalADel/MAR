package com.example.adli.mar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity
{LoginDataBaseAdapter loginDataBaseAdapter;
    EditText edtUsername,edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.op);

        edtUsername = (EditText)findViewById(R.id.Login_edtUser);
        edtPassword = (EditText)findViewById(R.id.Login_edtPass);
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();
    }

    public void btnClick(View view)
    {

        int id = view.getId();
        if (id == R.id.Login_btnSingin)
        {
            //startActivity(new Intent(LoginActivity.this,MainActivity.class));

            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();
            String storedPassword=loginDataBaseAdapter.getSinlgeEntry(username);

            if (username.equals("") || password.equals(""))
                Toast.makeText(getApplicationContext(),"اطلاعات خود را وارد کنید",Toast.LENGTH_LONG).show();
            else  if(password.equals(storedPassword))
            {
                Toast.makeText(login.this, "به برنامه جا مدادی خوش آمدید", Toast.LENGTH_LONG).show();
                startActivity(new Intent(login.this, WelcomeActivity.class));

            }
        }
        else if (id == R.id.Login_btnRegister)
            startActivity(new Intent(login.this,SignUPActivity.class));
    }


}
