package com.epicdevler.detailitem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private ImageView bachImage, mozertImage;
    private String mozertBio = "Mozart showed prodigious ability from his earliest childhood. Already competent on keyboard and violin, he composed from the age of five and performed before European royalty. At 17, he was engaged as a court musician in Salzburg, grew restless and travelled in search ofa better position, always composing abundantly.";
    private String bachBio = "Bach was born in Eisenach, Saxe-Eisenach, into a great musical family. His father, Johann Ambrosius Bach, was the director of the town musicians, and all of his uncles were professional musicians. His father probably taught him to play the violin and harpsichord, and his brother, Johann Christoph Bach, taught him the clavichord and exposed him to much contemporary music";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bachImage = findViewById(R.id.firstImage);
        mozertImage = findViewById(R.id.secondImage);

        bachImage.setOnClickListener(this);
        mozertImage.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.firstImage:

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("name", "Bach");
                intent.putExtra("bio", bachBio);
                startActivity(intent);
                break;
            case R.id.secondImage:

                Intent intent1 = new Intent(MainActivity.this, DetailsActivity.class);
                intent1.putExtra("name", "Mozert");
                intent1.putExtra("bio", mozertBio);
                startActivity(intent1);
                break;
        }
    }
}