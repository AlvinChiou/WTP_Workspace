/*
 * Copyright (C) 1998-2000 Semiotek Inc.  All Rights Reserved.  
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted under the terms of either of the following
 * Open Source licenses:
 *
 * The GNU General Public License, version 2, or any later version, as
 * published by the Free Software Foundation
 * (http://www.fsf.org/copyleft/gpl.html);
 *
 *  or 
 *
 * The Semiotek Public License (http://webmacro.org/LICENSE.)  
 *
 * This software is provided "as is", with NO WARRANTY, not even the 
 * implied warranties of fitness to purpose, or merchantability. You
 * assume all risks and liabilities associated with its use.
 *
 * See www.webmacro.org for more information on the WebMacro project.  
 */

package org.webmacro.servlet;
import org.webmacro.*;
import java.util.*;

/**
 * Provide templates a uniform way of dealing with arrays and Lists
 * 
 * @author Keats Kirsch
 * @version 1.0
 * @since Oct. 2000
 * @see ListUtil
 */
public class ListTool implements ContextTool
{
  public Object init(Context context) 
  {
    return ListUtil.getInstance();
  }

   public void destroy(Object o) { }
}
