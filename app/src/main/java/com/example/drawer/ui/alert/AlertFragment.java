package com.example.drawer.ui.alert;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.drawer.R;
import com.example.drawer.databinding.FragmentAlertBinding;
import com.example.drawer.ui.home.HomeViewModel;

public class AlertFragment extends Fragment {

    private FragmentAlertBinding binding;
    private AlertViewModel alertViewModel;
    private WebView webView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AlertViewModel alertViewModel =
                new ViewModelProvider(this).get(AlertViewModel.class);

        binding = FragmentAlertBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        final TextView textView = binding.textAlert;



        // Obtain a reference to your WebView from the layout
        webView = root.findViewById(R.id.wb_alert);
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the URL from the ViewModel
        alertViewModel.loadUrlInWebView(webView, "https://cebem.net/index.php/es/"); // Replace with your URL

        // Set up WebView settings
        webView.setWebViewClient(new WebViewClient());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}