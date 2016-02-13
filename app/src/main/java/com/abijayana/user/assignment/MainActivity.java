package com.abijayana.user.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Family> familylist;ListView lv;
    MyAdapter adapter;
    String[] nam={"MOTHER","ME","FATHER","SISTER"};
    String[] descr={"Iam Light Of the family","I'am Me Only","Iam the Driving Force","I always hit my Bro"};
    Integer[] img={R.mipmap.mother,R.mipmap.me,R.mipmap.father,R.mipmap.sister};
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lstwv);

        familylist=new ArrayList<Family>();
        for(int i=0;i<4;i++){
            Family fm=new Family();
            fm.setName(nam[i]);
            fm.setDescription(descr[i]);
            fm.setImagersc(img[i]);
            familylist.add(fm);
        }
        adapter=new MyAdapter(getApplicationContext(),R.layout.single,familylist);
        lv.setAdapter(adapter);


    }
}
