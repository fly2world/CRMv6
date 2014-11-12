package com.jincan.crmv6.activity.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jincan.crmv6.R;

public class Tab2 extends Fragment {

    private static Tab2 tab = null;

    public static Tab2 getTab() {
        if (tab == null) {
            tab = new Tab2();
            Bundle args = new Bundle();
            tab.setArguments(args);
            tab = new Tab2();
        }
        return tab;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


}
