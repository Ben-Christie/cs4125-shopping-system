package system.ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


import UIControls.ProductOrderController;
import system.ui.BrowseProductUI;
import system.ui.R;



public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.MyViewHolder>{
    private List<String> products;
    private Context ct;
    private OnPostListener mOnPostListener;


    public ProductRecyclerAdapter(List<String> products,Context ct, OnPostListener onPostListener) {
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
//        holder.itemName.setText("Name: "+products.get(position).getName());
//        holder.itemPrice.setText("Price: "+"€"+ products.get(position).getPrice());
//        holder.product = products.get(position);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView itemName, itemQuantity,itemPrice;
        Button orderButton;
        String product;


        OnPostListener onPostListener;
        public MyViewHolder(@NonNull View itemView, OnPostListener onPostListener) {
            super(itemView);

            itemName = itemView.findViewById(R.id.stockItemName);
            itemPrice = itemView.findViewById(R.id.stockItemPrice);
            orderButton = itemView.findViewById(R.id.orderButton);
            this.onPostListener = onPostListener;
            itemView.setOnClickListener(this);

            orderButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
//                    ProductOrderController productOrderController = new ProductOrderController(ct);
//                    productOrderController.orderProduct(product);
                }
            });
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


