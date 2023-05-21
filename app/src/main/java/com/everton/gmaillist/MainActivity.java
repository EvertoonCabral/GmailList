package com.everton.gmaillist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.everton.gmaillist.model.Email;
import com.everton.gmaillist.model.Emails;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EmailAdapter emailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailAdapter =  new EmailAdapter(new ArrayList<>(Emails.fakeList()));

        RecyclerView rv = findViewById(R.id.recycle_view_main);
        rv.setAdapter(emailAdapter);



    }
}