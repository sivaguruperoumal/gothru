/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeepGoing.RestServices.Utility;

import KeepGoing.RestServices.Dto.FilterDtoBase;
import KeepGoing.RestServices.Utility.IJsonParam;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author arunmozhi
 */
public class UriParser<T extends FilterDtoBase> {

    UriInfo _uriInfo = null;

    public UriParser(UriInfo uriInfo) {
        _uriInfo = uriInfo;
    }

    public T Serialize() {
        Class<T> object =null;
        T TypedObject = null;
        try {
            TypedObject = object.newInstance();
            MultivaluedMap<String, String> queryParams = _uriInfo.getQueryParameters();
            Method[] methods = object.getMethods();
            for (Entry<String, List<String>> s : queryParams.entrySet()) {
                for (Method method : methods) {
                    IJsonParam annotation = method.getAnnotation(IJsonParam.class);
                    if (annotation != null) {
                        if (annotation.Value() == s.getKey()) {
                           method.invoke(s, null);
                        }
                    }
                }
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(UriParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UriParser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return TypedObject;
        }
    }
}
