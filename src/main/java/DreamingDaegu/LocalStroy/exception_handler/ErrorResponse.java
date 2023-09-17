package DreamingDaegu.LocalStroy.exception_handler;

import lombok.Data;

@Data
public class ErrorResponse {
    private String status;
    private String message;

    public ErrorResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
