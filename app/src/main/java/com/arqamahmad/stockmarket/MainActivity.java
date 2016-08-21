package com.arqamahmad.stockmarket;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    * Manage the Internet Connection
    * Allows us to create the action for the Search Button
    *
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean connected = false;


        // verifies the connection by 2 ways
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED
                || connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {


            Toast.makeText(getApplicationContext(), "The internet connection is fine. Enjoy the app! ", Toast.LENGTH_SHORT).show();

            // connection is either in WIFI or mobile network
            connected = true;

        }else{


            Toast.makeText(getApplicationContext(), "The internet connection is down. This will not work!", Toast.LENGTH_SHORT).show();
            connected = false;
        }



    }

    public void onClick(View view) {


        Intent intent = new Intent(this, SelectedItemActivity.class);
        EditText editText = (EditText) findViewById(R.id.query_text);
        String stock_query = editText.getText().toString();




        if(stock_query.matches(""))
        {
            Toast.makeText(getApplicationContext(), "Please enter a valid stock symbol", Toast.LENGTH_SHORT).show();

        }else{
            intent.putExtra("searchStock", stock_query);
            startActivity(intent);
        }

    }
}
