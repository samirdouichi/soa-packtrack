package org.sjo.stock.faces.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class CaptchaBean {

	public void submit(ActionEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
