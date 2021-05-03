package org.ict.myday;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> tabList = new ArrayList<>();
    private ArrayList<String> tabName = new ArrayList<>();

    public ViewpagerAdapter(@NonNull FragmentManager fm){
        super(fm);
        tabList.add(new CalendarFragment());
        tabList.add(new ListFragment());
        tabList.add(new ImageFragment());

        tabName.add("달력");
        tabName.add("목록");
        tabName.add("사진");
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabName.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        return tabList.get(position);
    }

    @Override
    public int getCount() {
        return tabList.size();
    }
}
