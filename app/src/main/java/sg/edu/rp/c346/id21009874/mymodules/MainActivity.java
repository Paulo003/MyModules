package sg.edu.rp.c346.id21009874.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAndroid;
    Button btnIPad;
    Button btnUIUX;
    Button btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAndroid = findViewById(R.id.buttonAndroid);
        btnAndroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "C346");
                startActivity(intent);
            }
        });

        btnIPad = findViewById(R.id.buttonIPad);
        btnIPad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "C349");
                startActivity(intent);
            }
        });

        btnUIUX = findViewById(R.id.buttonUIUX);
        btnUIUX.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "C218");
                startActivity(intent);
            }
        });

        btnWeb = findViewById(R.id.buttonWeb);
        btnWeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("value", "C203");
                startActivity(intent);


            }

    });
}}