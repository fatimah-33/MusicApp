package app.qadheeb.fatimah.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MyMusics extends AppCompatActivity {
private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_musics);
        backButton=(Button)findViewById(R.id.my_music_back_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MyMusics.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void openMusic(View view){
        Intent intent =new Intent(this,NowPlaying.class);
        startActivity(intent);
    }
}
