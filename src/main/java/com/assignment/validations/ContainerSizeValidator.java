package com.assignment.validations;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContainerSizeValidator implements ConstraintValidator<ContainerSize, Integer>{

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		List list = Arrays.asList(new int[]{20,40});
		return list.contains(value);
	}

}
