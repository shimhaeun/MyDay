package org.ict.myday;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    MutableLiveData<Object> mCalendar = new MutableLiveData<>();

    public void setCalendar() {
        GregorianCalendar cal = new GregorianCalendar(); // 오늘 날짜

        ArrayList<Object> calendarList = new ArrayList<>();

        for(int i = -300; i < 300; i++) {
            try{
                GregorianCalendar calendar
                        = new GregorianCalendar(cal.get(Calendar.YEAR),
                                        cal.get(Calendar.MONTH) + i,
                                    1, 0, 0, 0);

                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
                int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                for(int j = 0; j < dayOfWeek; j++) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public CalendarFragment() {
        // Required empty public constructor
    }

    public static CalendarFragment newInstance(String param1, String param2) {
        CalendarFragment fragment = new CalendarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }
}