package com.islam.mutiara.cyber17;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {
    private InterstitialAd iklanInter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TxtApp = (TextView)findViewById(R.id.txt_title);
        TxtApp.setText("Bulu Perindu V.0.0.1");

        Thread waktu = new Thread() {
            public void run(){
                try{
                    sleep(25000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(MainActivity.this, InterActivity.class);
                    startActivity(i);
                    MainActivity.this.finish();
                }
            }
        };
        waktu.start();

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView = (AdView) this.findViewById(R.id.adview);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        iklanInter.loadAd(adRequest);
        iklanInter.setAdListener(new AdListener() {
            public void onAdLoaded() {
                bukaIntertialIklan();
            }
        });
//1 ----------------------------------------------------------------------------------
        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView1 = (AdView) this.findViewById(R.id.adview1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        adView1.loadAd(adRequest1);

//2 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView2 = (AdView) this.findViewById(R.id.adview2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView2.loadAd(adRequest2);

//3 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView3 = (AdView) this.findViewById(R.id.adview3);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        adView3.loadAd(adRequest3);

//4 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView4 = (AdView) this.findViewById(R.id.adview4);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        adView4.loadAd(adRequest4);

//5 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView5 = (AdView) this.findViewById(R.id.adview5);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        adView5.loadAd(adRequest5);

//6 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView6 = (AdView) this.findViewById(R.id.adview6);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        adView6.loadAd(adRequest6);

//7 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView7 = (AdView) this.findViewById(R.id.adview7);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        adView7.loadAd(adRequest7);

//8 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView8 = (AdView) this.findViewById(R.id.adview8);
        AdRequest adRequest8 = new AdRequest.Builder().build();
        adView8.loadAd(adRequest8);

//9 ----------------------------------------------------------------------------------

        iklanInter = new InterstitialAd(MainActivity.this);
        iklanInter.setAdUnitId("ca-app-pub-9383618420590276/9471948545");

        AdView adView9 = (AdView) this.findViewById(R.id.adview9);
        AdRequest adRequest9 = new AdRequest.Builder().build();
        adView9.loadAd(adRequest9);

        iklanInter.loadAd(adRequest);
        iklanInter.setAdListener(new AdListener() {
            public void onAdLoaded() {
                bukaIntertialIklan();
            }
        });

    }

    public void bukaIntertialIklan() {
        if (iklanInter.isLoaded()) {
            iklanInter.show();
        }
    }

}
