package cat.sleepykittylife;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        mywebView.loadUrl("https://sleepykitty.life");  //connected activity to my website/
        webSettings.setJavaScriptEnabled(true);
    }
    public class myWebClient extends WebViewClient{
            @Override
            public void onPageStarted (WebView view, String url, Bitmap favicon){
                super.onPageStarted( view, url, favicon);
            }

            @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
}

        @Override   //gives the option to go back through the app without exiting the app/
            public void onBackPressed (){
                if (mywebView.canGoBack()){
                    mywebView.goBack();
                    } else {
                        super.onBackPressed();
                    }
                }
        }
