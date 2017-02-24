package com.example.android.inclassassignment05_jingyuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        go();

    }

    public void go() {

        ArrayList<Book> bookList = (ArrayList<Book>) getIntent().getSerializableExtra("BookList");
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main2);

        for (int i = 0; i < bookList.size(); i++) {

            String author = bookList.get(i).getAuthor();
            String title = bookList.get(i).getTitle();
            int num = i + 1;
            TextView info = new TextView(this);
            info.setText("Book " + num + ": " + "author: " + author + "; title: " + title);
            layout.addView(info);
        }

    }

}
