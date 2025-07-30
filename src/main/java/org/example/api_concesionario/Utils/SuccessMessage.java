package org.example.api_concesionario.Utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessMessage <T> {
    private int status;
    private String message;
    private T data;
}
