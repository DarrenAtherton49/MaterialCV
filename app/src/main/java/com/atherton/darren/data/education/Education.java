
package com.atherton.darren.data.education;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Education {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("courseTitle")
    @Expose
    private String courseTitle;
    @SerializedName("award")
    @Expose
    private String award;
    @SerializedName("institution")
    @Expose
    private String institution;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("dissertation")
    @Expose
    private String dissertation;
    @SerializedName("courses")
    @Expose
    private List<String> courses = new ArrayList<>();
    @SerializedName("activities")
    @Expose
    private List<String> activities = new ArrayList<>();

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
     *     The type of course
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type of course
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The title of the course
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * 
     * @param courseTitle
     *     The title of the course
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    /**
     * 
     * @return
     *     The award received
     */
    public String getAward() {
        return award;
    }

    /**
     * 
     * @param award
     *     The award received
     */
    public void setAward(String award) {
        this.award = award;
    }

    /**
     * 
     * @return
     *     The institution attended
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * 
     * @param institution
     *     The institution attended
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    /**
     * 
     * @return
     *     A description of the course
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     A description of the course
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The start date of the course
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The start date of the course
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The end date of the course
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The end date of the course
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     A description of the dissertation produced during the course
     */
    public String getDissertation() {
        return dissertation;
    }

    /**
     * 
     * @param dissertation
     *     A description of the dissertation produced during the course
     */
    public void setDissertation(String dissertation) {
        this.dissertation = dissertation;
    }
}
