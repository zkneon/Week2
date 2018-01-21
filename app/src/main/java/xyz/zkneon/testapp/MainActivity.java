package xyz.zkneon.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button mButton;
    public TextView nText;
    public Toast toast;
    private static final String TAG = "MyLog";
    private CheckBox chBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nText = findViewById(R.id.mText);
        chBox = findViewById(R.id.checkbox);
        chBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                toast = Toast.makeText(MainActivity.this, buttonView.getText()+" "+(isChecked ? "checked" : "unchecked"),
                        Toast.LENGTH_LONG);
                toast.show();
                Log.d(TAG, isChecked ? "checked" : "unchecked");
            }

        });
//        final String nString = (String) getText(R.string.app_name);
//        nText = findViewById(R.id.textView);
//        mButton = findViewById(R.id.button);
//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                nText.setText(nString);
//            }
//        });
    }
    public void PrintToast(View view) {

        toast = Toast.makeText(this, "Click", Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "Click");
        nText.setText(R.string.t_after_click);

    }

}

