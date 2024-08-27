package com.apptware.interview.immutability;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
public final class Student {

  private final String name;
  private final Date dateOfBirth;
  private final List<String> courses;

  public Date getDateOfBirth() {
    return new Date(dateOfBirth.getTime());
  }

  public List<String> getCourses() {
    return new ArrayList<>(courses);
  }
}