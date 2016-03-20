
package com.atherton.darren.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Experience {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("organisation")
    @Expose
    private Organisation organisation;
    @SerializedName("detail")
    @Expose
    private List<String> detail = new ArrayList<>();
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("images")
    @Expose
    private List<String> images = new ArrayList<>();

    /**
     * 
     * @return
     *     An index used for ordering
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     An index used for ordering
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The job title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The job title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The organisation for which the work was undertaken
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * 
     * @param organisation
     *     The organisation for which the work was undertaken
     */
    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    /**
     * 
     * @return
     *     A list describing the job role and responsibilities
     */
    public List<String> getDetail() {
        return detail;
    }

    /**
     * 
     * @param detail
     *     A list describing the job role and responsibilities
     */
    public void setDetail(List<String> detail) {
        this.detail = detail;
    }

    /**
     * 
     * @return
     *     The job start date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The job start date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The job end date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The job end date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     A list of images associated with the experience
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     A list of images associated with the experience
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

}
