
package com.atherton.darren.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Link {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The text to display for the link
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text to display for the link
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The url of the link
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url of the link
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
