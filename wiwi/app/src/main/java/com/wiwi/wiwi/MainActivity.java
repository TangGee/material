package com.wiwi.wiwi;


import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;

import com.wiwi.wiwi.menu.NavigationDrawerAdapter;
import com.wiwi.wiwi.menu.NavigationDrawerFragment;


public class MainActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private static final String TAG = "MainActivity";

    private NavigationDrawerFragment mNavigationDrawerFragment;


    private NavigationDrawerAdapter navigationAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((android.support.v7.widget.Toolbar) findViewById(R.id.toolbar));


        mNavigationDrawerFragment = (NavigationDrawerFragment)
            getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);

        navigationAdapter = new NavigationDrawerAdapter();
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout), navigationAdapter);

    }



    @Override
    protected void onResume() {
        super.onResume();

        // Restart loader if default account doesn't match currently loaded
        // account

    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

    }


//    @Override
//    public void onNavigationDrawerItemSelected(int position) {
//        if (navigationAdapter.getItem(position).getType() == TYPE_SEPERATOR)
//            return;
//        Fragment fragmet;
//        Bundle args = new Bundle();
//        switch (position) {
//            case 0:
//                fragmet = new HomePagerFragment();
//                args.putSerializable("org", org);
//                break;
//            case 1:
//                fragmet = new GistsPagerFragment();
//                break;
//            case 2:
//                fragmet = new IssueDashboardPagerFragment();
//                break;
//            case 3:
//                fragmet = new FilterListFragment();
//                break;
//            default:
//                fragmet = new HomePagerFragment();
//                args.putSerializable("org", orgs.get(position - 5));
//                break;
//        }
//        fragmet.setArguments(args);
//        FragmentManager manager = getSupportFragmentManager();
//        manager.beginTransaction().replace(R.id.container, fragmet).commit();
//    }

}
