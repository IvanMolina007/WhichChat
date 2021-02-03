package com.example.whichchat.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whichchat.R;
import com.example.whichchat.model.User;

import java.util.ArrayList;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ViewHolderData> {

    ArrayList<User> listUserses;

    public AdapterItem(ArrayList<User> listUserses) {
        this.listUserses = listUserses;
    }

    @NonNull
    @Override
    public ViewHolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .activity_item_user, null, false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderData holder, int position) {
        holder.mapData(listUserses.get(position));
    }

    @Override
    public int getItemCount() {
        return listUserses.size();
    }

    public class ViewHolderData extends RecyclerView.ViewHolder {

        TextView name;
        public ViewHolderData(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textViewUserName);
        }

        public void mapData(User user) {
            name.setText(user.getName());
        }
    }
}
