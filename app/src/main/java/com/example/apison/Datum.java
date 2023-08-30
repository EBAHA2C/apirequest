package com.example.apison;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("careSetting")
    @Expose
    private String careSetting;

    @SerializedName("reasonCodeDisplay")
    @Expose
    private String reasonCodeDisplay;

    @SerializedName("organizationName")
    @Expose
    private String organizationName;

    @SerializedName("healthcareServiceName")
    @Expose
    private String healthcareServiceName;

    @SerializedName("physicianNames")
    @Expose
    private String physicianNames;

    @SerializedName("evaluation")
    @Expose
    private Object evaluation;

    @SerializedName("encounterAddressDTO")
    @Expose
    private Object encounterAddressDTO;

    @SerializedName("admissionDate")
    @Expose
    private String admissionDate;

    @SerializedName("dischargeDate")
    @Expose
    private String dischargeDate;
}