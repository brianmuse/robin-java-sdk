package com.robinpowered.sdk.model;

import com.google.common.base.Objects;
import org.joda.time.DateTime;

/**
 * A user model.
 */
public class User extends Account implements IdentifiableApiResponseModel {

    /**
     * Constants
     */

    public static final String MIME_TYPE = "vnd.robinpowered.user.v1";


    /**
     * Properties
     */

    // Immutable
    private final boolean isPending;

    // Immutable Submodels
    private final Email primaryEmail;


    /**
     * Methods
     */

    public User(int id, String slug, boolean isPending, Email primaryEmail, DateTime createdAt, DateTime updatedAt) {
        super(id, slug, false, createdAt, updatedAt);

        this.isPending = isPending;
        this.primaryEmail = primaryEmail;
    }

    public Email getPrimaryEmail() {
        return primaryEmail;
    }

    public boolean isPending() {
        return isPending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equal(isPending, user.isPending) &&
                Objects.equal(primaryEmail, user.primaryEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), isPending, primaryEmail);
    }

    @Override
    public String toString() {
        return "User{" +
                "primaryEmail=" + primaryEmail +
                ", isPending=" + isPending +
                "} " + super.toString();
    }

    @Override
    public String getMimeType() {
        return MIME_TYPE;
    }

    /**
     * An email address belonging to a user.
     */
    public static class Email implements ApiResponseModel {

        /**
         * Constants
         */

        public static final String MIME_TYPE = "vnd.robinpowered.email.v1";


        /**
         * Properties
         */

        // Immutable
        private final String email;
        private boolean isVerified;

        /**
         * Methods
         */

        public Email(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public Boolean isVerified() {
            return isVerified;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Email email1 = (Email) o;
            return Objects.equal(isVerified, email1.isVerified) &&
                    Objects.equal(email, email1.email);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(email, isVerified);
        }

        @Override
        public String toString() {
            return email;
        }

        @Override
        public String getMimeType() {
            return Email.MIME_TYPE;
        }
    }
}