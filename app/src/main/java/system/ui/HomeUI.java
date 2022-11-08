package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import UIControls.PurchaseController;

public class HomeUI extends AppCompatActivity {
    Button logoutButton, browseStockButton, purchaseHistoryButton, scanButton;
    TextView currentPoints, customerDiscountStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);


        createObjects();

        logoutButton.setOnClickListener(view -> {

        });

        browseStockButton.setOnClickListener(view -> {

        });

        scanButton.setOnClickListener(view -> {
            PurchaseController pc = new PurchaseController();
            pc.scan();
            pc.receivePurchaseFromTill();
        });

//        cartButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        purchaseHistoryButton.setOnClickListener(view -> {

        });
    }

    private void createObjects() {
        logoutButton = findViewById(R.id.logoutButton);
        browseStockButton = findViewById(R.id.browseStockButton);
        scanButton = findViewById(R.id.scanButton);
        //cartButton = findViewById(R.id.cartButton);
        purchaseHistoryButton = findViewById(R.id.purchaseHistoryButton);
        currentPoints = findViewById(R.id.currentPointsText);
        customerDiscountStatus = findViewById(R.id.customerStatusText);
    }

}