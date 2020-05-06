package com.yrlapps.randomasiannamegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    String japaneseJsonUrl = "https://raw.githubusercontent.com/YutongLi291/RandomAsianNameGenerator/master/db/japanese_names.json";
    TextView nameView ;
    Spinner genderSpinner;
    Button getNameButton;
    int gender;  //0 is any, 1 is male, 2 is female.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameView = findViewById(R.id.generated_name_view);
        gender = 0;
        genderSpinner =  findViewById(R.id.gender_select);
        getNameButton = findViewById(R.id.get_name_button);
        getNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getrandomSurname();
                 getrandomFirstname();
            }
        });

    }

    private void getrandomFirstname() {

    }

    public void getrandomSurname(){
        JSONObject surname;
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, japaneseJsonUrl,null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try{
                    JSONObject surname;
                        JSONArray surnames = response.getJSONArray("last_name");
                        surname = surnames.getJSONObject((int)(Math.random()*surnames.length()));
                        nameView.setText(surname.);
                }
                catch (JSONException e){
                    Log.e("yrl", "japanese surname parsing problem");
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }




}
