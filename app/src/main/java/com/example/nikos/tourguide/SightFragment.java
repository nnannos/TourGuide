package com.example.nikos.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions.
 */
public class SightFragment extends Fragment {


    public SightFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_site_list, container, false);

        // Create a list of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.ancient_salamina, R.string.ancient_salamina_descr, R.drawable.ancient_salamis_sight));
        sites.add(new Site(R.string.salamina_battleship, R.string.salamina_battleship_descr, R.drawable.battleship_sight));
        sites.add(new Site(R.string.euripides_cave, R.string.euripides_cave_descr, R.drawable.euripidis_cave_sight));
        sites.add(new Site(R.string.ag_nikolas_monastery, R.string.ag_nikolas_monastery_descr, R.drawable.ag_nikolas_sight));
        sites.add(new Site(R.string.museum, R.string.museum_descr, R.drawable.museum_sight));

        // Create an {@link SiteAdapter}, whose data source is a list of {@link Site}s. The
        // adapter knows how to create list items for each item in the list.
        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.color_category_sight);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // fragment_site_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SiteAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Site} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}


