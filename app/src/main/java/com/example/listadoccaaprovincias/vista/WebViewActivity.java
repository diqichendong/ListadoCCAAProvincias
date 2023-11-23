package com.example.listadoccaaprovincias.vista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.listadoccaaprovincias.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initComponents();
    }

    private void initComponents() {
        Bundle bundle = getIntent().getExtras();
        WebView wv = findViewById(R.id.wv);
        wv.loadUrl("https://es.wikipedia.org/wiki/" + bundle.getString("provincia"));
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
    }
}