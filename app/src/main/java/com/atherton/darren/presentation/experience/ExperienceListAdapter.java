package com.atherton.darren.presentation.experience;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.atherton.darren.R;
import com.atherton.darren.data.experience.Experience;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

public class ExperienceListAdapter extends RecyclerView.Adapter<ExperienceViewHolder> {

    public interface OnItemClickListener {
        void onExperienceItemClicked(Experience experienceItem);
    }

    private final Context context;
    private final LayoutInflater layoutInflater;
    private OnItemClickListener onItemClickListener;

    private List<Experience> experienceList;

    @Inject
    public ExperienceListAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.experienceList = Collections.emptyList();
    }

    @Override public ExperienceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = this.layoutInflater.inflate(R.layout.item_experience, parent, false);
        return new ExperienceViewHolder(view);
    }

    @Override public void onBindViewHolder(ExperienceViewHolder viewHolder, int position) {
        final Experience experience = experienceList.get(position);

        viewHolder.titleTextView.setText(experience.getTitle());
        viewHolder.organisationTextView.setText(experience.getOrganisation().getName());
        viewHolder.dateTextView.setText(experience.getStartDate() + " - " + experience.getEndDate());
        viewHolder.organisationLinkButton.setText(experience.getOrganisation().getUrl()); // todo add click listener to go to url (via interface callback first to fragment)

        // todo Load image into viewHolder.experienceImageView using Glide w/ context (use correct context - look at cheat sheet)

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if (ExperienceListAdapter.this.onItemClickListener != null) {
                    ExperienceListAdapter.this.onItemClickListener.onExperienceItemClicked(experience);
                }
            }
        });
    }

    @Override public int getItemViewType(int position) {
        return 0;
    }

    @Override public int getItemCount() {
        return (experienceList != null) ? experienceList.size() : 0;
    }

    public void setOnItemClickListener (OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.validateExperienceList(experienceList);
        this.experienceList = experienceList;
        this.notifyDataSetChanged();
    }

    private void validateExperienceList(List<Experience> experienceList) {
        if (experienceList == null) {
            throw new IllegalArgumentException("Experience list cannot be null");
        }
    }
}
