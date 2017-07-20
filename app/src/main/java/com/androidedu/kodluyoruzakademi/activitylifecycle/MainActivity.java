package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String MAIN_TAG = "GokhanKORKMAZ";

    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MAIN_TAG, "onCreate");


        //Activity oluşturulduğunda çalışan metot
    }


    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(MAIN_TAG, "onContentChanged ");

        //Activity İçeriği değiştiği zaman çalışan metot
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_TAG, "onStart");

        //Activity bu metotdan sonra gorunur
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(MAIN_TAG, "onRestoreInstanceState");

        //onSaveInstanceState metodu ile alinan verileri onRestoreInstanceState metodu vasitasiyla
        // activity 'de kullaniriz.


    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.e(MAIN_TAG, "onPostCreate");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_TAG, "onResume");

        //Activity kullanıcı ile aktif iletisimde
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(MAIN_TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(MAIN_TAG, "onAttachedToWindow");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);

        //Secenekler menusu goruntulendiginde calisir.

    }


    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);

        //Secenekler menusunu guncelledigimizde bu metodu kullanabiliriz.
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_TAG, "onPause");

        //Aktivity calisiyor ama aktif durumda degil.
        //Kullanıcı ile birebir etkilesim yok.
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(MAIN_TAG, "onSaveInstanceState");

        //Activity icerisindeki verileri kaydetmek icin kullanabilecegimiz metot
        //Bu metotta alinan verilen onRestoreInstanceState metodu vasitasiyla kullanilir.
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_TAG, "onStop");

        //Activity durduruldugunda calisir.Activity'nin kullanıcı ile etkilesimi yok
        //Activity'e geri donulecekse onRestart>onStart>onResume metodlari calisir
        //Activity kapatilirsa onDestroy metodu calisir
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG, "onDestroy");

        //Activity tamamen olduruldugunde calisan metod.
    }


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(MAIN_TAG, "onUserInteraction");
    }


    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(MAIN_TAG, "onUserLeaveHint");
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(MAIN_TAG, "onActivityResult");

        //Başka bir uygulamayı açıp tekrar uygulamaya geri döndüğünde ,diğer uygulama bazı parametreler verir.
        //Bu parametreler onActivityResult metodu ile alınır
        //Uygulamamızın başka bir uygulama ile etkileşimi olmadığı için çalışmayacak olan metod.
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG, "onRestart");

        //Uygulama yeniden baslatildiginda calisan metot.
    }


    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG, "onAttachFragment");

        //Activity'e fragmen eklendigi durumda calisan metod
        //Bu uygulama'da fragment olmadığı icin calismayacak metodlardan birisidir.

    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(MAIN_TAG, "onConfigurationChanged");


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(MAIN_TAG, "onBackPressed");

        //Geri tusuna basildiginda calisir.
    }


}
