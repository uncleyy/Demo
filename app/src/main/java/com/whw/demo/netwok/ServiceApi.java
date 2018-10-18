package com.whw.demo.netwok;

import com.whw.demo.model.Contributor;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class ServiceApi extends BaseApi {

    private interface Service {

        @GET("/repos/{owner}/{repo}/contributors")
        Observable<List<Contributor>> login(
                @Path("owner") String owner,
                @Path("repo") String repo);
    }

    private final static Service service = getDefault().create(Service.class);

    public static Observable<List<Contributor>> login(String owner, String repo) {
        return service.login(owner, repo)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
