package com.epicdevler.detailitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsActivity extends AppCompatActivity {

    private Bundle extras;
    private ImageView profileImage;
    private TextView profileBio, profileImageTitle;
    private Button prevActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_page);
        extras = getIntent().getExtras();

//        this.getActionBar().hide();
        getSupportActionBar().hide();

        profileImage = findViewById(R.id.detailImage);
        profileImageTitle = findViewById(R.id.detailImageTitle);
        profileBio = findViewById(R.id.detailImageBio);
        prevActivity = findViewById(R.id.detailsDone);

        prevActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailsActivity.this, MainActivity.class));
            }
        });

        if( extras != null){
            String name = extras.getString("name");
            showDetails(name);
            }
        }


    public void showDetails(String aboutName) {
        if(aboutName.equals("Bach")){
            profileImage.setImageDrawable(ResourcesCompat.getDrawable(getApplicationContext().getResources(), R.drawable.bach_profile, getApplicationContext().getTheme()));
            //            44 This Resource code is the same as  the one in line 50
            profileImageTitle.setText(extras.getString("name"));
            profileBio.setText(extras.getString("bio"));

        }else if(aboutName.equals("Mozert")){
            profileImage.setImageDrawable(ResourcesCompat.getDrawable(this.getResources(), R.drawable.mozart_profile, this.getTheme()));
            //            50 This Resource code is the same as  the one in line 43

            profileImageTitle.setText(aboutName);
            profileBio.setText(extras.getString("bio"));
        }
    }


}