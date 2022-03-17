package com.mindblowing143.ghulbrowse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button udemy, gfg, leetcode, github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        udemy = findViewById(R.id.udemy);
        gfg = findViewById(R.id.gfg);
        leetcode = findViewById(R.id.leetcode);
        github = findViewById(R.id.github);

        gfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), GfgActivity2.class);
                startActivity(i);
            }
        });

        udemy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), UdemyActivity3.class);
                startActivity(intent);

            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent

                Intent intent = new Intent(view.getContext(), GithubActivity4.class);
                startActivity(intent);
            }
        });

        leetcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create intent

                Intent intent = new Intent(view.getContext(), LeetCodeActivity5.class);
                startActivity(intent);
            }
        });
    }
}