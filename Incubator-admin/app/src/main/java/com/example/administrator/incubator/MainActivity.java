package com.cookandroid.self10_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.incubator.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("New Concpet of Incubator!!");


        // 16개의 이미지 버튼 객체배열
        ImageView image[] = new ImageView[16];
        // 16개의 이미지버튼 ID 배열
        Integer imageId[] = { R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5,
                R.id.image6, R.id.image7, R.id.image8, R.id.image9, R.id.image10, R.id.image11, R.id.image12,
                R.id.image14, R.id.image15, R.id.image16};

        // 16개의 이름 디비로 받을 것인데 음...
        final String imgName[] = { "김건형", "최재원", "김치남",
                "성영민", "권혁정", "김건모", "차태현", "이유리", "다니엘 헤니", "김태희", "태연", "송혜교", "문채원", "효린", "비", "세븐" };

        for (int i = 0; i < imageId.length; i++) {
            image[i] = (ImageView) findViewById(imageId[i]);
        }

        //이미지마다 리스너를 달았음. 로컬액티비티를 ResultActivity1~16으로 작성할 것.
        image[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity1.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity2.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity3.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity4.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity5.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity6.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity7.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity8.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity9.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity10.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[10].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity11.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[11].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity12.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[12].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity13.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[13].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity14.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[14].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity15.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

        image[15].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ResultActivity15.class);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });

    }

}
