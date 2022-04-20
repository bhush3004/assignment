package com.assignment.validations;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContainerQuantityValidator implements ConstraintValidator<Quantity, Integer>{

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		
		return value > 1 || value >= 100;
	}

}
