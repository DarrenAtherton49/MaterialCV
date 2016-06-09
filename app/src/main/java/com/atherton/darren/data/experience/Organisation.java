
package com.atherton.darren.data.experience;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organisation {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The name of the organisation
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name of the organisation
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     A description of the organisation
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 
     * @param overview
     *     A description of the organisation
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * 
     * @return
     *     A link to the organisations web page
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     A link to the organisations web page
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
