package murkotofoundry.igntopnews.Adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import murkotofoundry.igntopnews.Model.Article;
import murkotofoundry.igntopnews.R;

/**
 * Created by cesa on 9/10/17.
 */

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>{

    private List<Article> articles;

    @Override
    public int getItemCount() {
        articles.size();
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Article  article = articles.get(position);
        holder.title.setText(article.getTitle());
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ArticleViewHolder(itemView);
    }

    class ArticleViewHolder implements RecyclerView.ViewHolder {

        TextView title;
        ImageView thumbnail;

        public ArticleViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }

    }

}
