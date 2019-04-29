package org.acme.rest.json;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@Model
public class UserResource implements IUserResource {

    @Inject
    UserAction userAction;

    @Override
    public Response getUser() {
        return Response.ok(userAction.getUser()).build();
    }
}
