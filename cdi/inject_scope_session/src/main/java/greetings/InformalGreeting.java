/*
 * Copyright 2009 Sun Microsystems, Inc.
 * All rights reserved.  You may not modify, use,
 * reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://developer.sun.com/berkeley_license.html
 */


package greetings;

import java.io.Serializable;

@Informal
public class InformalGreeting extends Greeting implements Serializable{
    public String greet(String name) {
        return "Hi, " + name + "!";
    }
}
