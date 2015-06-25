package com.robinpowered.sdk.model;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

/**
 * A room or area in a location.
 *
 * <p>
 * Common examples include a "Conference Room" or "Lobby". Spaces are an important resource in that
 * they are the parent model of a {@link Device}, {@link Presence} or {@link Event}. The space model
 * contains references to the current and next events if they exist, as well as its parent location.
 */
public class Space implements IdentifiableApiResponseModel {

    /**
     * Constants
     */

    public static final String MIME_TYPE = "vnd.robinpowered.space.v1";


    /**
     * Properties
     */

    // Immutable
    private final int id;

    // Mutable
    private Integer locationId;
    private String name;
    private String description;
    private String image;
    private Float discoveryRadius;
    private Integer capacity;
    private Boolean isDisabled;
    private Boolean isDibsed;
    private DateTime updatedAt;
    private DateTime createdAt;
    private Location location;
    private Calendar calendar;
    private Event currentEvent;
    private Event nextEvent;


    /**
     * Methods
     */

    public Space(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Float getDiscoveryRadius() {
        return discoveryRadius;
    }

    public void setDiscoveryRadius(Float discoveryRadius) {
        this.discoveryRadius = discoveryRadius;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean isDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean isDibsed() {
        return isDibsed;
    }

    public void setIsDibsed(Boolean isDibsed) {
        this.isDibsed = isDibsed;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }

    public Event getNextEvent() {
        return nextEvent;
    }

    public void setNextEvent(Event nextEvent) {
        this.nextEvent = nextEvent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return Objects.equal(id, space.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Space{" +
                "id=" + id +
                ", locationId=" + locationId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", discoveryRadius=" + discoveryRadius +
                ", capacity=" + capacity +
                ", isDisabled=" + isDisabled +
                ", isDibsed=" + isDibsed +
                ", updatedAt=" + updatedAt +
                ", createdAt=" + createdAt +
                ", location=" + location +
                ", calendar=" + calendar +
                ", currentEvent=" + currentEvent +
                ", nextEvent=" + nextEvent +
                '}';
    }

    @Override
    public String getMimeType() {
        return MIME_TYPE;
    }
}
