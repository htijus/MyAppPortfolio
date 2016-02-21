package com.app.example.andriod.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendToastMessage(View view){
        int id = view.getId();
        Context context = getApplicationContext();
        Toast toast ;
        String toastText1 = "This button will launch ";
        String toastText2 = " app!";

        //The logic to capture the onClick button event and display the toast accordingly
        switch (id){
            case R.id.button1 :
                toast = Toast.makeText(context, toastText1+"spotify streamer"+toastText2, Toast.LENGTH_SHORT);
                break;
            case R.id.button2 :
                toast = Toast.makeText(context, toastText1+"scores"+toastText2, Toast.LENGTH_SHORT);
                break;
            case R.id.button3 :
                toast = Toast.makeText(context, toastText1+"library"+toastText2, Toast.LENGTH_SHORT);
                break;
            case R.id.button4 :
                toast = Toast.makeText(context, toastText1+"build it bigger"+toastText2, Toast.LENGTH_SHORT);
                break;
            case R.id.button5 :
                toast = Toast.makeText(context, toastText1+"bacon reader"+toastText2, Toast.LENGTH_SHORT);
                break;
            case R.id.button6 :
                toast = Toast.makeText(context, toastText1+"my capstone"+toastText2, Toast.LENGTH_SHORT);
                break;
            default:
                toast = Toast.makeText(context, "My Application Portfolio", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
