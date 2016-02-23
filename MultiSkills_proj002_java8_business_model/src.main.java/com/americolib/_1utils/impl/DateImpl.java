/** 
*	@author AmericoTomas 
*	@mail atafs@iscte-iul.pt
*/

package com.americolib._1utils.impl;

import java.util.Calendar;

import com.americolib._1utils.Date;

public class DateImpl implements Date{
	
	//CONSTRUCTOR
	public DateImpl() {
		super();
	}
	
	//INTERFACE
	public Date getNowMovedMinutes(int minutes){
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, minutes);
		return (Date)now.getTime();
	}
}


