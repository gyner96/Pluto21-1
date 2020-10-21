package de.hawlandshut.pluto21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "xx SignInActivity";

    // Deklaration der UI-Elemente
    EditText mEditTextEmail;
    EditText mEditTextPassword;
    Button mButtonSignIn;
    Button mButtonCreateAccount;
    Button mButtonResetPasswort;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Log.d(TAG, "onCreate called");

        //Initialisieren der UI Elemente
        mEditTextEmail = (EditText) findViewById(R.id.signInEmail);
        mEditTextPassword = (EditText) findViewById(R.id.signInPassword);
        mButtonSignIn = (Button) findViewById(R.id.signInButtonSignIn);
        mButtonCreateAccount = (Button) findViewById(R.id.signInButtonCreateAccount);
        mButtonResetPasswort = (Button) findViewById(R.id.signInButtonResetPassword);

        // Listener setzen
        mButtonSignIn.setOnClickListener(this);
        mButtonCreateAccount.setOnClickListener(this);
        mButtonResetPasswort.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()) {
            
            case R.id.signInButtonCreateAccount:
                doCreateAccount();
                return;

            case R.id.signInButtonResetPassword:
                doResetAccount();
                return;

            case R.id.signInButtonSignIn:
                doSignIn();
                return;

            default:   
                return;
        }
    }

    private void doSignIn() {
        Toast.makeText(getApplicationContext(), "You pressed SignIn", Toast.LENGTH_LONG).show();
    }

    private void doResetAccount() {
        Toast.makeText(getApplicationContext(), "You pressed Reset Account", Toast.LENGTH_LONG).show();

    }

    private void doCreateAccount() {
        Toast.makeText(getApplicationContext(), "You pressed Create Account", Toast.LENGTH_LONG).show();

    }

}