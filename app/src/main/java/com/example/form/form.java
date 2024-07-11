package com.example.form;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class form extends AppCompatActivity {

    EditText name,pass,phone;
    RadioButton radio_male,radio_female;
    CheckBox cb_android,cb_c,cb_java,cb_cplus;
    Spinner courses;
    Button btn_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
        phone=findViewById(R.id.phone);
        radio_male=findViewById(R.id.radio_male);
        radio_female=findViewById(R.id.radio_female);
        cb_android=findViewById(R.id.cb_android);
        cb_c=findViewById(R.id.cb_c);
        cb_java=findViewById(R.id.cb_java);
        cb_cplus=findViewById(R.id.cb_cplus);
        courses=findViewById(R.id.spinner);





    }


    public  void showData(View view)
    {
        String n=name.getText().toString();
        String p=pass.getText().toString();
        String ph=phone.getText().toString();
           String gender="";
        if(radio_male.isChecked())
        {
             gender=radio_male.getText().toString();
        }
        if(radio_female.isChecked())
        {
             gender=radio_female.getText().toString();
        }

        String course="";
        if(cb_android.isChecked())
        {
            course+=cb_android.getText().toString();
        }
        if(cb_java.isChecked())
        {
            course+=cb_java.getText().toString();
        }
        if(cb_c.isChecked())
        {
            course+=cb_c.getText().toString();
        }
        if(cb_cplus.isChecked())
        {
            course+=cb_cplus.getText().toString();
        }

        String item=courses.getSelectedItem().toString();

        String res=n+"\n"+p+"\n"+ph+"\n"+gender+"\n"+course+"\n"+item;


       Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();


    }

}