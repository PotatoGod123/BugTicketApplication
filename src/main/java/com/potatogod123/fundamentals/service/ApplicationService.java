package com.potatogod123.fundamentals.service;


import com.potatogod123.fundamentals.entity.Application;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}


