package io.swagger.api.factories;

import io.swagger.api.ContactosApiService;
import io.swagger.api.impl.ContactosApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:52.518Z[GMT]")public class ContactosApiServiceFactory {
    private final static ContactosApiService service = new ContactosApiServiceImpl();

    public static ContactosApiService getContactosApi() {
        return service;
    }
}
