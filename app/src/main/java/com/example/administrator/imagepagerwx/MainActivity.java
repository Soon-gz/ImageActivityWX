package com.example.administrator.imagepagerwx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btn);
        final List<String> list = new ArrayList<>();
        list.add("http://www.51modo.cc/upload/kindeditor/image/20170120/20170120180122_43266.jpg");
        list.add("http://f1.diyitui.com/45/33/52/00/38/6f/f9/e5/72/23/7b/01/7f/90/c5/8c.jpg");
        list.add("http://userimage8.360doc.com/17/0118/19/156649_201701181906120296455055.jpg");
        list.add("http://userimage8.360doc.com/16/0519/19/156649_201605191906460585727460.jpg");
        list.add("http://userimage7.360doc.com/16/0114/19/5247515_201601141943070361263319.jpg");
        list.add("http://upload.chinaz.com/2015/1103/1446540614989.jpg");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePagerActivity.startImagePagerActivity(MainActivity.this, list, 0, new ImagePagerActivity
                        .ImageSize(view.getMeasuredWidth(), view.getMeasuredHeight()));
            }
        });
    }
}
