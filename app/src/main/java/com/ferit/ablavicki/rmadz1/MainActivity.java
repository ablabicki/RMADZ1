package com.ferit.ablavicki.rmadz1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    ImageView iBarbara, iGrace, iJohn;
    TextView tBarbara, tGrace, tJohn;
    InspiringPerson Barbara, Grace, John;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }



    private void setUp(){
        Barbara = new InspiringPerson(R.drawable.barbara, getString(R.string.barbara_liskov),
                getResources().getStringArray(R.array.barbara_quotes));
        Grace = new InspiringPerson(R.drawable.barbara, getString(R.string.grace_hopper),
                getResources().getStringArray(R.array.grace_quotes));
        John = new InspiringPerson(R.drawable.barbara, getString(R.string.john_resig),
                getResources().getStringArray(R.array.john_quotes));

        this.iBarbara = (ImageView) findViewById(R.id.picture_barbara);
        this.iJohn = (ImageView) findViewById(R.id.picture_john);
        this.iGrace = (ImageView) findViewById(R.id.picture_grace);
        this.tBarbara = (TextView) findViewById(R.id.text_barbara);
        this.tJohn = (TextView) findViewById(R.id.text_john);
        this.tGrace = (TextView) findViewById(R.id.text_grace);

        //programsko postavljanje atributa
        this.iBarbara.setImageResource(Barbara.getPicture());
        this.tBarbara.setText(Barbara.getText());

        this.iBarbara.setOnClickListener(this);
        this.iJohn.setOnClickListener(this);
        this.iGrace.setOnClickListener(this);

        this.tBarbara.setOnTouchListener(this);
        this.tJohn.setOnTouchListener(this);
        this.tGrace.setOnTouchListener(this);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case (R.id.picture_barbara):

                Toast.makeText(this, Barbara.randomQuote(), Toast.LENGTH_SHORT).show();
                break;

            case (R.id.picture_grace):
                Toast.makeText(this, Grace.randomQuote(), Toast.LENGTH_SHORT).show();
                break;

            case (R.id.picture_john):
                Toast.makeText(this, John.randomQuote(), Toast.LENGTH_SHORT).show();
                break;
        }
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()) {
            case (R.id.text_barbara) :
                tBarbara.setMovementMethod(new ScrollingMovementMethod());
                break;

            case (R.id.text_grace) :
                tGrace.setMovementMethod(new ScrollingMovementMethod());
                break;

            case (R.id.text_john) :
                tJohn.setMovementMethod(new ScrollingMovementMethod());
                break;
        }
        return false;
    }
}
