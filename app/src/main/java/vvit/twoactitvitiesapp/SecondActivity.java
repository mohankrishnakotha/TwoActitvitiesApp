package vvit.twoactitvitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et;
    TextView tv;
    String msg,msg1;
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      Intent int1=getIntent();
        msg1=int1.getStringExtra(MainActivity.EXTRA_MESSAGE);
        tv=(TextView)findViewById(R.id.message);
        tv.setText(msg1);
        et=(EditText)findViewById(R.id.text_header);

    }
    public void lauchMain(View v)
    {

        msg=et.getText().toString();

        Intent intent =new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE,msg);
        startActivity(intent);

    }

}
