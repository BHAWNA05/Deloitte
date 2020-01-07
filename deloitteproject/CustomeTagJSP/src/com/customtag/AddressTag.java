package com.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddressTag extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
	    JspWriter out = pageContext.getOut();
	    try
	    {
	    	out.println("Deloitte<br/>");
	    	out.println("Block C<br/> Divyasree Technopolis<br/>");
	    	out.println("Survey no;123 & 132/2");
	    	out.println("Yemlur Post");
	    	out.println("Off Old Airport Road");
	    	out.println("Karnataka 560037");
	    	
	    	
	    }
	    catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
		return super.doStartTag();
	}
}
