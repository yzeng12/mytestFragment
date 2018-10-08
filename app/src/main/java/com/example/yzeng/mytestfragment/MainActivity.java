package com.example.yzeng.mytestfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] countries={"india","china","usa","england","japan"};
    int[] image_ids= {R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().replace(R.id.Relativelayout,new FragmentMain()).commit();
    }
}
