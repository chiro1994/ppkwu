package pl.chiro.validation.validators;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = pl.chiro.validation.validators.PeselValidator.class)
@Documented
public @interface ValidPesel {

	String message() default "Nieprawidlowy PESEL";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int min() default 11;
}