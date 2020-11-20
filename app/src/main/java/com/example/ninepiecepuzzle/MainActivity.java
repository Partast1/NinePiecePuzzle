package com.example.ninepiecepuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.util.EventLog;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PuzzlePresenter.View {

    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.txt_Text1);
        text2 = findViewById(R.id.txt_Text2);


        text1.setOnLongClickListener(longClickListener);
        //text2.setOnLongClickListener(longClickListener);

        //text1.setOnDragListener(dragListener);
        text2.setOnDragListener(dragListener);

    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData cd = ClipData.newPlainText("", "");
            View.DragShadowBuilder dragShadow = new View.DragShadowBuilder(v);
            v.startDrag(cd, dragShadow, v, 0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();

            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:
                    final View fv = (View) event.getLocalState();

                    if (fv.getId() == R.id.txt_Text1) {
                        text2.setText("YAY");
                    }
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    break;
            }
            return false;
        }
    };
}