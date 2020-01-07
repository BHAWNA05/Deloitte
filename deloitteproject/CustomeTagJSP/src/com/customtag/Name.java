package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Name extends TagSupport {

	public Name() {
		// TODO Auto-generated constructor stub
	}
@Override
public int doStartTag() throws JspException {
	JspWriter out = pageContext.getOut();
     for(int i=0;i<=5;i++)
     {
    	 try {
			out.println("BHAWNA RAJPUT");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	
	
	
	return super.doStartTag();
}
	
	
	
}
