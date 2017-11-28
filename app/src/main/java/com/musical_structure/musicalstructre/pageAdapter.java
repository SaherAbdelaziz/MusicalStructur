package com.musical_structure.musicalstructre;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by SaherOs on 11/27/2017.
 */

public class pageAdapter extends FragmentStatePagerAdapter {

    /** Context of the app */
    private Context mContext;

    public pageAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
        mContext = mainActivity ;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.nowPlaying);
        }

        else if (position == 1) {
            return mContext.getString(R.string.songs);
        }

        else if (position == 2) {
            return mContext.getString(R.string.home);
        }
        else {
            return mContext.getString(R.string.buyApp);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new nowPlaying();
        } else if (position == 1) {
            return new mySongs();
        } else if (position == 2) {
            return new home();
        }
        else {
            return new BuyApp();
        }
        //return  null ;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
