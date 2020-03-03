package com.example.softwaretestingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class chap1Activity extends AppCompatActivity {
    private PDFView pdfViewch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap1);

        pdfViewch1=findViewById(R.id.chap1);
        pdfViewch1.fromAsset("Chapter-I.pdf").load();


    }
}
