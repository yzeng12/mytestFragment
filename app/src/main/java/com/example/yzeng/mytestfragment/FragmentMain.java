package com.example.yzeng.mytestfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragmentMain extends Fragment{

    String[] countries={"india","中国","usa","england","japan"};
    int[] image_ids= {R.drawable.image,R.drawable.im,R.drawable.password,R.drawable.username,R.drawable.huaji};
    @Nullable
    ListView listView;
    MyAdapter myCustomAdapter;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        listView= view.findViewById(R.id.listviewid);


        myCustomAdapter = new MyAdapter(countries,image_ids, getActivity());//????context
        listView.setAdapter(myCustomAdapter);

        return view;
    }



}
