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

    ImageView iBarbara, iDaphne, iGrace;
    TextView tBarbara, tDaphne, tGrace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUp();
    }

    private void setUp(){
        this.iBarbara = (ImageView) findViewById(R.id.picture_barbara);
        this.iDaphne = (ImageView) findViewById(R.id.picture_daphne);
        this.iGrace = (ImageView) findViewById(R.id.picture_grace);
        this.tBarbara = (TextView) findViewById(R.id.text_barbara);
        this.tDaphne = (TextView) findViewById(R.id.text_daphne);
        this.tGrace = (TextView) findViewById(R.id.text_grace);

        this.iBarbara.setOnClickListener(this);
        this.iDaphne.setOnClickListener(this);
        this.iGrace.setOnClickListener(this);
        this.tBarbara.setOnTouchListener(this);
        this.tDaphne.setOnTouchListener(this);
        this.tGrace.setOnTouchListener(this);
    }

    public void onClick(View view){
        switch (view.getId()) {
            case (R.id.picture_barbara):
                Toast.makeText(this, "Barbara", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.picture_daphne):
                Toast.makeText(this, "Daphne", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.picture_grace):
                Toast.makeText(this, "Grace", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()) {
            case (R.id.text_barbara) :
                tBarbara.setMovementMethod(new ScrollingMovementMethod());
                break;

            case (R.id.text_daphne) :
                tDaphne.setMovementMethod(new ScrollingMovementMethod());
                break;

            case (R.id.text_grace) :
                tGrace.setMovementMethod(new ScrollingMovementMethod());
                break;

        }
        return false;
    }
}
