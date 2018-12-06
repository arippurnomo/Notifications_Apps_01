package com.arippurnomo.notificationsapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ContentDetailActivity extends AppCompatActivity {

    TextView dTitle, dDesc;
    ImageView dImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_detail);

        //initialize view
        dTitle = findViewById(R.id.det_title);
        dDesc = findViewById(R.id.det_description);
        dImage = findViewById(R.id.det_image);

        //get data from inten
        String image = getIntent().getStringExtra("image");
        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("description");


        //set data to views
        dTitle.setText(title);
        dDesc.setText(desc);
        Picasso.get().load(image).into(dImage);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
