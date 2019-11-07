package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ContactosApiService;
import io.swagger.api.factories.ContactosApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.Contacto;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/contactos")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:52.518Z[GMT]")public class ContactosApi  {
   private final ContactosApiService delegate;

   public ContactosApi(@Context ServletConfig servletContext) {
      ContactosApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ContactosApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ContactosApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ContactosApiServiceFactory.getContactosApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json", "application/xml" })
    
    @Operation(summary = "Añade un nuevo contacto conocido al listado", description = "Añade un nuevo contacto conocido al listado", tags={ "contactos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error") })
    public Response addContact(@Parameter(description = "Contacto que se va a añadir a la lista" ,required=true) Contacto body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addContact(body,securityContext);
    }
    @DELETE
    @Path("/{contactId}")
    
    
    @Operation(summary = "Borra un contacto conocido", description = "Borra un contacto conocido", tags={ "contactos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "ID no valido"),
        
        @ApiResponse(responseCode = "404", description = "Contacto no encontrado"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error") })
    public Response deleteContact(@Parameter(description = "",required=true) @PathParam("contactId") Long contactId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteContact(contactId,securityContext);
    }
    @GET
    @Path("/buscarCercano")
    
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Busca el contacto más cercano", description = "Busca el contacto más cercano", tags={ "contactos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Contacto cercano encontrado", content = @Content(schema = @Schema(implementation = Contacto.class))),
        
        @ApiResponse(responseCode = "404", description = "Contacto cercano no encontrado"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error") })
    public Response findClosest(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findClosest(securityContext);
    }
    @GET
    
    
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Devuelve la lista de contactos", description = "Devuelve la lista de contactos", tags={ "contactos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Contacto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Invalid status value"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error") })
    public Response getContacts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getContacts(securityContext);
    }
}
