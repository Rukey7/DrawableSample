package com.dl7.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.dl7.sample.drawable.CircleDrawable;
import com.dl7.sample.drawable.MultiCircleDrawable;

public class MainActivity extends AppCompatActivity {

    private ImageView mIvCircle;
    private ImageView mIvCircle2;
    private TextView mTvMultiCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIvCircle = (ImageView) findViewById(R.id.iv_circle);
        mIvCircle.setImageDrawable(new CircleDrawable());
        mIvCircle2 = (ImageView) findViewById(R.id.iv_circle_2);
        mIvCircle2.setImageDrawable(new MultiCircleDrawable());

        mTvMultiCircle = (TextView) findViewById(R.id.tv_multi_circle);
        MultiCircleDrawable multiCircle = new MultiCircleDrawable();
        multiCircle.setBounds(0, 0, 100, 100);
        mTvMultiCircle.setCompoundDrawables(null, null, multiCircle, null);
    }
}
