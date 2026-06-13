package com.samankhalid.expensetracker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etTitle, etAmount;
    Button btnAdd;
    TextView tvTotal;
    ListView listView;

    ArrayList<Expense> expenseList;
    ExpenseAdapter adapter;

    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        etTitle = findViewById(R.id.etTitle);
        etAmount = findViewById(R.id.etAmount);
        btnAdd = findViewById(R.id.btnAdd);
        tvTotal = findViewById(R.id.tvTotal);
        listView = findViewById(R.id.listView);

        expenseList = new ArrayList<>();

        adapter = new ExpenseAdapter(this, expenseList);
        listView.setAdapter(adapter);

        btnAdd.setOnClickListener(v -> {

            String title = etTitle.getText().toString();
            String amountText = etAmount.getText().toString();

            if (title.isEmpty() || amountText.isEmpty()) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            double amount = Double.parseDouble(amountText);

            Expense expense = new Expense(title, amount);
            expenseList.add(expense);

            total += amount;
            tvTotal.setText("Total: Rs " + total);

            adapter.notifyDataSetChanged();

            etTitle.setText("");
            etAmount.setText("");
        });

        listView.setOnItemLongClickListener((parent, view, position, id) -> {

            total -= expenseList.get(position).getAmount();
            expenseList.remove(position);

            adapter.notifyDataSetChanged();
            tvTotal.setText("Total: Rs " + total);

            return true;
        });
    }
}