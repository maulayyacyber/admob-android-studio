package com.islam.mutiara.cyber17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by Lenovo on 5/31/2017.
 */
public class InterActivity extends Activity{
    private InterstitialAd interAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_inter);

        TextView TxtApp = (TextView)findViewById(R.id.txt_title);
        TxtApp.setText("Bulu Perindu V.0.0.1");

        Thread waktu = new Thread(){
            public void run(){
                try {
                    sleep(25000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(InterActivity.this, MainActivity.class);
                    startActivity(i);
                    InterActivity.this.finish();
                }

            }
        };
        waktu.start();

        interAd = new InterstitialAd(this);
        interAd.setAdUnitId(getString(R.string.id_inter));

        AdRequest adRequest = new AdRequest.Builder().build();
        interAd.loadAd(adRequest);
        interAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showIntertialIklan();
            }
        });
    }

    private void showIntertialIklan() {
        if (interAd.isLoaded()) {
            interAd.show();
        }
    }



}