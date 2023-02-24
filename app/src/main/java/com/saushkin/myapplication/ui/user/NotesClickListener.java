package com.saushkin.myapplication.ui.user;

import androidx.cardview.widget.CardView;

import com.saushkin.myapplication.data.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);
}
