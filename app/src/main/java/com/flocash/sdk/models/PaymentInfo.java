package com.flocash.sdk.models;

import java.io.Serializable;

public class PaymentInfo  implements Serializable {
	private String flocashTxn;
	private String partnerTxn;
	private String partnerMessage;
	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getFlocashTxn() {
		return flocashTxn;
	}

	public void setFlocashTxn(String flocashTxn) {
		this.flocashTxn = flocashTxn;
	}

	public String getPartnerTxn() {
		return partnerTxn;
	}

	public void setPartnerTxn(String partnerTxn) {
		this.partnerTxn = partnerTxn;
	}

	public String getPartnerMessage() {
		return partnerMessage;
	}

	public void setPartnerMessage(String partnerMessage) {
		this.partnerMessage = partnerMessage;
	}
}
