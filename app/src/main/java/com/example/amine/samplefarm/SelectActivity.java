package com.example.amine.samplefarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        setupAutocompleteTextView();
    }

    private void setupAutocompleteTextView() {
        String[] completions = getResources().getStringArray(R.array.bodies_of_water);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                completions);

        AutoCompleteTextView autoComplete =
                (AutoCompleteTextView) findViewById(R.id.auto_complete_text_view);
        autoComplete.setAdapter(adapter);
    }

}

