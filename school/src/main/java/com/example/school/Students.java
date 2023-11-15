package com.example.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Students {
    private String firstname;
    private String lastname;
    private String email;
}
