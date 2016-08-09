package com.andmobi.myweather.home;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.andmobi.myweather.R;
import com.andmobi.myweather.util.DebugUtils;

public class HomeActivity extends Activity {
    /**
     * 用于对Fragment进行管理
     */
    private FragmentManager fragmentManager;


    private HomePresenter mHomePresenter;

    private HomeFragment homeFragment;
    private HomeFragment2 homeFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fragmentManager = getFragmentManager();
        setTabSelection(0);
    }


    /**
     * 根据传入的index参数来设置选中的tab页。
     *
     * @param index 每个tab页对应的下标。
     */
    private void setTabSelection(int index) {

        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index) {
            case 0:
                if (homeFragment == null) {
                    // 如果MessageFragment为空，则创建一个并添加到界面上
                    homeFragment = new HomeFragment();
                    transaction.add(R.id.content, homeFragment);
                    mHomePresenter = new HomePresenter(homeFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(homeFragment);
                }
                break;
            case 1:
                if (homeFragment2 == null) {
                    // 如果MessageFragment为空，则创建一个并添加到界面上
                    homeFragment2 = new HomeFragment2();
                    transaction.add(R.id.content, homeFragment2);
                    mHomePresenter = new HomePresenter(homeFragment2);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(homeFragment2);
                }
                break;
        }
        transaction.commit();

    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction 用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (homeFragment != null) {
            transaction.hide(homeFragment);
        }
        if (homeFragment2 != null) {
            transaction.hide(homeFragment2);
        }
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                DebugUtils.d(getClass().getSimpleName(), "btn1");
                setTabSelection(0);

                break;
            case R.id.btn2:
                DebugUtils.d(getClass().getSimpleName(), "btn2");
                setTabSelection(1);
                break;
        }

    }

}
