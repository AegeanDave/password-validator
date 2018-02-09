package cs.dal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button validator = (Button) findViewById(R.id.button2);
        validator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = 0;
                text = (EditText)findViewById(R.id.editText);
                result = (TextView)findViewById(R.id.textView2);
                if(!text.getText().toString().equals("password")) {
                    count++;
                }
                if(text.getText().toString().length()>=8) {
                    count++;
                }
                //a lower case letter must occur at least once
                if(text.getText().toString().matches(".*[a-z].*")) {
                    count++;
                }
                //an upper case letter must occur at least once
                if(text.getText().toString().matches(".*[A-Z].*")) {
                    count++;
                }
                //a special character must occur at least once
                if(text.getText().toString().matches(".*[@#$%^&+=].*")) {
                    count++;
                }
                if(count == 5){
                    result.setText("Strong password");
                }
                else{
                    result.setText("Not strong enough");
                }
            }
        });
    }
}
