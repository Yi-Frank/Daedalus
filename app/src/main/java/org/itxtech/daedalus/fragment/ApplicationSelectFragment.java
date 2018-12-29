package org.itxtech.daedalus.fragment;

import org.itxtech.daedalus.R;

public class ApplicationSelectFragment extends ToolbarFragment {

    

    @Override
    public void checkStatus() {
        menu.findItem(R.id.nav_app_select).setChecked(true);
        toolbar.setTitle(R.string.action_app_select);
    }
}
