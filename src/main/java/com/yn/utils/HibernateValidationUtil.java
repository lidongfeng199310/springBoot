package com.yn.utils;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * 该方法的作用就是校验参数,根据hibernateValidate的规则
 * @author lidongfeng
 *
 */
public class HibernateValidationUtil {
	
	
	
	private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
	private static Validator validator = validatorFactory.getValidator();
	
	/**
	 * 校验一个类中所有写有hibernateValidate的注解
	 * @param param  校验参数
	 * @param clasz  校验哪个类
	 * @return
	 */
	public <T> T validator(T param) {
		Set<ConstraintViolation<T>> set = validator.validate(param);
		if (set != null && !set.isEmpty()) {
			for (ConstraintViolation<T> constraintViolation : set) {
				constraintViolation.getMessage(); // 错误
				constraintViolation.getPropertyPath().toString(); // 字段
				System.out.println(constraintViolation.getPropertyPath().toString()+"\t"+constraintViolation.getMessage());
			}
		}
		return param;
	}
	
	/**
	 * 特定实例上的某个字段
	 * @param param   参数
	 * @param propertyName  属性名字
	 * @param groups  类组
	 * @return
	 */
	public  <T> T validateProperty(T param, String propertyName){
		Set<ConstraintViolation<T>> set = validator.validateProperty(param, propertyName);
		if (set != null && !set.isEmpty()) {
			for (ConstraintViolation<T> constraintViolation : set) {
				constraintViolation.getMessage(); // 错误
				constraintViolation.getPropertyPath().toString(); // 字段
				System.out.println(constraintViolation.getPropertyPath().toString()+"\t"+constraintViolation.getMessage());
			}
		}
		return param;
	}
	
//	/**
//	 * 使用某个类上的某个字段进行校验
//	 * @param beanType
//	 * @param propertyName
//	 * @param value
//	 * @param groups
//	 * @return
//	 */
//	public  <T> T validateValue(Class<T> beanType, String propertyName, Object value,Class< ?>... groups){
//		return (T) beanType;
//	}

	

}
