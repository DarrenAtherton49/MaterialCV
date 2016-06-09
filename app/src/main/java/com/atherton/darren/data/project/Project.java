
package com.atherton.darren.data.project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Project {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("images")
    @Expose
    private List<String> images = new ArrayList<>();
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<>();

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
     *     The type of project
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type of project
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The title of the project
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title of the project
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     A description of the project
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     A description of the project
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     A list of images associated with the project
     */
    public List<String> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     A list of images associated with the project
     */
    public void setImages(List<String> images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     A list of links associated with the project
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     A list of links associated with the project
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
