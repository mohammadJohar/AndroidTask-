package com.cloudconnectiv.androidtask.adapter;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cloudconnectiv.androidtask.R;
import com.cloudconnectiv.androidtask.model.ServerModel;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;


public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int ALL_SERVERS_TYPE = 1;
    private static final int NORMAL_TYPE = 2;
    private static final String NULL_HANDLE = "*";


    private List<ServerModel> servers;

    public MainAdapter(List<ServerModel> servers) {
        this.servers = servers;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case ALL_SERVERS_TYPE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_separator, parent, false);
                return new AllServerViewHolder(view);
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_main, parent, false);
                return new NormalViewHolder(view);
        }
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case NORMAL_TYPE:
                NormalViewHolder normalHolder = ((NormalViewHolder) holder);
                ServerModel server = servers.get(position < 4 ? position : position - 1);
                normalHolder.tvServerName.setText(server.getName() != null ? server.getName() : NULL_HANDLE);
                normalHolder.tvServerSerial.setText(server.getSerialNum() != null ? server.getSerialNum() : NULL_HANDLE);
                normalHolder.tvIpAddress.setText(server.getIpAddress() != null ? server.getIpAddress() : NULL_HANDLE);
                normalHolder.tvIpSubnetMask.setText(server.getIpSubnetMask() != null ? server.getIpSubnetMask() : NULL_HANDLE);

                if (position == 0 || position == 2 ){
                    normalHolder.tvCPU.setText(R.string.cpu);
                    normalHolder.tvCPU.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFEF7877")));
                    normalHolder.tvIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFEF7877")));
                    normalHolder.ivStatusCheck.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusSound.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusTime.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusCall.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.tvCPU.setVisibility(View.VISIBLE);
                } else if (position == 1) {
                    normalHolder.tvCPU.setText(R.string.cpu);
                    normalHolder.ivStatusCheck.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#5d46d1")));
                    normalHolder.ivStatusTime.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF31B9DB")));
                    normalHolder.ivStatusSound.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFEF7877")));
                    normalHolder.ivStatusCall.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.tvCPU.setVisibility(View.GONE);
                    normalHolder.tvIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFFAC586")));

                }  else if (position == 3) {
                    normalHolder.tvCPU.setText(R.string.failure);
                    normalHolder.tvCPU.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFEF7877")));
                    normalHolder.tvIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFEF7877")));
                    normalHolder.ivStatusCall.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FFDD57BF")));
                    normalHolder.ivStatusCheck.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusSound.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusTime.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.tvCPU.setVisibility(View.VISIBLE);


                } else {
                    normalHolder.tvIcon.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF35EAF9")));
                    normalHolder.tvCPU.setVisibility(View.GONE);
                    normalHolder.ivStatusCheck.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusSound.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusTime.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));
                    normalHolder.ivStatusCall.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#c7c7c7")));

                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return servers != null ? servers.size() + 1 : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 4 ? ALL_SERVERS_TYPE : NORMAL_TYPE;
    }

    class NormalViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_server_name)
        AppCompatTextView tvServerName;
        @BindView(R.id.tv_ip_address)
        AppCompatTextView tvIpAddress;
        @BindView(R.id.tv_ip_subnetmask)
        AppCompatTextView tvIpSubnetMask;
        @BindView(R.id.tv_server_serial)
        AppCompatTextView tvServerSerial;
        @BindView(R.id.iv_status_check)
        AppCompatImageView ivStatusCheck;
        @BindView(R.id.iv_status_time)
        AppCompatImageView ivStatusTime;
        @BindView(R.id.iv_status_call)
        AppCompatImageView ivStatusCall;
        @BindView(R.id.iv_status_sound)
        AppCompatImageView ivStatusSound;
        @BindView(R.id.tv_cpu)
        AppCompatTextView tvCPU;
        @BindView(R.id.tv_icon)
        AppCompatTextView tvIcon;

        NormalViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public class AllServerViewHolder extends RecyclerView.ViewHolder {

        AllServerViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
