package com.example.yzeng.mytestfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentText extends Fragment {
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text,container,false);
        tv = view.findViewById(R.id.textViewFragment);

        Bundle bundle = getArguments();
        String data = bundle.getString("key");
        tv.setText(data);

        return view;
    }
}
