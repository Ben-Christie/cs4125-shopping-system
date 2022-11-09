package system.ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import Model.Purchase.Order.ProductEntity;
import system.ui.R;



public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.MyViewHolder>{
    private List<ProductEntity> products;
    private Context ct;
    private OnPostListener mOnPostListener;


    public ProductRecyclerAdapter(List<ProductEntity> products,Context ct, OnPostListener onPostListener) {
        this.products = products;
        this.ct = ct;
        this.mOnPostListener = onPostListener;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ct);
        View view = inflater.inflate(R.layout.stock_data_row,parent,false);
        return new MyViewHolder(view, mOnPostListener);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemName.setText("Name: "+products.get(position).getName());
        holder.itemPrice.setText("Price: "+"€"+ products.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView itemName, itemQuantity,itemPrice;


        OnPostListener onPostListener;
        public MyViewHolder(@NonNull View itemView, OnPostListener onPostListener) {
            super(itemView);

            itemName = itemView.findViewById(R.id.stockItemName);
            itemPrice = itemView.findViewById(R.id.stockItemPrice);
            this.onPostListener = onPostListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onPostListener.onPostClick(getAdapterPosition());
        }
    }

    public interface OnPostListener{
        void onPostClick(int position);
    }

}


//
//public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.MyViewHolder> {
//    private List<ProductEntity> products;
//    private Context context;
//    private OnPostListener mOnPostListener;
//
//
//    public ProductRecyclerAdapter(List<ProductEntity> products, Context ct, OnPostListener onPostListener){
//        this.products = products;
//        this.context = ct;
//        this.mOnPostListener = onPostListener;
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//        private TextView itemName, itemQuantity, itemPrice;
//        private OnPostListener onPostListener;
//
//        public MyViewHolder(final View view, OnPostListener onPostListener) {
//            super(view);
//            itemName = view.findViewById(R.id.stockItemName);
//            itemQuantity = view.findViewById(R.id.stockItemQuantity);
//            itemPrice = view.findViewById(R.id.stockItemPrice);
//            this.onPostListener = onPostListener;
//
//
//        }
//
//        @Override
//        public void onClick(View viw){
//            onPostListener.onPostClick(getAdapterPosition());
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        // return amount of data e.g. if we have 20 items of stock this should return 20
//        return products.size();
//    }
//
//    @NonNull
//    @Override
//    public ProductRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View stockView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_data_row, parent, false);
//        return new MyViewHolder(stockView,mOnPostListener);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ProductRecyclerAdapter.MyViewHolder holder, int position) {
//
//
//        holder.itemName.setText("Name: "+products.get(position).getName());
//        holder.itemPrice.setText("Price: "+"€"+ products.get(position).getPrice());
//        /*
//            Implement data for name, quantity and price here
//            Referenced: https://www.youtube.com/watch?v=__OMnFR-wZU
//        */
//
//        // String name = nameFromDatabase + ":";
//        // String quantity = quantityFromDatabase + " Available";
//        // String price = "Price: €" + priceFromDatabase;
//
//        // holder.itemName.setText(name);
//        // holder.itemQuantity.setText(quantity);
//        // holder.itemPrice.setText(price);
//
//    }
//
//
//
//
//    public interface OnPostListener{
//        void onPostClick(int position);
//    }
//}
