package com.whw.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoLivingActivity extends BaseActivity {

    @BindView(R.id.video_view)
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_living);
        ButterKnife.bind(this);

        videoView.setVideoPath("http://alhlscdn2.lechange.cn/LCL/2E02899PAU00618/0/0/20170111130549/dev_20170111130549_5iexhpdk3nkll4bc.m3u8");
        videoView.start();
    }
}
