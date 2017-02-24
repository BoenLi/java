package com.example.android.inclassassignment05_jingyuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Book> bookList;
    private String author;
    private String title;
    private Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookList = new ArrayList<Book>();
    }

    public void bookInfo() {
        EditText authorView = (EditText) findViewById(R.id.author);
        author = authorView.getText().toString();

        EditText titleView = (EditText) findViewById(R.id.title);
        title = titleView.getText().toString();
    }

    public void clearInfo() {
        EditText authorView = (EditText) findViewById(R.id.author);
        authorView.setText("");

        EditText titleView = (EditText) findViewById(R.id.title);
        titleView.setText("");
    }

    public void addBook(View view) {
        bookInfo();
        book = new Book(author, title);
        bookList.add(book);

        Toast.makeText(getApplicationContext(), "new book added", Toast.LENGTH_SHORT).show();

        clearInfo();
    }

    public void showBook(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("BookList", bookList);
        bookList = new ArrayList<>();
        startActivity(intent);

    }
}