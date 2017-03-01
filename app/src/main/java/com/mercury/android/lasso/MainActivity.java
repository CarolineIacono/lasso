package com.mercury.android.lasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private OkHttpClient okHttpClient = new OkHttpClient.Builder().build(); // TODO: Make this a singleton for the app


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    WebView webView = (WebView) findViewById( R.id.webView );
//    webView.setWebViewClient(new WebViewClient() {
//        @SuppressWarnings("deprecation") // From API 21 we should use another overload
//        @Override
//        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
//            return handleRequest(url);
//        }
//
//        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//        @Override
//        public WebResourceResponse shouldInterceptRequest(@NonNull WebView view, @NonNull WebResourceRequest request) {
//            return handleRequest(request.getUrl().toString());
//        }
//
//    private WebResourceResponse handleRequest(String url) {
//        try {
//            final Call call = okHttpClient.newCall( new Request.Builder()
//                                                           .url(url)
//                                                           // TODO: Add custom headers
//                                                           .build()
//                                                  );
//
//            final Response response = call.execute();
//
//            // TODO: Probably need to go back to the UI thread, verify first
//            // TODO: Get the title from some custom "x-" header instead of using the response code
//            updateScreenTitle(Integer.toString(response.code()));
//
//            return new WebResourceResponse(
//                    response.header("content-type", "text/plain"), // You can set something other as default content-type
//                    response.header("content-encoding", "utf-8"),  // Again, you can set another encoding as default
//                    response.body().byteStream()
//            );
//        } catch (Exception e) {
//            // TODO: Figure out how to show a custom error screen when we fail
//            return null;
//        }
//    }
//});

        webView.loadUrl("http://www.google.com");
        }


private void updateScreenTitle(String title) {
        setTitle(title);
        }

}
