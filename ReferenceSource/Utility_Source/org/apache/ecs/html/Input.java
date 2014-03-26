/*
 * Copyright (c) 1999 The Java Apache Project.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. All advertising materials mentioning features or use of this
 *    software must display the following acknowledgment:
 *    "This product includes software developed by the Java Apache 
 *    Project. <http://java.apache.org/>"
 *
 * 4. The names "Java Apache Element Construction Set", "Java Apache ECS" and 
 *    "Java Apache Project" must not be used to endorse or promote products 
 *    derived from this software without prior written permission.
 *
 * 5. Products derived from this software may not be called 
 *    "Java Apache Element Construction Set" nor "Java Apache ECS" appear 
 *    in their names without prior written permission of the 
 *    Java Apache Project.
 *
 * 6. Redistributions of any form whatsoever must retain the following
 *    acknowledgment:
 *    "This product includes software developed by the Java Apache 
 *    Project. <http://java.apache.org/>"
 *    
 * THIS SOFTWARE IS PROVIDED BY THE JAVA APACHE PROJECT "AS IS" AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE JAVA APACHE PROJECT OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Java Apache Project. For more information
 * on the Java Apache Project please see <http://java.apache.org/>.
 *
 */
package org.apache.ecs.html;

import org.apache.ecs.*;

/**
    This class creates a &lt;Input&gt; tag.

    @version $Id: Input.java,v 1.6 1999/12/23 22:31:59 jonbolt Exp $
    @author <a href="mailto:snagy@servletapi.com">Stephan Nagy</a>
    @author <a href="mailto:jon@clearink.com">Jon S. Stevens</a>
*/
public class Input extends SinglePartElement implements Printable, 
  FormEvents, PageEvents, FocusEvents, MouseEvents, KeyEvents
{
    public static final String TEXT = "TEXT";
    public static final String PASSWORD = "PASSWORD";
    public static final String CHECKBOX = "CHECKBOX";
    public static final String RADIO = "RADIO";
    public static final String FILE = "FILE";
    public static final String BUTTON = "BUTTON";
    public static final String IMAGE = "IMAGE";
    public static final String HIDDEN = "HIDDEN";
    public static final String SUBMIT = "SUBMIT";
    public static final String RESET = "RESET";

    public static final String text = "text";
    public static final String password = "password";
    public static final String checkbox = "checkbox";
    public static final String radio = "radio";
    public static final String file = "file";
    public static final String button = "button";
    public static final String image = "image";
    public static final String hidden = "hidden";
    public static final String submit = "submit";
    public static final String reset = "reset";

    /**
        Private initialization routine.
    */
    {
        setElementType("input");
    }
    
    /**
        Basic constructor. Use the set* methods to set the values
        of the attributes.
    */
    public Input()
    {
    }
    
    /**
        Basic constructor. Use the set* methods to set the values
        of the attributes.
    */
    public Input(String type, String name, String value)
    {
        setType(type);
        setName(name);
        setValue(value);
    }

    /**
        Basic constructor. Use the set* methods to set the values
        of the attributes.
    */
    public Input(String type, String name, int value)
    {
        setType(type);
        setName(name);
        setValue(value);
    }

    /**
        Basic constructor. Use the set* methods to set the values
        of the attributes.
    */
    public Input(String type, String name, Integer value)
    {
        setType(type);
        setName(name);
        setValue(value);
    }

    /**
        Basic constructor. Use the set* methods to set the values
        of the attributes.
    */
    public Input(String type, String name, double value)
    {
        setType(type);
        setName(name);
        setValue(value);
    }

    /**
        Sets the TYPE="" attribute
        @param   type  the TYPE="" attribute
    */
    public Input setType(String type)
    {
        addAttribute("type",type);
        return this;
    }

    /**
        Sets the SRC="" attribute
        @param   src  the SRC="" attribute
    */
    public Input setSrc(String src)
    {
        addAttribute("src",src);
        return this;
    }
    
    /**
        Sets the BORDER="" attribute
        @param   border  the BORDER="" attribute
    */
    public Input setBorder(int border)
    {
        addAttribute("border", Integer.toString(border));
        return this;
    }

    /**
        Sets the ALT="" attribute
        @param   alt  the ALT="" attribute
    */
    public Input setAlt(String alt)
    {
        addAttribute("alt",alt);
        return this;
    }

    /**
        Sets the NAME="" attribute
        @param   name  the NAME="" attribute
    */
    public Input setName(String name)
    {
        addAttribute("name",name);
        return this;
    }
    
    /**
        Sets the VALUE="" attribute
        @param   value  the VALUE="" attribute
    */
    public Input setValue(String value)
    {
        addAttribute("value",value);
        return this;
    }
    
    /**
        Sets the VALUE="" attribute
        @param   value  the VALUE="" attribute
    */
    public Input setValue(int value)
    {
        addAttribute("value",Integer.toString(value));
        return this;
    }

    /**
        Sets the VALUE="" attribute
        @param   value  the VALUE="" attribute
    */
    public Input setValue(Integer value)
    {
        addAttribute("value",value.toString());
        return this;
    }

    /**
        Sets the VALUE="" attribute
        @param   value  the VALUE="" attribute
    */
    public Input setValue(double value)
    {
        addAttribute("value",Double.toString(value));
        return this;
    }

    /**
        Sets the ACCEPT="" attribute
        @param   accept  the ACCEPT="" attribute
    */
    public Input setAccept(String accept)
    {
        addAttribute("accept",accept);
        return this;
    }
    
    /**
        Sets the SIZE="" attribute
        @param   size  the SIZE="" attribute
    */
    public Input setSize(String size)
    {
        addAttribute("size",size);
        return this;
    }
    
    /**
        Sets the SIZE="" attribute
        @param   size  the SIZE="" attribute
    */
    public Input setSize(int size)
    {
        setSize(Integer.toString(size));
        return this;
    }
    
    /**
        Sets the MAXLENGTH="" attribute
        @param   maxlength  the MAXLENGTH="" attribute
    */
    public Input setMaxlength(String maxlength)
    {
        addAttribute("maxlength",maxlength);
        return this;
    }
    
    /**
        Sets the MAXLENGTH="" attribute
        @param   maxlength  the MAXLENGTH="" attribute
    */
    public Input setMaxlength(int maxlength)
    {
        setMaxlength(Integer.toString(maxlength));
        return this;
    }
    
    /**
        Sets the USEMAP="" attribute
        @param   usemap  the USEMAP="" attribute
    */
    public Input setUsemap(String usemap)
    {
        addAttribute("usemap",usemap);
        return this;
    }
    
    /**
        Sets the TABINDEX="" attribute
        @param   alt  the TABINDEX="" attribute
    */
    public Input setTabindex(String index)
    {
        addAttribute("tabindex",index);
        return this;
    }
    
    /**
        Sets the TABINDEX="" attribute
        @param   alt  the TABINDEX="" attribute
    */
    public Input setTabindex(int index)
    {
        setTabindex(Integer.toString(index));
        return this;
    }
    
    /**
        Sets the checked value
        @param   checked  true or false
    */
    public Input setChecked(boolean checked)
    {
        if ( checked == true )
            addAttribute("checked", NO_ATTRIBUTE_VALUE);
        else
            removeAttribute("checked");
            
        return(this);
    }

    /**
        Sets the readonly value
        @param   readonly  true or false
    */
    public Input setReadOnly(boolean readonly)
    {
        if ( readonly == true )
            addAttribute("readonly", NO_ATTRIBUTE_VALUE);
        else
            removeAttribute("readonly");
            
        return(this);
    }

    /**
        Sets the disabled value
        @param   disabled  true or false
    */
    public Input setDisabled(boolean disabled)
    {
        if ( disabled == true )
            addAttribute("disabled", NO_ATTRIBUTE_VALUE);
        else
            removeAttribute("disabled");
            
        return(this);
    }

    /**
        Adds an Element to the element.
        @param  hashcode name of element for hash table
        @param  element Adds an Element to the element.
     */
    public Input addElement(String hashcode,Element element)
    {
        addElementToRegistry(hashcode,element);
        return(this);
    }

    /**
        Adds an Element to the element.
        @param  hashcode name of element for hash table
        @param  element Adds an Element to the element.
     */
    public Input addElement(String hashcode,String element)
    {
        addElementToRegistry(hashcode,element);
        return(this);
    }
    /**
        Adds an Element to the element.
        @param  element Adds an Element to the element.
     */
    public Input addElement(Element element)
    {
        addElementToRegistry(element);
        return(this);
    }

    /**
        Adds an Element to the element.
        @param  element Adds an Element to the element.
     */
    public Input addElement(String element)
    {
        addElementToRegistry(element);
        return(this);
    }
    /**
        Removes an Element from the element.
        @param hashcode the name of the element to be removed.
    */
    public Input removeElement(String hashcode)
    {
        removeElementFromRegistry(hashcode);
        return(this);
    }

    /**
        The onsubmit event occurs when a form is submitted. It only applies to
        the FORM element.
        
        @param The script
    */
    public void setOnSubmit(String script)
    {
        addAttribute ( "onSubmit", script );
    }

    /**
        The onreset event occurs when a form is reset. It only applies to the
        FORM element.
        
        @param The script
    */
    public void setOnReset(String script)
    {
        addAttribute ( "onReset", script );
    }

    /**
        The onselect event occurs when a user selects some text in a text
        field. This attribute may be used with the INPUT and TEXTAREA elements.
        
        @param The script
    */
    public void setOnSelect(String script)
    {
        addAttribute ( "onSelect", script );
    }

    /**
        The onchange event occurs when a control loses the input focus and its
        value has been modified since gaining focus. This attribute applies to
        the following elements: INPUT, SELECT, and TEXTAREA.
        
        @param The script
    */
    public void setOnChange(String script)
    {
        addAttribute ( "onChange", script );
    }

    /**
        The onload event occurs when the user agent finishes loading a window
        or all frames within a FRAMESET. This attribute may be used with BODY
        and FRAMESET elements.
        
        @param The script
    */
    public void setOnLoad(String script)
    {
        addAttribute ( "onLoad", script );
    }

    /**
        The onunload event occurs when the user agent removes a document from a
        window or frame. This attribute may be used with BODY and FRAMESET
        elements.
        
        @param The script
    */
    public void setOnUnload(String script)
    {
        addAttribute ( "onUnload", script );
    }

    /**
        The onfocus event occurs when an element receives focus either by the
        pointing device or by tabbing navigation. This attribute may be used
        with the following elements: LABEL, INPUT, SELECT, TEXTAREA, and
        BUTTON.
        
        @param The script
    */
    public void setOnFocus(String script)
    {
        addAttribute ( "onFocus", script );
    }

    /**
        The onblur event occurs when an element loses focus either by the
        pointing device or by tabbing navigation. It may be used with the same
        elements as onfocus.
        
        @param The script
    */
    public void setOnBlur(String script)
    {
        addAttribute ( "onBlur", script );
    }

    /**
        The onclick event occurs when the pointing device button is clicked
        over an element. This attribute may be used with most elements.
        
        @param The script
    */
    public void setOnClick(String script)
    {
        addAttribute ( "onClick", script );
    }
    /**
        The ondblclick event occurs when the pointing device button is double
        clicked over an element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnDblClick(String script)
    {
        addAttribute ( "onDblClick", script );
    }
    /**
        The onmousedown event occurs when the pointing device button is pressed
        over an element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnMouseDown(String script)
    {
        addAttribute ( "onMouseDown", script );
    }
    /**
        The onmouseup event occurs when the pointing device button is released
        over an element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnMouseUp(String script)
    {
        addAttribute ( "onMouseUp", script );
    }
    /**
        The onmouseover event occurs when the pointing device is moved onto an
        element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnMouseOver(String script)
    {
        addAttribute ( "onMouseOver", script );
    }
    /**
        The onmousemove event occurs when the pointing device is moved while it
        is over an element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnMouseMove(String script)
    {
        addAttribute ( "onMouseMove", script );
    }
    /**
        The onmouseout event occurs when the pointing device is moved away from
        an element. This attribute may be used with most elements.

        @param The script
    */
    public void setOnMouseOut(String script)
    {
        addAttribute ( "onMouseOut", script );
    }

    /**
        The onkeypress event occurs when a key is pressed and released over an
        element. This attribute may be used with most elements.
        
        @param The script
    */
    public void setOnKeyPress(String script)
    {
        addAttribute ( "onKeyPress", script );
    }

    /**
        The onkeydown event occurs when a key is pressed down over an element.
        This attribute may be used with most elements.
        
        @param The script
    */
    public void setOnKeyDown(String script)
    {
        addAttribute ( "onKeyDown", script );
    }

    /**
        The onkeyup event occurs when a key is released over an element. This
        attribute may be used with most elements.
        
        @param The script
    */
    public void setOnKeyUp(String script)
    {
        addAttribute ( "onKeyUp", script );
    }
}
