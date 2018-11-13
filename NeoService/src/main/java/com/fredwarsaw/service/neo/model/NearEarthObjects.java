package com.fredwarsaw.service.neo.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NearEarthObjects {

	private static final List<CloseApproachDate> CloseApproachDate = null;
	private Links links;
    @SerializedName("neo_reference_id")
    private String neoReferenceid;
    private String name;
    @SerializedName("close_approach_date")
    private List<CloseApproachDate> closeApproachDate;

    public Links getLinks() {
        return links;
    }

    public String getNeoReferenceid() {
        return neoReferenceid;
    }

    public String getName() {
        return name;
    }

    public List<CloseApproachDate> getCloseApproachData() {
        return CloseApproachDate;
    }

    private static class CloseApproachDate {

        @SerializedName("close_approach_date")
        private String closeApproachDate;

        public String getCloseApproachDate() {
            return closeApproachDate;
        }
    }

}
