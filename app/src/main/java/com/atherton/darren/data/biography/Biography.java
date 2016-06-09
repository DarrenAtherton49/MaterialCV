
package com.atherton.darren.data.biography;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Biography {

    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("profileImage")
    @Expose
    private String profileImage;
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("locations")
    @Expose
    private List<String> locations = new ArrayList<>();
    @SerializedName("interests")
    @Expose
    private List<Interest> interests = new ArrayList<>();
    @SerializedName("technicalSkills")
    @Expose
    private List<String> technicalSkills = new ArrayList<>();
    @SerializedName("generalSkills")
    @Expose
    private List<String> generalSkills = new ArrayList<>();

    /**
     * 
     * @return
     *     The user's full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The user's full name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 
     * @return
     *     The user's current job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 
     * @param jobTitle
     *     The user's current job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 
     * @return
     *     The user's profile image
     */
    public String getProfileImage() {
        return profileImage;
    }

    /**
     * 
     * @param profileImage
     *     The user's profile image
     */
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * 
     * @return
     *     The user's headline
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * 
     * @param headline
     *     The user's headline
     */
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    /**
     * 
     * @return
     *     A list of the user's current locations
     */
    public List<String> getLocations() {
        return locations;
    }

    /**
     * 
     * @param locations
     *     A list of the user's current locations
     */
    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    /**
     * 
     * @return
     *     A list of the user's interests
     */
    public List<Interest> getInterests() {
        return interests;
    }

    /**
     * 
     * @param interests
     *     A list of the user's interests
     */
    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    /**
     * 
     * @return
     *     A list of the user's technical skills
     */
    public List<String> getTechnicalSkills() {
        return technicalSkills;
    }

    /**
     * 
     * @param technicalSkills
     *     A list of the user's technical skills
     */
    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    /**
     * 
     * @return
     *     A list of the user's general skills
     */
    public List<String> getGeneralSkills() {
        return generalSkills;
    }

    /**
     * 
     * @param generalSkills
     *     A list of the user's general skills
     */
    public void setGeneralSkills(List<String> generalSkills) {
        this.generalSkills = generalSkills;
    }

}
