package com.htcdiurno.intentimplicito;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enlace = "http://iesalandalus.org";
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(enlace));
                startActivity (intent);
            }
        });
    }
}
