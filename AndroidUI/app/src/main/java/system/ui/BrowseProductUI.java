package system.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import Model.Purchase.Order.ProductEntity;
import UIControls.ProductOrderController;
import system.ui.Adapters.ProductRecyclerAdapter;

public class BrowseProductUI extends AppCompatActivity implements ProductRecyclerAdapter.OnPostListener{
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_stock_ui);
        createObjects();
        setAdapter();
    }

    private void setAdapter() {
        //pass list of data into parentheses
        ProductOrderController productOrderController = new ProductOrderController(BrowseProductUI.this);




        ProductRecyclerAdapter productRecyclerAdapter = new ProductRecyclerAdapter(productOrderController.listOfProducts(),BrowseProductUI.this,BrowseProductUI.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(productRecyclerAdapter);

    }

    private void createObjects() {
        recyclerView = findViewById(R.id.stockRecyclerView);
    }

    @Override
    public void onPostClick(int position){
        System.out.println(position);
    }

}