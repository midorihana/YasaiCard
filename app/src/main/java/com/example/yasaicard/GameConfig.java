package com.example.yasaicard;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class GameConfig extends Fragment {

    private RadioGroup sideRadioGroup;
    private RadioButton leftRadioBtn;
    private RadioButton rightRadioBtn;

    private SeekBar itemNumberSeekBar;
    private TextView itemNumberTextView;

    private CheckBox timeTrialActiveCheckBox;
    private CheckBox timeTrialResetCheckBox;
    private LinearLayout timeTrialSeekBarLayout;
    private SeekBar timeTrialTimeSeekBar;
    private TextView timeTrialTimeTextView;

    private Button startButton;

    public static GameConfig newInstance() {
        return new GameConfig();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.game_config_fragment, container, false);
        assignViews(view);
        setUpViews();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void setUpViews() {
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO ((GameActivity)getActivity()).startGame(cfgContainer);
            }
        });
    }

    private void assignViews(View view) {
        sideRadioGroup = view.findViewById(R.id.sideRadioGroup);
        leftRadioBtn = view.findViewById(R.id.radioButtonLeft);
        rightRadioBtn = view.findViewById(R.id.radioButtonRight);

        itemNumberSeekBar = view.findViewById(R.id.numberOfListItemsSlider);
        itemNumberTextView = view.findViewById(R.id.numberOfListItemsSliderLabel);

        timeTrialActiveCheckBox = view.findViewById(R.id.timeTrialActive);
        timeTrialSeekBarLayout = view.findViewById(R.id.layoutTimeSlider);
        timeTrialResetCheckBox = view.findViewById(R.id.timeTrialReset);
        timeTrialTimeSeekBar = view.findViewById(R.id.timeSlider);
        timeTrialTimeTextView = view.findViewById(R.id.timeSliderLabel);

        startButton = view.findViewById(R.id.startBtn);
    }
}
