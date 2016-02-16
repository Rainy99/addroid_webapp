package com.example.zhouy.mywebapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化WebVie对象
        webview = new WebView(this);
        //设置WebVie属性，能够执行js脚本
        webview.getSettings().setJavaScriptEnabled(true);
        try{
            //设置打开的页面地址
            webview.loadUrl("file:///android_asset/Login.html");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        setContentView(webview);
    }
}
