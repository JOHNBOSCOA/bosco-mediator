package tz.go.moh.him.johnbosco;

import com.google.gson.annotations.SerializedName;

public class SourceMessage {
    String Fac_IDNumber;

    @SerializedName(value = "name", alternate = {"Name"})
    String Name;
    String Comm_FacName;

    @SerializedName(value = "zone", alternate = {"Zone"})
    String Zone;
    String Region_Code;
    @SerializedName(value = "region", alternate = {"Region"})
    String Region;
    String District_Code;
    @SerializedName(value = "district", alternate = {"District"})
    String District;
    String Council_Code;
    @SerializedName(value = "council", alternate = {"Council"})
    String Council;
    @SerializedName(value = "ward", alternate = {"Ward"})
    String Ward;
    String Village;
    String FacilityTypeGroupCode;
    String FacilityTypeGroup;
    String FacilityTypeCode;
    String FacilityType;
    String OwnershipGroupCode;
    String OwnershipGroup;
    String OwnershipCode;
    String Ownership;
    String OperatingStatus;
    @SerializedName(value = "latitude", alternate = {"Latitude"})
    String Latitude;
    String Longitude;
    String RegistrationStatus;
    String OpenedDate;
    String CreatedAt;
    String UpdatedAt;
    public String getFac_IDNumber() {
        return Fac_IDNumber;
    }

    public void setFac_IDNumber(String fac_IDNumber) {
        Fac_IDNumber = fac_IDNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getComm_FacName() {
        return Comm_FacName;
    }

    public void setComm_FacName(String comm_FacName) {
        Comm_FacName = comm_FacName;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String zone) {
        Zone = zone;
    }

    public String getRegion_Code() {
        return Region_Code;
    }

    public void setRegion_Code(String region_Code) {
        Region_Code = region_Code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDistrict_Code() {
        return District_Code;
    }

    public void setDistrict_Code(String district_Code) {
        District_Code = district_Code;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCouncil_Code() {
        return Council_Code;
    }

    public void setCouncil_Code(String council_Code) {
        Council_Code = council_Code;
    }

    public String getCouncil() {
        return Council;
    }

    public void setCouncil(String council) {
        Council = council;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public String getFacilityTypeGroupCode() {
        return FacilityTypeGroupCode;
    }

    public void setFacilityTypeGroupCode(String facilityTypeGroupCode) {
        FacilityTypeGroupCode = facilityTypeGroupCode;
    }

    public String getFacilityTypeGroup() {
        return FacilityTypeGroup;
    }

    public void setFacilityTypeGroup(String facilityTypeGroup) {
        FacilityTypeGroup = facilityTypeGroup;
    }

    public String getFacilityTypeCode() {
        return FacilityTypeCode;
    }

    public void setFacilityTypeCode(String facilityTypeCode) {
        FacilityTypeCode = facilityTypeCode;
    }

    public String getFacilityType() {
        return FacilityType;
    }

    public void setFacilityType(String facilityType) {
        FacilityType = facilityType;
    }

    public String getOwnershipGroupCode() {
        return OwnershipGroupCode;
    }

    public void setOwnershipGroupCode(String ownershipGroupCode) {
        OwnershipGroupCode = ownershipGroupCode;
    }

    public String getOwnershipGroup() {
        return OwnershipGroup;
    }

    public void setOwnershipGroup(String ownershipGroup) {
        OwnershipGroup = ownershipGroup;
    }

    public String getOwnershipCode() {
        return OwnershipCode;
    }

    public void setOwnershipCode(String ownershipCode) {
        OwnershipCode = ownershipCode;
    }

    public String getOwnership() {
        return Ownership;
    }

    public void setOwnership(String ownership) {
        Ownership = ownership;
    }

    public String getOperatingStatus() {
        return OperatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        OperatingStatus = operatingStatus;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        RegistrationStatus = registrationStatus;
    }

    public String getOpenedDate() {
        return OpenedDate;
    }

    public void setOpenedDate(String openedDate) {
        OpenedDate = openedDate;
    }

    public String getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        CreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        UpdatedAt = updatedAt;
    }


    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }


}
