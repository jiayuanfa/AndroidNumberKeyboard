package com.xuejinwei.numberkeyboard.numberkeyboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by JiaYuanfa on 18/5/16.
 */
public class RandomActivity extends AppCompatActivity {

    @Bind(R.id.et_rondom) EditText mEtRondom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        ButterKnife.bind(this);


        final KeyboardUtil keyboardUtil = new KeyboardUtil(RandomActivity.this,false);

        mEtRondom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyboardUtil.attachTo(mEtRondom);
            }
        });
    }
}
