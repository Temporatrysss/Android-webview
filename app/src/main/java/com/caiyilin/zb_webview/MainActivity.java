package com.caiyilin.zb_webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=(EditText) findViewById(R.id.editText);
        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text=(TextView) findViewById(R.id.text);
                text.setText(editText.getText());
                String ipAddress  = editText.getText().toString();

                Intent intent = new Intent (MainActivity.this, WebViewActivity.class);
                intent.putExtra("ipAddress", ipAddress);
                startActivity(intent);
            }
        });


    }
}
