package com.example.kasiazukowska.passwordhacking;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    String randomNumber = "";

    String userEntered;
    int correctCounter = 0;
    int incorrectCounter = 0;

    public void generate() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        TextView myText = (TextView)findViewById(R.id.randomNum);
        randomNumber = String.valueOf(number);
        myText.setText(randomNumber);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generate();

        TextView correctNumCounterTxt = (TextView)findViewById(R.id.correctNumbers);
        correctNumCounterTxt.setText(Integer.toString(correctCounter));

        TextView incorrectNumCounterTxt = (TextView)findViewById(R.id.incorrectNumbers);
        incorrectNumCounterTxt.setText(Integer.toString(incorrectCounter));

        View.OnClickListener pinButtonHandler = new View.OnClickListener() {
            public void onClick(View v) {
                int intID = v.getId();
                Button button = (Button) findViewById(intID);
                String thisButton = button.getText().toString();
                if (randomNumber.equals(thisButton)) {
                    MainActivity.this.correctCounter++;
                    ((TextView)findViewById(R.id.correctNumbers)).setText(Integer.toString(correctCounter));
                    generate();
                }
                else {
                    MainActivity.this.incorrectCounter++;
                    ((TextView)findViewById(R.id.incorrectNumbers)).setText(Integer.toString(incorrectCounter));
                    generate();
                }
            }
        };



        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(pinButtonHandler);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(pinButtonHandler);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(pinButtonHandler);

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(pinButtonHandler);

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(pinButtonHandler);

        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(pinButtonHandler);

        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(pinButtonHandler);

        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(pinButtonHandler);

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(pinButtonHandler);

        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(pinButtonHandler);
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


}
