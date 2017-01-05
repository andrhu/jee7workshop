package de.huebscherweb.myaktion.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.huebscherweb.myaktion.data.CampaignProducer;
import de.huebscherweb.myaktion.model.Campaign;

@SessionScoped
@Named
public class ListCampaignsController implements Serializable {

	private static final long serialVersionUID = -1359147747465347046L;

	@Inject
	private CampaignProducer campaignProducer;

	public String doAddCampaign() {
		System.out.println("Add campaign");
		campaignProducer.prepareAddCampaign();
		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditCampaign(Campaign campaign) {
		System.out.println("Edit campaign " + campaign);
		campaignProducer.prepareEditCampaign(campaign);
		return Pages.EDIT_CAMPAIGN;
	}

	public String doEditDonationForm(Campaign campaign) {
		System.out.println("Edit Donation form of campaign " + campaign);
		campaignProducer.setSelectedCampaign(campaign);
		return Pages.EDIT_DONATION_FORM;
	}

	public String doListDonations(Campaign campaign) {
		System.out.println("List Donations of campaign " + campaign);
		campaignProducer.setSelectedCampaign(campaign);
		return Pages.LIST_DONATIONS;
	}

	public void doDeleteCampaign(Campaign campaign) {
		System.out.println("Delete campaign " + campaign);
	}

}
