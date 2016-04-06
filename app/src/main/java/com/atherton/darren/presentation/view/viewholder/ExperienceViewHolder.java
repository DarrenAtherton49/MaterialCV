package com.atherton.darren.presentation.view.viewholder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.atherton.darren.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ExperienceViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.card_image_item_experience) public ImageView experienceImageView;
    @Bind(R.id.textview_title_item_experience) public TextView titleTextView;
    @Bind(R.id.textview_organisation_item_experience) public TextView organisationTextView;
    @Bind(R.id.textview_date_item_experience) public TextView dateTextView;
    @Bind(R.id.button_organisation_link_item_experience) public Button organisationLinkButton;

    public ExperienceViewHolder(View experienceItemView) {
        super(experienceItemView);
        ButterKnife.bind(this, experienceItemView);
    }
}