package sg.edu.rp.c346.id21009874.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.textViewModule);
        tvName = findViewById(R.id.textView2);
        tvYear = findViewById(R.id.textView3);
        tvSem = findViewById(R.id.textView4);
        tvCredit = findViewById(R.id.textView5);
        tvVenue = findViewById(R.id.textView6);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String selectedModule = intentReceived.getStringExtra("value");

        if (selectedModule.equals("C346")){
            tvCode.setText("Module Code: " + selectedModule);
            tvName.setText("Module Name: Android Programming");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E62E");

        } else if (selectedModule.equals("C349")){
            tvCode.setText("Module Code: " + selectedModule);
            tvName.setText("Module Name: iPad Programming");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66B");

        } else if (selectedModule.equals("C218")){
            tvCode.setText("Module Code: " + selectedModule);
            tvName.setText("Module Name: UI/UX");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66B");

        } else if (selectedModule.equals("C203")){
            tvCode.setText("Module Code: " + selectedModule);
            tvName.setText("Module Name: Web Development in PHP");
            tvYear.setText("Academic Year: 2022");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65H");
        }

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }



    }
