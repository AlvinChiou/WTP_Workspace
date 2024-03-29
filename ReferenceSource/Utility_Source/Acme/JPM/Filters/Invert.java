// Invert - color-inversion filter
//
// Copyright (C) 1997 by Jef Poskanzer <jef@acme.com>.  All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//
// THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
// FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
// DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
// OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
// HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
// LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
// OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.
//
// Visit the ACME Labs Java page for up-to-date versions of this and other
// fine Java utilities: http://www.acme.com/java/

package Acme.JPM.Filters;

import java.awt.image.*;

/// Color-inversion filter.
// <P>
// Switches black for white, and all the other colors too.
// This filter is very fast.
// <P>
// <A HREF="/resources/classes/Acme/JPM/Filters/Invert.java">Fetch the software.</A><BR>
// <A HREF="/resources/classes/Acme.tar.Z">Fetch the entire Acme package.</A>

public class Invert extends RGBBlockFilter
    {

        /// Constructor.
    public Invert( ImageProducer producer )
	{
	super( producer );
	}


    public int[][] filterRGBBlock( int x, int y, int width, int height, int[][] rgbPixels )
	{
	for ( int row = 0; row < height; ++row )
	    for ( int col = 0; col < width; ++col )
		{
		int rgb = rgbPixels[row][col];
		int alpha = rgb & 0xff000000;
		int rest = ( ~ rgb ) & 0x00ffffff;
		rgbPixels[row][col] = alpha | rest;
		}
	return rgbPixels;
	}


    // Main routine for command-line interface.
    public static void main( String[] args )
	{
	ImageFilterPlus filter = null;
	if ( args.length == 0 )
	    filter = new Invert( null );
	else
	    usage();
	System.exit( 
	    ImageFilterPlus.filterStream( System.in, System.out, filter ) );
	}
    
    private static void usage()
	{
	System.err.println( "usage: Invert" );
	System.exit( 1 );
	}

    }
