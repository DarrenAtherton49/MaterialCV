
package com.atherton.darren.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserProfile {

    @SerializedName("bio")
    @Expose
    private Bio bio;
    @SerializedName("education")
    @Expose
    private List<Education> education = new ArrayList<>();
    @SerializedName("projects")
    @Expose
    private List<Project> projects = new ArrayList<>();
    @SerializedName("experience")
    @Expose
    private List<Experience> experience = new ArrayList<>();
    @SerializedName("contact")
    @Expose
    private Contact contact;

    /**
     * 
     * @return
     *     The biography section of the user profile
     */
    public Bio getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The biography section of the user profile
     */
    public void setBio(Bio bio) {
        this.bio = bio;
    }

    /**
     * 
     * @return
     *     The education section of the user profile
     */
    public List<Education> getEducation() {
        return education;
    }

    /**
     * 
     * @param education
     *     The education section of the user profile
     */
    public void setEducation(List<Education> education) {
        this.education = education;
    }

    /**
     * 
     * @return
     *     The projects section of the user profile
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     * 
     * @param projects
     *     The projects section of the user profile
     */
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    /**
     * 
     * @return
     *     The experience section of the user profile
     */
    public List<Experience> getExperience() {
        return experience;
    }

    /**
     * 
     * @param experience
     *     The experience section of the user profile
     */
    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    /**
     * 
     * @return
     *     The contact section of the user profile
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact section of the user profile
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
