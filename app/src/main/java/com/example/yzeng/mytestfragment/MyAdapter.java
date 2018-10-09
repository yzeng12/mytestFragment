package com.example.yzeng.mytestfragment;

import android.app.Activity;
import android.content.Context;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{
    String[] mycontries;
    int[] myimage;
    Context ctx;
    LayoutInflater inflater;
   // Activity activity;

    public MyAdapter(String[] mycontries, int[] myimage, Context ctx) {
        this.mycontries = mycontries;
        this.myimage = myimage;
        this.ctx = ctx;
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mycontries.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.item_layout,null);
        TextView tv=convertView.findViewById(R.id.textViewList);
        ImageView iv=convertView.findViewById(R.id.imageView);
        //ConstraintLayout constraintLayout = view.findViewById(R.id.myconstrainlayout);
        tv.setText(mycontries[position]);
        iv.setImageResource(myimage[position]);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("key", position);
        final FragmentImage fragment_img = new FragmentImage();
        fragment_img.setArguments(bundle2);

        Bundle bundle = new Bundle();
        bundle.putString("key", mycontries[position]);
        final FragmentText fragment_text = new FragmentText();
        fragment_text.setArguments(bundle);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //
                ((MainActivity) ctx).getFragmentManager().beginTransaction().replace(R.id.Relativelayout,fragment_text).addToBackStack(null).commit();

            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               ((MainActivity)ctx).getFragmentManager().beginTransaction().replace(R.id.Relativelayout,fragment_img).addToBackStack(null).commit();
            }
        });



        return convertView;
    }
}
