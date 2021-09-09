package org.ada.school.utils;

public enum Constants {
     CLAIMS_ROLES_KEY("ada_roles"),
     COOKIE_NAME("ada-JWT"),
     TOKEN_DURATION_MINUTES("240");

    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
