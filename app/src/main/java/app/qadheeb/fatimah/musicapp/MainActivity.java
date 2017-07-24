package app.qadheeb.fatimah.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivityMyMusic(View view) {
        Intent intent = new Intent(this, MyMusics.class);
        startActivity(intent);
    }
    public void openActivityMyAlbum(View view) {
        Intent intent = new Intent(this, MyAlbum.class);
        startActivity(intent);
    }
    public void openActivityPayment(View view) {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
    public void backButton(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
