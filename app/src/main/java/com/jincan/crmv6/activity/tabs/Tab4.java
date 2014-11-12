package com.jincan.crmv6.activity.tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jincan.crmv6.R;

public class Tab4 extends Fragment {

    private static Tab4 tab = null;

    public static Tab4 getTab() {
        if (tab == null) {
            tab = new Tab4();
            Bundle args = new Bundle();
            tab.setArguments(args);
            tab = new Tab4();
        }
        return tab;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab4, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


}
