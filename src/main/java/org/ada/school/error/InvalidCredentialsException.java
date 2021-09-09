package org.ada.school.error;

import org.ada.school.exception.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends InternalServerErrorException {

    public InvalidCredentialsException()
    {
        super( new ServerErrorResponseDto( "Invalid username or password", ErrorCodeEnum.INVALID_USER_CREDENTIALS,
                HttpStatus.UNAUTHORIZED ), HttpStatus.UNAUTHORIZED );
    }
}
