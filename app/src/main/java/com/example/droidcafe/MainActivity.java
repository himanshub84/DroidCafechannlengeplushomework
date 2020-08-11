package com.example.droidcafe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.droidcafe.extra.MESSAGE";
    private String OrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,OrderActivity.class);
                i.putExtra(EXTRA_MESSAGE, OrderMessage);
                startActivity(i);
            }
        });
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
        switch (item.getItemId()) {
            case R.id.action_order:
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, OrderMessage);
                startActivity(intent);
                return true;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                return true;
            case R.id.action_favourites:
                displayToast(getString(R.string.action_favorites_message));
                return true;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                return true;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showDonutOrder(View view) {
        OrderMessage=getString(R.string.donut_order_message);
        displayToast(OrderMessage);
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alter_title);
        myAlertBuilder.setMessage(R.string.alter_message);
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(MainActivity.this,OrderActivity.class);
                        i.putExtra(EXTRA_MESSAGE, OrderMessage);
                        startActivity(i);
                    }
                });

        myAlertBuilder.setNegativeButton(R.string.cancle_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        myAlertBuilder.show();
    }

    public void showIceCreamOrder(View view) {
        OrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(OrderMessage);
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alter_title);
        myAlertBuilder.setMessage(R.string.alter_message);
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(MainActivity.this,OrderActivity.class);
                        i.putExtra(EXTRA_MESSAGE, OrderMessage);
                        startActivity(i);
                    }
                });

        myAlertBuilder.setNegativeButton(R.string.cancle_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        myAlertBuilder.show();
    }

    public void showFroyoOrder(View view) {
        OrderMessage = getString(R.string.froyo_order_message);
        displayToast(OrderMessage);
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle(R.string.alter_title);
        myAlertBuilder.setMessage(R.string.alter_message);
        myAlertBuilder.setPositiveButton(R.string.ok_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent(MainActivity.this,OrderActivity.class);
                        i.putExtra(EXTRA_MESSAGE, OrderMessage);
                        startActivity(i);
                    }
                });

        myAlertBuilder.setNegativeButton(R.string.cancle_button,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        myAlertBuilder.show();
    }
}