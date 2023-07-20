package com.example.nikos.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class  CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightFragment();
        } else if (position == 1) {
            return new BeachFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else  {
            return new HotelFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sighseeing);
        } else if (position == 1) {
            return mContext.getString(R.string.category_beaches);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else  {
            return mContext.getString(R.string.category_hotels);
        }

    }
}



