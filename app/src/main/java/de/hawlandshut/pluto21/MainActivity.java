package de.hawlandshut.pluto21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "xx MainActivity";
    //just for testing
    private boolean mIsSignedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");

        // TODO: Ergänzen, dass wir nur in die SignIn-Activity wollen, wenn der User nicht angemeldet ist.

        if (this.mIsSignedIn) {
            ;
        } else {
            Intent intent = new Intent(getApplication(),
                    SignInActivity.class);
            startActivity(intent);
        }
    }
    // Erzeugen des Menus aus der XML-Datei(menu.main.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /*Reaktion auf Clicks in die Menu-Einträge */

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.mainMenuHelp:
                Toast.makeText(getApplicationContext(), "You pressed Help", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Help was pressed");
                return true;

            case R.id.mainMenuTest:
                Toast.makeText(getApplicationContext(), "You pressed Test", Toast.LENGTH_LONG).show();
                Log.d(TAG, "Test was pressed");
                return true;

            case R.id.mainMenuManageAccount:
                Toast.makeText(getApplicationContext(), "You pressed Manage Account", Toast.LENGTH_LONG).show();
                Log.d(TAG, "ManageAccount was pressed.");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");

    }
}
