package com.cloudconnectiv.androidtask.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.cloudconnectiv.androidtask.R;
import com.cloudconnectiv.androidtask.adapter.MainAdapter;
import com.cloudconnectiv.androidtask.model.BaseModel;
import com.cloudconnectiv.androidtask.model.ServerModel;
import com.cloudconnectiv.androidtask.network.HttpUtils;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements Callback<BaseModel> {

    private static final int PAGE = 0;
    private static final int SIZE = 100;

    @BindView(R.id.rv_server)
    RecyclerView rvServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        HttpUtils.getInstance().getMethods().getServers(PAGE, SIZE).enqueue(this);
    }

    @Override
    public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
        if (response.isSuccessful()) {
            List<ServerModel> servers = response.body().getContent();
            rvServer.setAdapter(new MainAdapter(servers));
        } else {
            Toast.makeText(getApplicationContext(), R.string.connection_error,Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onFailure(Call<BaseModel> call, Throwable t) {

    }
}
