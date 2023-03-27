package io.wdefassio.msclients.exception.handle;

import io.wdefassio.msclients.exception.InvalidCpfException;
import io.wdefassio.msclients.exception.StandardError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {

	@ExceptionHandler(InvalidCpfException.class)
	public ResponseEntity<StandardError> objectNotFound(InvalidCpfException ex, HttpServletRequest request) {
		StandardError error = new StandardError(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
	}


}
