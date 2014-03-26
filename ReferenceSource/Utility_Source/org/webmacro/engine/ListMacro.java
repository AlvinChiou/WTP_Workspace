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


package org.webmacro.engine;

import java.util.*;
import java.io.*;
import org.webmacro.util.*;
import java.lang.reflect.*;
import org.webmacro.*;


/**
  * A list is a sequence of terms. It's used in two common cases:
  * the items in an array initializer; and the arguments to a 
  * method call. 
  */
class ListMacro implements Macro
{

   final private Object[] _content; // the list data

   /**
     * create a new list
     */
   ListMacro(Object[] content) {
      _content = content;
   }

   public void write(FastWriter out, Context context)
      throws PropertyException, IOException
   {
      out.write(evaluate(context).toString());
   }

   public String toString()
   {
      StringBuffer sb = new StringBuffer();
      sb.append("(");
      for(int i =0; i<_content.length; i++) {
         if (i != 0) {
            sb.append(", ");
         }
         sb.append(_content[i].toString());
      }
      sb.append(")");
      return sb.toString();
   }

   public Object evaluate(Context context) 
      throws PropertyException
   {
      Object[] ret = new Object[ _content.length ];
      for (int i = 0; i < _content.length; i++) {
         Object m = _content[i];
         if (m instanceof Macro) {
            m = ((Macro) m).evaluate(context);
         }
         ret[i] = m;
      }
      return ret;
   }
}