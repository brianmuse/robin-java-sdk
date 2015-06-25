package com.robinpowered.sdk.model;

import com.google.common.base.Objects;

/**
 * A collection of spaces. Most commonly a building or floor.
 *
 * <p>
 * Physically speaking, a location is typically an office or a building and can be associated to a
 * specific physical address.
 */
public class Location implements IdentifiableApiResponseModel {

    /**
     * Constants
     */

    public static final String MIME_TYPE = "vnd.robinpowered.location.v1";


    /**
     * Properties
     */

    // Immutable
    private final int id;
    private final int accountId;

    // Mutable
    private String name;
    private String description;
    private String address;
    private String image;
    private Float longitude;
    private Float latitude;


    /**
     * Methods
     */

    public Location(int id, int accountId) {
        this.id = id;
        this.accountId = accountId;
    }

    @Override
    public int getId() {
        return id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equal(id, location.id) &&
                Objects.equal(accountId, location.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, accountId);
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", image='" + image + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public String getMimeType() {
        return MIME_TYPE;
    }
}
