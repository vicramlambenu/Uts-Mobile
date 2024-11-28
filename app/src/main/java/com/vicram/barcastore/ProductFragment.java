package com.vicram.barcastore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProductFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Sample products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Jersey Home Barca 2024", 1200000, R.drawable.jersey_home));
        productList.add(new Product("Bola Official Barca", 500000, R.drawable.bola));
        productList.add(new Product("Scarf Barca Limited", 300000, R.drawable.scarf));

        ProductAdapter adapter = new ProductAdapter(getContext(), productList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
