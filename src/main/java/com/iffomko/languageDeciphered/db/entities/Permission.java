package com.iffomko.languageDeciphered.db.entities;

public enum Permission {
    GET_ANALYSIS("get:analysis"),
    ADMIN("admin:all");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
