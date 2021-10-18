package com.unab.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val URL = "https://www.google.com.sv"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)

        webView.webChromeClient = object:WebChromeClient(){}
        webView.webViewClient = object :WebViewClient(){}

        val configuracion:WebSettings = webView.settings
        configuracion.javaScriptEnabled = true
        webView.loadUrl(URL)
    }

    override fun onBackPressed() {
        val webView:WebView =  findViewById(R.id.webView)
        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}