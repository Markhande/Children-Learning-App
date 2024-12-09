    package com.example.ShishuGyan;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.webkit.CookieSyncManager;
    import android.webkit.WebSettings;
    import android.webkit.WebView;
    import android.webkit.WebViewClient;
    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    public class wiki extends AppCompatActivity {
        WebView webview;

        @SuppressLint("SetJavaScriptEnabled")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_games);

            webview = findViewById(R.id.page_view);

            WebSettings webSettings = webview.getSettings();
            webSettings.setJavaScriptEnabled(true);

            // Force links and redirects to open in WebView instead of a browser
            webview.setWebViewClient(new WebViewClient());
            CookieSyncManager.getInstance().startSync();
            CookieSyncManager.getInstance().sync();
            webview.loadUrl("https://www.wikipedia.org/");
        }
        public void onBackPressed() {
            if (webview.canGoBack()) {
                webview.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }