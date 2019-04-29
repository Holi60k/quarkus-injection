package org.acme.rest.json;

import javax.enterprise.inject.Model;

@Model
public class UserAction {

    public String getUser() {
        return "adminUser";
    }

}
