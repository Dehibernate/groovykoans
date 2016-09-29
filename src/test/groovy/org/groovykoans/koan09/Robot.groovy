/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper
import java.util.regex.Matcher

class Robot {
    // ------------ START EDITING HERE ----------------------
    int x
    int y
    
    def left(){ x-- }
    def right(){ x++ }
    def up(){ y++ }
    def down(){ y-- }    
    
    def invokeMethod(String name, Object args) {
        if(name ==~ ~/go(Left|Right|Up|Down)*/){
            name.eachMatch(/Left|Right|Up|Down/) { String s ->
                switch(s){
                case 'Left': 
                    left()
                    break;
                case 'Right': 
                    right()
                    break;
                case 'Up': 
                    up()
                    break;
                case 'Down': 
                    down()
                    break;
                }
            }
        }
    }
    // ------------ STOP EDITING HERE  ----------------------
}
