package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Contacto;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:52.518Z[GMT]")public abstract class ContactosApiService {
    public abstract Response addContact(Contacto body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteContact(Long contactId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response findClosest(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getContacts(SecurityContext securityContext) throws NotFoundException;
}
