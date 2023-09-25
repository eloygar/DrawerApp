package com.example.drawer.ui.alert;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlertViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AlertViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is a alert fragment");
    }
    public void loadUrlInWebView(WebView webView, String url) {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }


    public LiveData<String> getText() {
        return mText;
    }
}