package vvit.twoactitvitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private EditText et;
    String msg,msg1;
    TextView tv;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent int1=getIntent();
        msg1=int1.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tv=(TextView)findViewById(R.id.reply);
        tv.setText(msg1);

        et=(EditText)findViewById(R.id.editText);

    }
    public void Second(View v)
    {
        Log.d(LOG_TAG, "Button clicked!");


        Intent intent =new Intent(this,SecondActivity.class);
        msg=""+et.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,msg);
        startActivity(intent);

    }

}
