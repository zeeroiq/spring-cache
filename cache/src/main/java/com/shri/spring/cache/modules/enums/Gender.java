package com.shri.spring.cache.modules.enums;

public enum  Gender {
    MALE ("0"),
    FEMALE("1"),
    TRANSGENDER("2");

    private final String genderId;
    private Gender(String id) {
        this.genderId = id;
    }

    public String getGender() {
        return genderId;
    }
}
