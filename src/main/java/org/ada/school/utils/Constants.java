package org.ada.school.utils;

public enum Constants {
     CLAIMS_ROLES_KEY("roles"),
     COOKIE_NAME("cookieTest"),
     TOKEN_DURATION_MINUTES("180");

    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
