package np.com.rotaractnepalapp.rotaract.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentManagerAdapter extends FragmentPagerAdapter {

    public FragmentManagerAdapter(FragmentManager fm)  {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ActiveUsersFragment();
            case 1:
                return new ChatsFragment();
            case 2:
                return new FriendListFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public String getPageTitle(int position){
        switch (position){
            case 0:
                return "ACTIVE USERS";
            case 1:
                return "CHATS";
            case 2:
                return "FRIENDS";
            default:
                    return null;
        }
    }
}











