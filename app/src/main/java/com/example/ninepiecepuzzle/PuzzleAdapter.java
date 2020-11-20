package com.example.ninepiecepuzzle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PuzzleAdapter extends ArrayAdapter<PuzzlePiece> {
    public PuzzleAdapter(@NonNull Context context, ArrayList<PuzzlePiece> pieces) {
        super(context, 0,pieces);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PuzzlePiece piece = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.slot_activity, parent, false);
        }

        return convertView;
    }


}
