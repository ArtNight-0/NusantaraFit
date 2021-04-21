package com.example.project_nusantarafit;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class RoomchatViewPager
        extends FragmentPagerAdapter {

    public RoomchatViewPager(
            @NonNull FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if (position == 0)
            fragment = new ChatAllFragment();
        else if (position == 1)
            fragment = new ChatUnreadFragment();

        return fragment;
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "All";
        else if (position == 1)
            title = "Unread";
        return title;
    }
}