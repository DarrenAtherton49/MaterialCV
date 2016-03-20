
package com.atherton.darren.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("linkedIn")
    @Expose
    private String linkedIn;
    @SerializedName("github")
    @Expose
    private String github;
    @SerializedName("email")
    @Expose
    private String email;

    /**
     * 
     * @return
     *     A link to the user's twitter account
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     A link to the user's twitter account
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * 
     * @return
     *     A link to the user's LinkedIn account
     */
    public String getLinkedIn() {
        return linkedIn;
    }

    /**
     * 
     * @param linkedIn
     *     A link to the user's LinkedIn account
     */
    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    /**
     * 
     * @return
     *     A link to the user's GitHub account
     */
    public String getGithub() {
        return github;
    }

    /**
     * 
     * @param github
     *     A link to the user's GitHub account
     */
    public void setGithub(String github) {
        this.github = github;
    }

    /**
     * 
     * @return
     *     The user's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The user's email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
