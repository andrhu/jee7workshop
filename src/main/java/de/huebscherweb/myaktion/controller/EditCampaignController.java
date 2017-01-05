package de.huebscherweb.myaktion.controller;

import static de.huebscherweb.myaktion.controller.Pages.LIST_CAMPAIGNS;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.huebscherweb.myaktion.data.CampaignListProducer;
import de.huebscherweb.myaktion.data.CampaignProducer;

@Named
@SessionScoped
public class EditCampaignController implements Serializable {

	private static final long serialVersionUID = 5077377109934936774L;

	@Inject
	private CampaignListProducer campaignListProducer;
	@Inject
	private CampaignProducer campaignProducer;

	public String doSave() {
		if (campaignProducer.isAddMode()) {
			campaignListProducer.getCampaigns().add(campaignProducer.getSelectedCampaign());
		}
		return LIST_CAMPAIGNS;
	}

	public String doCancel() {
		return LIST_CAMPAIGNS;
	}

}
