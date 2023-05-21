package com.everton.gmaillist;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.everton.gmaillist.model.Email;

import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder>{
    public EmailAdapter(ArrayList<Email> emails){

        class EmailViewHolder extends RecyclerView.ViewHolder{
            public EmailViewHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

    }

    @NonNull
    @Override
    public EmailAdapter.EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    }

    @Override
    public void onBindViewHolder(@NonNull EmailAdapter.EmailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
