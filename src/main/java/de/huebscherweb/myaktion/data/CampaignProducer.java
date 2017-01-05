package de.huebscherweb.myaktion.data;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.huebscherweb.myaktion.model.Campaign;

@Named
@SessionScoped
public class CampaignProducer implements Serializable {

	private static final long serialVersionUID = -5250314059024244979L;

	private enum Mode {
		EDIT, ADD
	}

	private Campaign campaign;
	private Mode mode;

	public Campaign getSelectedCampaign() {
		return campaign;
	}

	public void setSelectedCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public boolean isAddMode() {
		return mode == Mode.ADD;
	}

	public void prepareAddCampaign() {
		this.campaign = new Campaign();
		this.mode = Mode.ADD;
	}

	public void prepareEditCampaign(Campaign campaign) {
		this.campaign = campaign;
		this.mode = Mode.EDIT;
	}

}
