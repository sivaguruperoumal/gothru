/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KeepGoing.RestServices.Utility;

import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.sun.jersey.spi.container.ResourceFilter;

/**
 *
 * @author arunmozhi
 */
public class KeepGoingRequestFilter implements ResourceFilter, ContainerRequestFilter {

    @Override
    public ContainerRequest filter(ContainerRequest cr) {
        return cr;
    }

    public ContainerRequestFilter getRequestFilter() {
        return this;
    }

    public ContainerResponseFilter getResponseFilter() {
        return null;
    }

}
