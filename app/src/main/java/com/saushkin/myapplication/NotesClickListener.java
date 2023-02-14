package com.saushkin.myapplication;

import androidx.cardview.widget.CardView;

import com.saushkin.myapplication.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);
}
