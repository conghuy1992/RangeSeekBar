package overlayimage.conghuy.com.rangeseekbar.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;



import java.util.ArrayList;
import java.util.List;

import overlayimage.conghuy.com.rangeseekbar.R;
import overlayimage.conghuy.com.rangeseekbar.adapters.RangeSeekbarPagerAdapter;
import overlayimage.conghuy.com.rangeseekbar.ui.fragments.RangeSeekbar;
import overlayimage.conghuy.com.rangeseekbar.ui.fragments.Seekbar;

/**
 * Created by owais.ali on 6/19/2016.
 */
public class RangeSlider extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.range_slider);

        init();
    }

    public final <T> T getView(int resId){
        return (T)findViewById(resId);
    }

    private void init(){
        final TabLayout tabLayout = getView(R.id.tlSeekbar);
        final ViewPager viewPager = getView(R.id.vpSeekbar);

        // set fragments list
        final List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Seekbar());
        fragments.add(new RangeSeekbar());

        // set tabs title
        final List<String> tabTitles = new ArrayList<>();
        tabTitles.add("Seekbar");
        tabTitles.add("Range Seekbar");


        // create view pager adapter
        RangeSeekbarPagerAdapter adapter = new RangeSeekbarPagerAdapter(getSupportFragmentManager(), fragments, tabTitles);

        // set adapter to pager
        viewPager.setAdapter(adapter);

        // set view pager to tab layout
        tabLayout.setupWithViewPager(viewPager);
    }
}
