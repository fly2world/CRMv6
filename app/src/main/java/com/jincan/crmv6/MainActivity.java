package com.jincan.crmv6;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jincan.crmv6.activity.tabs.Tab1;
import com.jincan.crmv6.activity.tabs.Tab2;
import com.jincan.crmv6.activity.tabs.Tab3;
import com.jincan.crmv6.activity.tabs.Tab4;


public class MainActivity extends Activity {

    private ImageView[] tabs = new ImageView[4];
    private int[] tab_imgs = {R.drawable.tab_01, R.drawable.tab_02, R.drawable.tab_03, R.drawable.tab_04};
    private int[] tab_img_tips = {R.drawable.tab_01_tip, R.drawable.tab_02_tip, R.drawable.tab_03_tip, R.drawable.tab_04_tip};

    //初始化 Tab
    private void initTab() {
        tabs[0] = (ImageView) super.findViewById(R.id.imageView1);
        tabs[1] = (ImageView) super.findViewById(R.id.imageView2);
        tabs[2] = (ImageView) super.findViewById(R.id.imageView3);
        tabs[3] = (ImageView) super.findViewById(R.id.imageView4);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTab();

    }

    private void setImg(View view) {
        //设置图片
        for (int i = 0; i < tabs.length; i++) {
            ImageView v = tabs[i];
            if (v == view) {
                v.setImageResource(tab_img_tips[i]);
            } else {
                v.setImageResource(tab_imgs[i]);
            }
        }//# for
    }


    public void selectTab1(View view) {
        setImg(view);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, Tab1.getTab());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void selectTab2(View view) {
        setImg(view);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, Tab2.getTab());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void selectTab3(View view) {
        setImg(view);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, Tab3.getTab());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void selectTab4(View view) {
        setImg(view);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, Tab4.getTab());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.addToBackStack(null);
        ft.commit();

    }


}
