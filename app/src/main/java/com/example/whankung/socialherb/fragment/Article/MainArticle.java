package com.example.whankung.socialherb.fragment.Article;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.whankung.socialherb.R;
import com.example.whankung.socialherb.activity.Login;
import com.example.whankung.socialherb.fragment.Disease.SearchDisease;

/**
 * Created by Whankung on 16/1/2560.
 */

public class MainArticle extends android.support.v4.app.Fragment {
    private View rootView;
    private Typeface font;
    private ImageView i1, i2, i3, i4, i5;
    private TextView im, im2,im3,im4,im5,p,p2,p3,p4,p5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceStat) {
        rootView = inflater.inflate(R.layout.stucture_article, container, false);
        setView();
        setArticle();

        return rootView;
    }


    private void setView() {
        im = (TextView) rootView.findViewById(R.id.im);
        im2 = (TextView) rootView.findViewById(R.id.im2);
        im3 = (TextView) rootView.findViewById(R.id.im3);
        im4 = (TextView) rootView.findViewById(R.id.im4);
        im5 = (TextView) rootView.findViewById(R.id.im5);
        p = (TextView) rootView.findViewById(R.id.p);
        p2 = (TextView) rootView.findViewById(R.id.p2);
        p3 = (TextView) rootView.findViewById(R.id.p3);
        p4 = (TextView) rootView.findViewById(R.id.p4);
        p5 = (TextView) rootView.findViewById(R.id.p5);


        i1 = (ImageView) rootView.findViewById(R.id.imageView2);
        i2 = (ImageView) rootView.findViewById(R.id.imageView3);
        i3 = (ImageView) rootView.findViewById(R.id.imageView4);
        i4 = (ImageView) rootView.findViewById(R.id.imageView5);
        i5 = (ImageView) rootView.findViewById(R.id.imageView6);

        font = Typeface.createFromAsset(getContext().getAssets(), "tmedium.ttf");
        im.setTypeface(font);
        im2.setTypeface(font);
        im3.setTypeface(font);
        im4.setTypeface(font);
        im5.setTypeface(font);
        p.setTypeface(font);
        p2.setTypeface(font);
        p3.setTypeface(font);
        p4.setTypeface(font);
        p5.setTypeface(font);


        i1.setClickable(true);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                t.replace(R.id.frgMain, new DataArticle());
                t.commit();
            }
        });

    }


    private void setArticle() {
        i1.setImageResource(R.drawable.img_a);
        im.setText("‘โรคอ้วน’ มหันตภัยมืดมนุษย์เมือง");
        i2.setImageResource(R.drawable.img_a2);
        im2.setText("ส้มซ่า และ ส้มสา");
        i3.setImageResource(R.drawable.img_a3);
        im3.setText("คอเรสเตอรอลในไข่ไก่");
        i4.setImageResource(R.drawable.img_a4);
        im4.setText("‘กล้วย’อาหารสุขภาพทุกเพศทุกวัย");
        i5.setImageResource(R.drawable.img_a5);
        im5.setText("กินยาเยอะ ทำให้ตับไตพังจริงหรือ?");
    }
}
