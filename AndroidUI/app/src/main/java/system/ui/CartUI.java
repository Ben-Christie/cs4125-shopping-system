package system.ui;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import system.ui.Adapters.CartRecyclerAdapter;

public class CartUI extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The callback can be enabled or disabled here or in handleOnBackPressed()


        setContentView(R.layout.activity_cart_ui);

        createObjects();

        setAdapter();
    }

    private void setAdapter() {
        //pass list of data into parentheses
        
        CartRecyclerAdapter cartRecyclerAdapter = new CartRecyclerAdapter();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(cartRecyclerAdapter);
    }

    private void createObjects() {
        recyclerView = findViewById(R.id.cartRecyclerView);
    }
}