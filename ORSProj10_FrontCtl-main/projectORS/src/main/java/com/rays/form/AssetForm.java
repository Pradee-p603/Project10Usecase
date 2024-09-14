package com.rays.form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AssetDTO;
/*import com.rays.validation.ValidAlphabetic;
import com.rays.validation.ValidAlphabetic1;
import com.rays.validation.ValidDate;
import com.rays.validation.ValidDouble;
import com.rays.validation.ValidLong;*/

public class AssetForm extends BaseForm {

	@NotEmpty(message = "Please enter registrationNumber")
	private String registrationNumber;

	@NotNull(message = "Please enter acquisitionDate")
	private String acquisitionDate;

	@NotNull(message = "Please enter coverageAmount")
	private String coverageAmount;

	@NotEmpty(message = "Please enter paintColor")
	private String paintColor;

		public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(String coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public String getPaintColor() {
		return paintColor;
	}

	public void setPaintColor(String paintColor) {
		this.paintColor = paintColor;
	}

		@Override
	public BaseDTO getDto() {
		AssetDTO dto = initDTO(new AssetDTO());

		if (acquisitionDate != null && !acquisitionDate.isEmpty()) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date parsedDate = dateFormat.parse(acquisitionDate);
				dto.setAcquisitionDate(parsedDate);
				;
			} catch (ParseException e) {
				// Handle parse exception if needed
				e.printStackTrace();
			}
		}

		if (registrationNumber != null && !registrationNumber.isEmpty()) {
			dto.setRegistrationNumber(registrationNumber);
		}

		if (paintColor != null && !paintColor.isEmpty()) {
			dto.setPaintColor(paintColor);
		}

		if (coverageAmount != null && !coverageAmount.isEmpty()) {
			dto.setCoverageAmount(Long.valueOf(coverageAmount));
		}

		return dto;
	}
}