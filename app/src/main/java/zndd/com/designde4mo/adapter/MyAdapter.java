package zndd.com.designde4mo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import zndd.com.designde4mo.ui.fragment.ElementFragment;

/**
 * 该类实现的功能说明<p>
 * 作者 liyongfeng <br/>
 * 创建日期 2017/5/11 0011<p>
 * 修改者，修改日期，修改内容。
 */

public class MyAdapter extends FragmentPagerAdapter {
    private List<String> list;

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return ElementFragment.newInstance(list.get(position));
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }
}
