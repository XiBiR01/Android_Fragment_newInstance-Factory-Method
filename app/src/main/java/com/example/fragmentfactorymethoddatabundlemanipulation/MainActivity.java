package com.example.fragmentfactorymethoddatabundlemanipulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String name;
    public String phNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText enterName=findViewById(R.id.enterName);
        EditText enterNumber=findViewById(R.id.enterNumber);
        Button btnOne=findViewById(R.id.buttonOne);
        Button btnTwo=findViewById(R.id.buttonTwo);
        LinearLayout linearLayout=findViewById(R.id.linearLayout);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTextData(enterName,enterNumber);
                FragmentOne fragOne=FragmentOne.newInstance(name,phNumber);
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,fragOne).commit();
                linearLayout.removeAllViews();
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTextData(enterName,enterNumber);
                FragmentTwo fragTwo=FragmentTwo.newInstance(name,phNumber);
                getSupportFragmentManager().beginTransaction().replace(R.id.linearLayout,fragTwo).commit();


            }
        });


    }

    private void getTextData(EditText enterName, EditText enterNumber) {
        name=enterName.getText().toString();
        phNumber=enterNumber.getText().toString();
    }
}