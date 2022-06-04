import android.content.Context;
import android.graphics.Movie;
import android.graphics.Sport;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<sportList> newsModelList;

    public NewsAdapter(List<sportList> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      sportList newsModel = newsList.get(position);
        holder.setTitle(newsModel.getTitle());
        holder.setDescription(newsModel.getDescription());
        holder.setImage(newsModel.getImage());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private TextView tvDesc;
        private ImageView ivNews;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
            ivNews = itemView.findViewById(R.id.iv_news);

        }

        public void setTitle(String title) {
            tvTitle.setText(title);
        }

        public void setDescription(String description) {
            tvDesc.setText(description);
        }

        public void setImage(int image) {
            ivNews.setImageResource(image);
        }
    }
}


