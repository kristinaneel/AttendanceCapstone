package com.example.kristinaneel.attendance;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;

/**
 * Created by kristinaneel on 2/1/2017.
 */
public class Login extends Activity {
    private TextView error;
    private TextView user;
    private TextView pass;
    private Integer userStuff = 0;
    private String passStuff;

    private Button sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Backendless.initApp(this, "86BF87A5-8A92-A47F-FFD0-03212EB68600", "8D40F752-F203-3D0B-FF44-D02A66776400","v1");

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(createLoginButtonListener());
    }


    public void loginUser( String ID, String password, AsyncCallback<BackendlessUser> loginCallback )
    {
        Backendless.UserService.login( ID, password, loginCallback );
    }

        public View.OnClickListener createLoginButtonListener() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText textID = (EditText) findViewById(R.id.textID);
                    EditText passwordtxt = (EditText) findViewById(R.id.password);

                    CharSequence ID = textID.getText();
                    CharSequence password = passwordtxt.getText();
                    if (isLoginValuesValid(ID, password)) {
                        LoadingCallback<BackendlessUser> loginCallBack = createLoginCallback();

                        loginCallBack.showLoading();
                        loginUser(ID.toString(), password.toString(), loginCallBack);
                    }

                }
            };
        }

    public boolean isLoginValuesValid(CharSequence ID, CharSequence password) {
        return Validator.isIDValid(this, ID) && Validator.isPasswordValid(this, password);
    }


    public LoadingCallback<BackendlessUser> createLoginCallback() {
        return new LoadingCallback<BackendlessUser>(this, getString(R.string.loading)) {
            @Override
            public void handleResponse(BackendlessUser loggedInUser) {
                super.handleResponse(loggedInUser);
                Toast.makeText(Login.this, String.format("Logged in"), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        };
    }
}