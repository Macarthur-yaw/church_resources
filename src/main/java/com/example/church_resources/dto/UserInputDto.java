package com.example.church_resources.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class UserInputDto {
  @NotNull
  private String email;

}
