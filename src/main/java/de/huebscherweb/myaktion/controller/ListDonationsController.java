package de.huebscherweb.myaktion.controller;

import static de.huebscherweb.myaktion.controller.Pages.LIST_CAMPAIGNS;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class ListDonationsController implements Serializable {

	private static final long serialVersionUID = -3363052769493118315L;

	public String doOk() {
		return LIST_CAMPAIGNS;
	}

}
