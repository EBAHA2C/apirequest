package com.example.apison;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MultipleResource {

    @SerializedName("data")
    public List<Datum> data;
    @SerializedName("headers")
    public String headers;
    @SerializedName("httpStatus")
    public String httpStatus;
    @SerializedName("messages")
    public List<String> messages;

    public class Datum {
        @SerializedName("id")
        @Expose
        public String id;

        @SerializedName("careSetting")
        @Expose
        public String careSetting;

        @SerializedName("reasonCodeDisplay")
        @Expose
        public String reasonCodeDisplay;

        @SerializedName("organizationName")
        @Expose
        public String organizationName;

        @SerializedName("healthcareServiceName")
        @Expose
        public String healthcareServiceName;

        @SerializedName("physicianNames")
        @Expose
        public String physicianNames;

        @SerializedName("evaluation")
        @Expose
        public Object evaluation;

        @SerializedName("encounterAddressDTO")
        @Expose
        public Object encounterAddressDTO;

        @SerializedName("admissionDate")
        @Expose
        public String admissionDate;

        @SerializedName("dischargeDate")
        @Expose
        public String dischargeDate;
    }
}