package intellispaces.ixora.structures.properties;

import tech.intellispacesframework.commons.exception.UnexpectedViolationException;

public class InvalidPropertyException extends UnexpectedViolationException {

  InvalidPropertyException(String messageTemplate, Object... messageParams) {
    super(messageTemplate, messageParams);
  }

  InvalidPropertyException(Throwable cause, String messageTemplate, Object... messageParams) {
    super(cause, messageTemplate, messageParams);
  }

  public static InvalidPropertyException withMessage(String messageTemplate, Object... messageParams) {
    return new InvalidPropertyException((Throwable)null, messageTemplate, messageParams);
  }

  public static InvalidPropertyException withCauseAndMessage(Throwable cause, String messageTemplate, Object... messageParams) {
    return new InvalidPropertyException(cause, messageTemplate, messageParams);
  }
}
