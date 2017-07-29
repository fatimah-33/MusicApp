package app.qadheeb.fatimah.musicapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button openActivityMyMusic;
    private Button openActivityMyAlbum;
    private Button openActivityPayment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openActivityMyMusic = (Button) findViewById(R.id.my_music_button);
        openActivityMyAlbum = (Button) findViewById(R.id.my_albums_button);
        openActivityPayment = (Button) findViewById(R.id.payment_button);
        openActivityMyMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyMusics.class);
                startActivity(intent);
            }
        });
        openActivityMyAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyAlbum.class);
                startActivity(intent);
            }
        });
        openActivityPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Payment.class);
                startActivity(intent);
            }
        });
    }
}
