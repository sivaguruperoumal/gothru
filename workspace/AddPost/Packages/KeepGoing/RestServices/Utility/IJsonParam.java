/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package KeepGoing.RestServices.Utility;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 * @author arunmozhi
 */
@Documented
@Target(ElementType.PARAMETER)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface IJsonParam{
       String Value();
}
