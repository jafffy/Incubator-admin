package com.example.administrator.incubator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class Person implements Parcelable {
    String babyName;                    //아이이름
    String parentName;                  //보호자성함
    String sex;                         //성별
    String bloodType;                   //혈액형
    String ssn;                         //주민번호
    String state;                       //중증도
    String temperature;                 //온도
    String humidity;                    //습도
    String heartbeat;                   //심박수
    String sound;                       //소리

    public Person(){
        this.babyName = "";
        this.parentName = "";
        this.sex = "";
        this.bloodType = "";
        this.ssn = "";
        this.state = "";
        this.temperature = "";
        this.humidity = "";
        this.heartbeat = "";
        this.sound = "";


    }
    public Person(String babyName, String parentName, String sex, String bloodType, String ssn, String state, String temperature, String humidity, String heartbeat, String sound) {
        this.babyName = babyName;
        this.parentName = parentName;
        this.sex = sex;
        this.bloodType = bloodType;
        this.ssn = ssn;
        this.state = state;
        this.temperature = temperature;
        this.humidity = humidity;
        this.heartbeat = heartbeat;
        this.sound = sound;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setHeartbeat(String heartbeat) {
        this.heartbeat = heartbeat;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getBabyName() {
        return babyName;
    }

    public String getParentName() {
        return parentName;
    }

    public String getSex() {
        return sex;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getSsn() {
        return ssn;
    }

    public String getState() {
        return state;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getHeartbeat() {
        return heartbeat;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.babyName);
        dest.writeString(this.parentName);
        dest.writeString(this.sex);
        dest.writeString(this.bloodType);
        dest.writeString(this.ssn);
        dest.writeString(this.state);
        dest.writeString(this.temperature);
        dest.writeString(this.humidity);
        dest.writeString(this.heartbeat);
        dest.writeString(this.sound);

    }
    public static final Parcelable.Creator<Person> CREATOR = new Creator<Person>(){
        @Override
        public Person createFromParcel(Parcel source) {
            String babyName = source.readString();                   //아이이름
            String parentName = source.readString();                 //보호자성함
            String sex = source.readString();                        //성별
            String bloodType = source.readString();                  //혈액형
            String ssn = source.readString();                           //주민번호
            String state = source.readString();                         //중증도
            String temperature = source.readString();                 //온도
            String huminity = source.readString();                    //습도
            String heartbeat = source.readString();                  //심박수
            String sound = source.readString();                      //소리
            return new Person(babyName, parentName, sex, bloodType, ssn, state, temperature, huminity, heartbeat, sound);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("New Concpet of Incubator!!");

<<<<<<< HEAD
        //DB에서 데이터 받아올 변수들
        String[] babyName = {"성영민", "김건형", "권혁정", "최재원", "김희선", "김태희", "최지우", "문채원", "아이유", "장기하", "이효리", "송혜교", "이병헌", "장동건", "원빈", "서태지"};                    //아이이름
        String[] parentName = {"아부지", "아부지", "아부지", "아부지", "아부지","아부지","아부지","아부지","아부지","아부지","아부지","아부지","아부지","아부지","아부지","아부지"};                 //보호자성함
        String[] sex = {"남","여","남","여","남","여","남","여","남","여","남","여","남","여","남","여"};                         //성별
        String[] bloodType = {"A", "B", "AB", "O", "A", "B", "AB", "O", "A", "B", "AB", "O", "A", "B", "AB", "O"};                  //혈액형
        String[] ssn = {"900502","880520", "911013", "860611","900502","880520", "911013", "860611","900502","880520", "911013", "860611","900502","880520", "911013", "860611"};                         //주민번호
        String[] state = {"4", "5", "6","9", "4", "5", "6","9","4", "5", "6","9","4", "5", "6","9"};                       //중증도
        String[] temperature = {"36.1", "38.2", "37.1", "37.4", "36.1", "38.2", "37.1", "37.4", "36.1", "38.2", "37.1", "37.4", "36.1", "38.2", "37.1", "37.4"};                 //온도
        String[] humidity = {"70.1", "69.3", "70.7", "70.2","70.1", "69.3", "70.7", "70.2","70.1", "69.3", "70.7", "70.2","70.1", "69.3", "70.7", "70.2"};                    //습도
        String[] heartbeat = {"62", "58", "60", "64", "62", "58", "60", "64", "62", "58", "60", "64", "62", "58", "60", "64"};                   //심박수
        String[] sound = {"10.2", "8.8", "9.2", "11.3", "10.2", "8.8", "9.2", "11.3", "10.2", "8.8", "9.2", "11.3", "10.2", "8.8", "9.2", "11.3"};                       //소리


        // 글로벌 액티비티에서 16개의 아이 사진과 아이이름
        ImageView[] image = new ImageView[16];
        TextView[] tv = new TextView[16];

        // 16개의 아이 사진 ID 배열
        Integer imageId[] = { R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5,
                R.id.image6, R.id.image7, R.id.image8, R.id.image9, R.id.image10, R.id.image11, R.id.image12, R.id.image13,
                R.id.image14, R.id.image15, R.id.image16};

        // 16개의 아이 이름 1D 배열
        Integer tvID[] = {R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,R.id.tv6,R.id.tv7,R.id.tv8,R.id.tv9,R.id.tv10,
                R.id.tv11,R.id.tv12,R.id.tv13,R.id.tv14,R.id.tv15,R.id.tv16};
=======
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Change with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }
>>>>>>> 9a90bb67180cc13387ddc170f069ffbdd1878b77

        //아이데이터가 들어있는 객체 16개 생성
        final Person[] baby = new Person[16];

        for(int i=0;i<baby.length;i++){//각각의 객체를 생성한다.
            baby[i]=new Person();
        }

        // 16명 아이 정보 디비로 받을 것임
        // 아이이륾, 보호자이름, 성별, 혈액형, 주민번호, 중증도, 온도, 습도, 심박수, 소리순으로 데이터 입력
        for(int i=0;i<baby.length;i++){
            baby[i].setBabyName(babyName[i]);
            baby[i].setParentName(parentName[i]);
            baby[i].setSex(sex[i]);
            baby[i].setBloodType(bloodType[i]);
            baby[i].setSsn(ssn[i]);
            baby[i].setState(state[i]);
            baby[i].setTemperature(temperature[i]);
            baby[i].setHumidity(humidity[i]);
            baby[i].setHeartbeat(heartbeat[i]);
            baby[i].setSound(sound[i]);
        }

        //이미지 뷰
        for (int i = 0; i < imageId.length; i++) {
            final int index = i;
            image[index] = (ImageView) findViewById(imageId[index]);
            tv[index] = (TextView) findViewById(tvID[index]);

            tv[index].setText(baby[index].getBabyName());    //아이 이름 세팅
            image[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {         //이미지마다 리스너 달아서 인텐트를 통해 글로벌 액티비티에 선언된 데이터를 각 로컬액티비티에 뿌려준다.

                    Intent intent = new Intent(getApplicationContext(), BabyActivity1.class);

                    intent.putExtra("key", baby[index]);
                    startActivity(intent);
                }
            });
        }

    }

}
