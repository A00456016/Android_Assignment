package com.example.android_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class HotelSearchFragment extends Fragment {

    View view;
    TextView titleTextView, checkInTextView, checkOutTextView;
    DatePicker checkInDatePicker, checkOutDatePicker;
    EditText guestCountEditText;
    Button searchButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.hotel_search_layout)
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        titleTextView = view.findViewById(R.id.title_text_view);
        checkInTextView = view.findViewById(R.id.check_in_text_view);
        checkOutTextView = view.findViewById(R.id.check_out_text_view);
        checkInDatePicker = view.findViewById(R.id.check_in_date_picker);

        searchButton = view.findViewById(R.id.search_button_book);
        guestCountEditText = view.findViewById(R.id.guest_count_edit_text);

        numberOfGuests = guestCountEditText.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("check in date", checkInDate);
        bundle.putString("check out date", checkOutDate);
        bundle.putString("number of guests", numberOfGueats);
        HotelListFragment hotelListFragment = new HotelListFragment();
        hotelListFragment.setArguments(bundle);


    }

    searchButton.setOnClickListner(new View.OnClickListner(){
        @Override
        public void onClick(View view){

        }
    });

    private String getDateFromCalendar(DatePicker datePicker){

        int day = datePicker.getDayOfMonth();
        int month = datePicker.getDayOfMonth();
        int year = datePicker.getYear();

        Calendar calendar = Calendar.getInstance();

    }
}


