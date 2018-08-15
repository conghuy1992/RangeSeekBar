package overlayimage.conghuy.com.rangeseekbar.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.crystal.crystalrangeseekbar.interfaces.OnSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.BubbleThumbSeekbar;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.crystal.crystalrangeseekbar.widgets.CrystalSeekbar;

import overlayimage.conghuy.com.rangeseekbar.R;
import overlayimage.conghuy.com.rangeseekbar.widgets.MySeekbar;

/**
 * Created by owais.ali on 7/15/2016.
 */
public class Seekbar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.seekbar, container, false);
        init(v);
        return v;
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void init(View rootView) {

        setRangeSeekbar1(rootView);
        setRangeSeekbar2(rootView);
        setRangeSeekbar3(rootView);
        setRangeSeekbar4(rootView);
        setRangeSeekbar5(rootView);
        setRangeSeekbar6(rootView);
        setRangeSeekbar7(rootView);
        setRangeSeekbar8(rootView);
    }

    private void setRangeSeekbar1(View rootView){

        // get seekbar from view
        final CrystalSeekbar seekbar = (CrystalSeekbar) rootView.findViewById(R.id.rangeSeekbar1);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin1);

        // set listener
        seekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });

        // set final value listener
        seekbar.setOnSeekbarFinalValueListener(new OnSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number value) {
                Log.d("CRS=>", String.valueOf(value));
            }
        });
    }

    private void setRangeSeekbar2(View rootView){

        // get seekbar from view
        final BubbleThumbSeekbar rangeSeekbar = (BubbleThumbSeekbar) rootView.findViewById(R.id.rangeSeekbar2);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin2);

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });
    }

    private void setRangeSeekbar3(View rootView){

        // get seekbar from view
        final BubbleThumbSeekbar rangeSeekbar = (BubbleThumbSeekbar) rootView.findViewById(R.id.rangeSeekbar3);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin3);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax3);

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });
    }

    private void setRangeSeekbar4(View rootView){

        // get seekbar from view
        final CrystalSeekbar rangeSeekbar = (CrystalSeekbar) rootView.findViewById(R.id.rangeSeekbar4);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin4);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax4);

        // set properties
        rangeSeekbar
                .setCornerRadius(10f)
                .setBarColor(Color.parseColor("#93F9B5"))
                .setBarHighlightColor(Color.parseColor("#16E059"))
                .setMinValue(400)
                .setMaxValue(800)
                .setSteps(100)
                .setThumbDrawable(R.drawable.thumb_android)
                .setThumbHighlightDrawable(R.drawable.thumb_android_pressed)
                .setDataType(CrystalRangeSeekbar.DataType.INTEGER)
                .apply();

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });
    }

    private void setRangeSeekbar5(View rootView){

        // get seekbar from view
        final CrystalSeekbar rangeSeekbar = new CrystalSeekbar(getActivity());

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin5);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax5);

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });

        // get range seekbar container
        RelativeLayout container = (RelativeLayout) rootView.findViewById(R.id.contRangeSeekbar5);
        container.addView(rangeSeekbar);
    }

    private void setRangeSeekbar6(View rootView){

        // get seekbar from view
        final MySeekbar rangeSeekbar = (MySeekbar) rootView.findViewById(R.id.rangeSeekbar6);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin6);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax6);

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });
    }

    private void setRangeSeekbar7(View rootView){

        // get seekbar from view
        final CrystalSeekbar rangeSeekbar = (CrystalSeekbar) rootView.findViewById(R.id.rangeSeekbar7);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin7);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax7);

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });

    }

    private void setRangeSeekbar8(View rootView){

        // get seekbar from view
        final CrystalSeekbar rangeSeekbar = (CrystalSeekbar) rootView.findViewById(R.id.rangeSeekbar8);

        // get min and max text view
        final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin8);
        final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax8);

        // change position left to right
        rangeSeekbar.setPosition(CrystalSeekbar.Position.RIGHT).apply();

        // set listener
        rangeSeekbar.setOnSeekbarChangeListener(new OnSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue) {
                tvMin.setText(String.valueOf(minValue));
            }
        });

    }

}
