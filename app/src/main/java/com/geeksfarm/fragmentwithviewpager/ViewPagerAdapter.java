package com.geeksfarm.fragmentwithviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

//class ViewPagerAdapter is a class for  initialize Fragment that extended from FragmentPagerAdapter class
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public final int PAGE_COUNT = 3;
    public String tabTitles[] = new String[]{"CHATS", "STATUS", "CALLS"};


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;
        switch (position) {
            case 0:
                fr = new listChatFragment();
                break;
            case 1:
                fr = new statusFragment();
                break;
            case 2:
                fr = new logCallFragment();
                break;
        }
        return fr;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "CHATS";
        } else if (position == 1) {
            title = "STATUS";
        }
        else if (position == 2) {
            title = "CALLS";
        }
        return title;
    }

}

