package com.example.preethidevarajan.helplah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity { //AppCombatActivity is a kind of activity
    /* an activity is one screenful of stuff that the user sees */
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //displays the layout in activity_main.xml

        editText = (EditText)findViewById(R.id.editText);
        /* look for something that has this id number, and treat
           whatever you find as if it's an EditText component and
           from here on refer to that thing by the name editText
         */
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        /* when the user clicks the button this
           is called, as instructed in the Buttons onclick input
         */
        textView.setText(editText.getText());
    }
}
