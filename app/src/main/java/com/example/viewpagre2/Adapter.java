package com.example.viewpagre2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Adapter extends PagerAdapter {
    Context context;
    int[] s1 = {R.drawable.xx, R.drawable.yy, R.drawable.zz};
    public Adapter(Context context) {
        this.context = context;
    }
    @Override
    public int getCount() {
        return s1.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);//container is reference variable of class ViewGroup.
        imageView.setImageResource(s1[position]);
        container.addView(imageView);//here we are dynamically generating imageview & adding it with ViewGroup.
        return imageView;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
