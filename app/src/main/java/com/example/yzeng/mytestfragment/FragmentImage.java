package com.example.yzeng.mytestfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentImage extends Fragment {

    ImageView iv;
    int[] image_ids= {R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image,R.drawable.image};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image,container,false);
        iv = view.findViewById(R.id.imageView2);

        Bundle bundle = getArguments();

        int position = bundle.getInt("key");

        iv.setImageResource(image_ids[position]);




        return view;
    }
}
