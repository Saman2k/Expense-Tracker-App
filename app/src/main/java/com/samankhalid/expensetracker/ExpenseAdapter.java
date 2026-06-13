package com.samankhalid.expensetracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExpenseAdapter extends ArrayAdapter<Expense> {

    public ExpenseAdapter(Context context, ArrayList<Expense> expenses) {
        super(context, 0, expenses);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_expense, parent, false);
        }

        Expense expense = getItem(position);

        TextView txtExpense = convertView.findViewById(R.id.txtExpense);

        txtExpense.setText(
                expense.getTitle() + " - Rs " + expense.getAmount()
        );

        return convertView;
    }
}