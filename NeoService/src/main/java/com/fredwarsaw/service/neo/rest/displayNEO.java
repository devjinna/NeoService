package com.fredwarsaw.service.neo.rest;

import java.util.List;

import org.springframework.boot.actuate.endpoint.web.Link;

import com.google.gson.annotations.SerializedName;

public class displayNEO<Page> {

	private Link links;
    private Page page;
    @SerializedName("near_earth_objects")
    private List<NearEarthObjects> nearEarthObjects;

    public Link getLinks() {
        return links;
    }

    public Page getPage() {
        return page;
    }

    public List<NearEarthObjects> getNearEarthObjects() {
        return nearEarthObjects;
    }

}
