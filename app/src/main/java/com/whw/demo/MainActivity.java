package com.whw.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whw.demo.model.Contributor;
import com.whw.demo.netwok.ServiceApi;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ServiceApi.login("square", "retrofit")
                .subscribe(new Observer<List<Contributor>>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(List<Contributor> contributor) {

                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
